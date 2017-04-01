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

grammar Vlcl;

options {
    output = AST;
    ASTLabelType = VlclTree;
}

// Imaginary tokens to create some AST nodes

tokens {
    LIST_MODULES; // List of modules (the root of the tree)
    PARAMS;     // List of parameters in the declaration of a function
    FUNCALL;    // Function call
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    ARRAY_RANGE;
    ARRAY_ACCESS;
    PART_ARRAY_ACCESS;
    ASSIGNATION;
    CONCAT;
    CASE_ITEM;
}

@header {
    package parser;
    import interp.VlclTree;
}

@lexer::header {
    package parser;
}


// A program is a list of functions
prog    : mod+ EOF -> ^(LIST_MODULES mod+)
        ;

// Moduls

mod     : MODULE^ ID params ';'! block_instructions ENDMODULE! 
        ;

// Instruccions

block_instructions:
        (instruction)* -> ^(LIST_INSTR instruction*)
        ;

instruction
        : signal_dec 
        | var_dec
        | param_dec
        | mod_dec
        | assign
        | assignation
        | ifelse_stmt
        | case_stmt
        | for_loop
        | func_dec
        | funcall
        ;//TODO

funcall : ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

expr_list: varcall (','! varcall)* ;

// Declaracions

signal_dec
        : (INPUT^ | OUTPUT^ | INOUT^) array_dec? varslist ';'!
        ;

var_dec : (WIRE^ | REG^) array_dec? varslist ';'!
        ;

param_dec
        : PARAMETER^ array_dec? param_assig (','! param_assig)* ';'!
        ;

param_assig
        : ID ASSIGNATION expr -> ^(ASSIGNATION ID expr)
        ;

mod_dec : ID ID call_params ';'!
        ;

assign  : 'assign'
        ;

assignation 
        : 'assignation'
        ; //TODO

func_dec: FUNCTION^ array_dec? ID ';'! func_init beginend_stmt ENDFUNCTION!
        ;

func_init
        : ((INPUT^ | INOUT^) array_dec? varslist ';'! | var_dec)*
        ;

// Estructures de control

beginend_stmt
        : BEGIN! block_instructions END!
        ;

ifelse_stmt  
        : IF^ '('! expr ')'! beginend_stmt (ELSE^ (ifelse_stmt | beginend_stmt))?
        ;

case_stmt: CASE^ '('! expr ')'! (case_item)+ (default_item)?
        ;

case_item: expr c=':' beginend_stmt -> ^(CASE_ITEM[$c,"CASE_ITEM"] expr beginend_stmt)
        ;

default_item: DEFAULT c=':' beginend_stmt -> ^(CASE_ITEM[$c,"CASE_ITEM"] DEFAULT beginend_stmt)
        ;

for_loop: 'for'
        ;//TODO

// General

array_dec
        : '[' NUM ':' NUM ']' -> ^(ARRAY_RANGE NUM NUM)
        ;

params  : '(' varslist ')' -> ^(PARAMS varslist)
        ;

varslist: ID (','! ID)*
        ;

call_params
        : '(' callvarslist? ')' -> ^(PARAMS callvarslist?)
        ;

callvarslist
        : varcall (',' varcall)*
        ;

varcall :
        ID 
        | array_acces
        ;

array_acces
        : ID ac='[' acces_expr ']' -> ^(ARRAY_ACCESS[$ac,"ARRAY_ACCESS"] ID acces_expr)
        ;

acces_expr
        : expr (pac=':' expr -> ^(PART_ARRAY_ACCESS[$pac, "PART_ARRAY_ACCESS"] expr expr)
               |             -> expr
               )
        ;

// Expressions
expr    : logic_or_expr (COND^ logic_or_expr ':'^ logic_or_expr )?
        ; //TODO

logic_or_expr
        : bw_and_expr (OR^ bw_and_expr)*
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
        | num_rep? cct='{' concat_params '}' -> ^(CONCAT[$cct, "CONCAT"] num_rep? concat_params)
        ;

num_rep : MTZ
        ;

concat_params
        : expr (',' expr)*
        ;

unari_expr
        : PLUS^? red_expr
        ;

red_expr: (ANDBW^ | ORBW^ | XORS^ | NAND^ | NOR^)? bitlogic_neg
        ;

bitlogic_neg
        : (NOT^ | NOTBW^)? paren_expr
        ;

paren_expr
        : atom 
        | '('! expr ')'!
        ;

atom    :
        ID
        | array_acces
        | number
        ;

// Numbers
number  :
        (BIN | OCT | DEC | HEX)
        | NUM (BIN | OCT | DEC | HEX)?
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

FUNCTION: 'function' ;
ENDFUNCTION: 'endfunction' ;

// Assignacio
ASSIGN  : 'assign' ;
ASSIGNATION: '=' ;

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

COMP    : '[><]''='? ;
EQ      : '[=!]''=' ;

COND    : '?' ;

// Numbers
MTZ     : ('1'..'9') ('0'..'9')* ;
NUM     : ('0'..'9')+ ('_' ('0'..'9')+)* ;
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
