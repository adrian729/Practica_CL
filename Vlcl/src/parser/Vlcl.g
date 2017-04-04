/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/*
 *
 * Gramàtica feta a partir de la plantilla de Jordi Cortadella per Adrià Sánchez
 * Albanell i Belén San Martín Díez.
 *
*/

grammar Vlcl;

options {
    output = AST;
    ASTLabelType = VlclTree;
}

// Imaginary tokens to create some AST nodes

tokens {    
    LIST_MODULES;       // List of modules (the root of the tree)
    LIST_INSTR;         // Block of instructions
    LIST_STMTS;         // Block of statements
    PARAMS;             // List of parameters in a call
    ARG_LIST;           // List of arguments passed in a function call
    ARRAY_ACCESS;       // Access to an array bit
    PART_ARRAY_ACCESS;  // Access to an array set of consecutive bits
    ARRAY_RANGE;        // Range of an array    
    CONCAT;             // Concatenation of wires
    CONCAT_MULT;        // Repetirion of a concat parameter
    ASSIGNATION;        // Assignation to a variable
    CASE_ITEM;          // case struct item
    MODULE;             // Module call
    FUNCALL;            // Function call
    NUM_CONST;             //Number distinc
}

@header {
    package parser;
    import interp.VlclTree;
}

@lexer::header {
    package parser;
}


// A program is composed by modules

prog    : mod+ EOF -> ^(LIST_MODULES mod+)
        ;

// Moduls

mod     : MODULE! ID^ params ';'! block_instructions ENDMODULE! 
        ;

// Instruccions i declaracions

block_instructions
        : (instruction)* -> ^(LIST_INSTR instruction*)
        ;

block_stmts
        : (statement)* -> ^(LIST_STMTS statement*)
        ;

instruction
        : signal_dec 
        | var_dec
        | param_dec
        | mod_dec
        | func_dec
        | statement
        ;

statement
        : assign
        | assignation_stmt
        | ifelse_stmt
        | case_stmt
        | for_loop
        ;

// Instruccions

//TODO: mirar si no es millor canviar els "array_dec?" per que surtin amb capçalera a l'arbre
signal_dec
        : (INPUT^ | OUTPUT^ | INOUT^) array_dec? varslist ';'!
        ;

var_dec : REG^ array_dec? varslist ';'!
        | WIRE^ array_dec? (in_assign | varslist) ';'!
        ;

param_dec
        : PARAMETER^ array_dec? in_assign (','! in_assign)* ';'!
        ;

in_assign
        : ID ASSIGNSIMBOL expr -> ^(ASSIGNATION ID expr)
        ;

mod_dec : ID ID call_params ';' -> ^(MODULE ID ID call_params)
        ;

func_dec: FUNCTION^ array_dec? ID ';'! func_init beginend_stmt ENDFUNCTION!
        ;

func_init
        : (func_input | var_dec)*
        ;

func_input
        : (INPUT^ | INOUT^) array_dec? varslist ';'!
        ;

// Declaracions - Estructures de control

assign  : ASSIGN^ (array_dec ID | concat_expr) ASSIGNSIMBOL! expr ';'!
        ;

assignation_stmt
        : (ID | array_acces) ASSIGNSIMBOL^ expr ';'!
        ;

beginend_stmt
        : BEGIN! block_stmts END!
        ;

ifelse_stmt  
        : IF^ '('! expr ')'! intern_stmt_bloc else_stmt?
        ;

else_stmt
        : ELSE^ (ifelse_stmt | intern_stmt_bloc)
        ; // TODO: aixo no m'agrada

case_stmt
        : CASE^ '('! expr ')'! (case_item)+ (default_item)? ENDCASE!
        ;

case_item
        : case_opts ':' beginend_stmt -> ^(CASE_ITEM case_opts beginend_stmt)
        ;

case_opts
        : (ID | number) (','! (ID | number))*
        ;

default_item
        : DEFAULT ':' beginend_stmt -> ^(CASE_ITEM DEFAULT beginend_stmt)
        ;

for_loop: FOR^ '('! for_index ';'! for_condition ';'! for_increment ')'! intern_stmt_bloc
        ;//TODO: for molt simple/limitat, mirar si el volem extendre a mes general
            //TODO: no mola que nomes pugui seguirlo un if_stmt_bloc, pero si no peta el ifelse.. mirar d'arreglar-ho
for_index
        : ID ASSIGNSIMBOL^ PLUS? NUM
        ;

for_condition
        : ID COMP^ (PLUS? NUM | ID) 
        ;

for_increment
        : ID ASSIGNSIMBOL^ (ID PLUS^ (ID | PLUS? NUM))
        ;

funcall : ID arg='(' callvarslist? ')' -> ^(FUNCALL ID ^(ARG_LIST[$arg, "ARG_LIST"] callvarslist?))
        ;

