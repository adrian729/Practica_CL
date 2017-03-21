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

grammar Asl;

options {
    output = AST;
    ASTLabelType = AslTree;
}

// Imaginary tokens to create some AST nodes

tokens {
    LIST_MODULES; // List of modules (the root of the tree)
    PARAMS;     // List of parameters in the declaration of a function
    FUNCALL;    // Function call
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    ARRAY_RANK;
    ARRAY_ACCESS;
}

@header {
package parser;
import interp.AslTree;
}

@lexer::header {
package parser;
}


// A program is a list of functions
prog	: mod+ EOF -> ^(LIST_MODULES mod+)
        ;

mod: MODULE^ ID params block_instructions EMODULE! ;

params  : '(' varslist? ')' -> ^(PARAMS varslist?)
        ;

varslist: ID (','! ID)*
        ;

block_instructions:
        (instruction ';')+ -> ^(LIST_INSTR instruction+)
        ;

//Mirar com va aixo en Verilog.
instruction:
        declaration
        | funcall
        | assignation
        ;

declaration: (INPUT^|OUTPUT^|WIRE^) array_dec varslist ;

array_dec: '[' NUM ':' NUM ']' -> ^(ARRAY_RANK NUM NUM) ;

funcall : ID ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

expr_list: (ID|array_access) (','! (ID|array_access))* ;

array_access  
        :   ID ac='[' NUM ']' -> ^(ARRAY_ACCESS[$ac,"ARRAY_ACCESS"] ID NUM)
        ;

assignation: ID ASSIGN bool_or ;

bool_or: bool_xor (OR^ bool_xor)* ;

bool_xor: bool_and (XOR^ bool_and)* ;

bool_and: bool_atom (AND^ bool_atom)* ;

bool_atom: 
        ID 
        | '('! bool_or ')'!
        ;

// Basic tokens
MODULE  : 'module' ;
EMODULE : 'endmodule' ;
INPUT   : 'input' ;
OUTPUT  : 'output' ;
WIRE    : 'wire' ;
ASSIGN  : '=' ;
XOR     : '^' ;
OR      : '|' ;
AND     : '&' ;
ID      : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')* ;
NUM     : ('0'..'9')+ ;



// C-style comments
COMMENT	: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    	| '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

// Strings (in quotes) with escape sequences        
STRING  :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
        ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS  	: ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    	;