intern_stmt_bloc
        : assign
        | assignation_stmt
        | case_stmt
        | for_loop
        | beginend_stmt
        ;

// General

params  : '(' varslist ')' -> ^(PARAMS varslist)
        ;

varslist: ID (','! ID)*
        ;

call_params
        : '(' callvarslist? ')' -> ^(PARAMS callvarslist?)
        ;

callvarslist
        : varcall (','! varcall)*
        ;

varcall :
        ID
        | array_acces
        ;


array_dec
        : '[' NUM ':' NUM ']' -> ^(ARRAY_RANGE NUM NUM)
        ;

array_acces
        : ID '[' acces_expr ']' -> ^(ARRAY_ACCESS ID acces_expr)
        ;

acces_expr
        : expr (':' expr -> ^(PART_ARRAY_ACCESS expr expr)
               |         -> expr
               )
        ;

// Expressions

expr    : logic_or_expr (COND^ cond_expr)?
        ;

cond_expr
        : logic_or_expr ':'! logic_or_expr
        ;

logic_or_expr
        : logic_and_expr (OR^ logic_and_expr)*
        ;

logic_and_expr
        : bw_or_expr (AND^ bw_or_expr)*
        ;

bw_or_expr
        : bw_xor_expr (ORBW^ bw_xor_expr)*
        ;

bw_xor_expr
        : bw_and_expr (XORS^ bw_and_expr)*
        ;

bw_and_expr
        : eq_expr (ANDBW^ eq_expr)*
        ;

eq_expr : comp_expr (EQ^ comp_expr)*
        ;

comp_expr
        : shift_expr (COMP^ shift_expr)*
        ;

shift_expr
        : plus_expr (SHIFT^ NUM)?
        ;

plus_expr
        : term_expr (PLUS^ term_expr)*
        ;

term_expr
        : concat_expr (TERM^ concat_expr)*
        ;

concat_expr
        : unari_expr
        | num_mult? '{' concat_params '}' -> ^(CONCAT num_mult? concat_params)
        ;

num_mult: NUM -> ^(CONCAT_MULT NUM)
        ;

concat_params
        : expr (','! expr)*
        ;

unari_expr
        : red_expr
        ;

red_expr: (ANDBW^ | ORBW^ | XORS^ | NAND^ | NOR^)? bitlogic_neg
        ;

bitlogic_neg
        : (NOT^ | NOTBW^)? paren_expr
        ;

paren_expr
        : PLUS? (atom | '('! expr ')'!)
        ;

atom    :
        ID
        | array_acces
        | funcall
        | number
        ;

// Numbers

number  : base_num
        | NUM
        | NUM base_num -> ^(NUM_CONST NUM base_num?)
        ;
base_num: (BIN | OCT | DEC | HEX)
        ;


// Basic tokens

//modul
MODULE  : 'module' ;
ENDMODULE : 'endmodule' ;

// Declaracio de senyals
INPUT   : 'input' ;
OUTPUT  : 'output' ;
INOUT   : 'inout' ;

// Tipus de dades
WIRE    : 'wire' ;
REG     : 'reg' ;
PARAMETER: 'parameter' ;

// Estructures de control
BEGIN   : 'begin' ;
END     : 'end' ;

IF      : 'if' ;
ELSE    : 'else' ;

CASE    : 'case' ;
DEFAULT : 'default' ;
ENDCASE : 'endcase' ;

FOR     : 'for' ;

FUNCTION: 'function' ;
ENDFUNCTION: 'endfunction' ;

// Assignacio
ASSIGN  : 'assign' ;
ASSIGNSIMBOL: '=' ;

// Operadors
PLUS    : '+' | '-' ;
TERM    : '/' | '*' | '%' ;

SHIFT   : '<<' | '>>' ;

ANDBW   : '&' ;
ORBW    : '|' ;
XORS    : '^' | '~^' | '^~' ;
NAND    : '~&' ;
NOR     : '~|' ;
NOTBW   : '~' ;


AND     : '&&' ;
OR      : '||' ;
NOT     : '!' ;

COMP    : '<' | '>' | '<=' | '>=' ;
EQ      : '==' | '!=' ;

COND    : '?' ;

// Numbers
NUM     : '0'..'9'+ ;
BIN     : '\'b' ('0'|'1'|'x'|'X'|'z'|'Z')+ ('_' ('0'|'1'|'x'|'X'|'z'|'Z')+)* ;
OCT     : '\'o' ('0'..'7')+ ('_' ('0'..'7')+)* ;
DEC     : '\'d' ('0'..'9')+ ('_' ('0'..'9')+)* ;
HEX     : '\'h' ('0'..'9'|'A'..'F'|'a'..'f')+ ('_' ('0'..'9'|'A'..'F'|'a'..'f')+)* ;

ID      : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')* ;


// Altres:

// C-style comments
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
        | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
        ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
        ;
