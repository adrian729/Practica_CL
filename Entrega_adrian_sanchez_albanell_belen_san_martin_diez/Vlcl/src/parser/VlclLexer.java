// $ANTLR 3.4 /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g 2017-04-07 20:28:14

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VlclLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int AND=4;
    public static final int ANDBW=5;
    public static final int ARG_LIST=6;
    public static final int ARRAY_ACCESS=7;
    public static final int ARRAY_RANGE=8;
    public static final int ASSIGN=9;
    public static final int ASSIGNATION=10;
    public static final int ASSIGNSIMBOL=11;
    public static final int BEGIN=12;
    public static final int BIN=13;
    public static final int CASE=14;
    public static final int CASE_ITEM=15;
    public static final int COMMENT=16;
    public static final int COMP=17;
    public static final int CONCAT=18;
    public static final int CONCAT_MULT=19;
    public static final int COND=20;
    public static final int DEC=21;
    public static final int DEFAULT=22;
    public static final int ELSE=23;
    public static final int END=24;
    public static final int ENDCASE=25;
    public static final int ENDFUNCTION=26;
    public static final int ENDMODULE=27;
    public static final int EQ=28;
    public static final int ESC_SEQ=29;
    public static final int FOR=30;
    public static final int FUNCALL=31;
    public static final int FUNCTION=32;
    public static final int HEX=33;
    public static final int ID=34;
    public static final int IF=35;
    public static final int INOUT=36;
    public static final int INPUT=37;
    public static final int LIST_INSTR=38;
    public static final int LIST_MODULES=39;
    public static final int LIST_STMTS=40;
    public static final int MODULE=41;
    public static final int NAND=42;
    public static final int NOR=43;
    public static final int NOT=44;
    public static final int NOTBW=45;
    public static final int NUM=46;
    public static final int NUM_CONST=47;
    public static final int OCT=48;
    public static final int OR=49;
    public static final int ORBW=50;
    public static final int OUTPUT=51;
    public static final int PARAMETER=52;
    public static final int PARAMS=53;
    public static final int PART_ARRAY_ACCESS=54;
    public static final int PLUS=55;
    public static final int REG=56;
    public static final int SHIFT=57;
    public static final int TERM=58;
    public static final int WIRE=59;
    public static final int WS=60;
    public static final int XORS=61;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public VlclLexer() {} 
    public VlclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public VlclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g"; }

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:6:7: ( '(' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:7:7: ( ')' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:8:7: ( ',' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:9:7: ( ':' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:9:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:10:7: ( ';' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:11:7: ( '[' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:11:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:12:7: ( ']' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:12:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:13:7: ( '{' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:14:7: ( '}' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:336:9: ( 'module' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:336:11: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "ENDMODULE"
    public final void mENDMODULE() throws RecognitionException {
        try {
            int _type = ENDMODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:337:11: ( 'endmodule' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:337:13: 'endmodule'
            {
            match("endmodule"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDMODULE"

    // $ANTLR start "INPUT"
    public final void mINPUT() throws RecognitionException {
        try {
            int _type = INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:340:9: ( 'input' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:340:11: 'input'
            {
            match("input"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INPUT"

    // $ANTLR start "OUTPUT"
    public final void mOUTPUT() throws RecognitionException {
        try {
            int _type = OUTPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:341:9: ( 'output' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:341:11: 'output'
            {
            match("output"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUTPUT"

    // $ANTLR start "INOUT"
    public final void mINOUT() throws RecognitionException {
        try {
            int _type = INOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:342:9: ( 'inout' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:342:11: 'inout'
            {
            match("inout"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INOUT"

    // $ANTLR start "WIRE"
    public final void mWIRE() throws RecognitionException {
        try {
            int _type = WIRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:345:9: ( 'wire' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:345:11: 'wire'
            {
            match("wire"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WIRE"

    // $ANTLR start "REG"
    public final void mREG() throws RecognitionException {
        try {
            int _type = REG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:346:9: ( 'reg' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:346:11: 'reg'
            {
            match("reg"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REG"

    // $ANTLR start "PARAMETER"
    public final void mPARAMETER() throws RecognitionException {
        try {
            int _type = PARAMETER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:347:10: ( 'parameter' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:347:12: 'parameter'
            {
            match("parameter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARAMETER"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:350:9: ( 'begin' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:350:11: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:351:9: ( 'end' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:351:11: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:353:9: ( 'if' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:353:11: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:354:9: ( 'else' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:354:11: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:356:9: ( 'case' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:356:11: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:357:9: ( 'default' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:357:11: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "ENDCASE"
    public final void mENDCASE() throws RecognitionException {
        try {
            int _type = ENDCASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:358:9: ( 'endcase' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:358:11: 'endcase'
            {
            match("endcase"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDCASE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:360:9: ( 'for' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:360:11: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:362:9: ( 'function' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:362:11: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "ENDFUNCTION"
    public final void mENDFUNCTION() throws RecognitionException {
        try {
            int _type = ENDFUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:363:12: ( 'endfunction' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:363:14: 'endfunction'
            {
            match("endfunction"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNCTION"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:366:9: ( 'assign' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:366:11: 'assign'
            {
            match("assign"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "ASSIGNSIMBOL"
    public final void mASSIGNSIMBOL() throws RecognitionException {
        try {
            int _type = ASSIGNSIMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:367:13: ( '=' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:367:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGNSIMBOL"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:370:9: ( '+' | '-' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "TERM"
    public final void mTERM() throws RecognitionException {
        try {
            int _type = TERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:371:9: ( '/' | '*' | '%' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TERM"

    // $ANTLR start "SHIFT"
    public final void mSHIFT() throws RecognitionException {
        try {
            int _type = SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:373:9: ( '<<' | '>>' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='<') ) {
                alt1=1;
            }
            else if ( (LA1_0=='>') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:373:11: '<<'
                    {
                    match("<<"); 



                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:373:18: '>>'
                    {
                    match(">>"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT"

    // $ANTLR start "ANDBW"
    public final void mANDBW() throws RecognitionException {
        try {
            int _type = ANDBW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:375:9: ( '&' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:375:11: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANDBW"

    // $ANTLR start "ORBW"
    public final void mORBW() throws RecognitionException {
        try {
            int _type = ORBW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:376:9: ( '|' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:376:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORBW"

    // $ANTLR start "XORS"
    public final void mXORS() throws RecognitionException {
        try {
            int _type = XORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:377:9: ( '^' | '~^' | '^~' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='~') ) {
                    alt2=3;
                }
                else {
                    alt2=1;
                }
            }
            else if ( (LA2_0=='~') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:377:11: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:377:17: '~^'
                    {
                    match("~^"); 



                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:377:24: '^~'
                    {
                    match("^~"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XORS"

    // $ANTLR start "NAND"
    public final void mNAND() throws RecognitionException {
        try {
            int _type = NAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:378:9: ( '~&' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:378:11: '~&'
            {
            match("~&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAND"

    // $ANTLR start "NOR"
    public final void mNOR() throws RecognitionException {
        try {
            int _type = NOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:379:9: ( '~|' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:379:11: '~|'
            {
            match("~|"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOR"

    // $ANTLR start "NOTBW"
    public final void mNOTBW() throws RecognitionException {
        try {
            int _type = NOTBW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:380:9: ( '~' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:380:11: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTBW"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:383:9: ( '&&' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:383:11: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:384:9: ( '||' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:384:11: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:385:9: ( '!' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:385:11: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "COMP"
    public final void mCOMP() throws RecognitionException {
        try {
            int _type = COMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:387:9: ( '<' | '>' | '<=' | '>=' )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='=') ) {
                    alt3=3;
                }
                else {
                    alt3=1;
                }
            }
            else if ( (LA3_0=='>') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=2;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:387:11: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:387:17: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:387:23: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:387:30: '>='
                    {
                    match(">="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMP"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:388:9: ( '==' | '!=' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='=') ) {
                alt4=1;
            }
            else if ( (LA4_0=='!') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:388:11: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:388:18: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "COND"
    public final void mCOND() throws RecognitionException {
        try {
            int _type = COND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:390:9: ( '?' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:390:11: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COND"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:393:9: ( ( '0' .. '9' )+ )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:393:11: ( '0' .. '9' )+
            {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:393:11: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "BIN"
    public final void mBIN() throws RecognitionException {
        try {
            int _type = BIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:394:9: ( '\\'b' ( '0' | '1' | 'x' | 'X' | 'z' | 'Z' )+ ( '_' ( '0' | '1' | 'x' | 'X' | 'z' | 'Z' )+ )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:394:11: '\\'b' ( '0' | '1' | 'x' | 'X' | 'z' | 'Z' )+ ( '_' ( '0' | '1' | 'x' | 'X' | 'z' | 'Z' )+ )*
            {
            match("'b"); 



            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:394:17: ( '0' | '1' | 'x' | 'X' | 'z' | 'Z' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '1')||LA6_0=='X'||LA6_0=='Z'||LA6_0=='x'||LA6_0=='z') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='Z'||input.LA(1)=='x'||input.LA(1)=='z' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:394:44: ( '_' ( '0' | '1' | 'x' | 'X' | 'z' | 'Z' )+ )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='_') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:394:45: '_' ( '0' | '1' | 'x' | 'X' | 'z' | 'Z' )+
            	    {
            	    match('_'); 

            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:394:49: ( '0' | '1' | 'x' | 'X' | 'z' | 'Z' )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0 >= '0' && LA7_0 <= '1')||LA7_0=='X'||LA7_0=='Z'||LA7_0=='x'||LA7_0=='z') ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='Z'||input.LA(1)=='x'||input.LA(1)=='z' ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIN"

    // $ANTLR start "OCT"
    public final void mOCT() throws RecognitionException {
        try {
            int _type = OCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:395:9: ( '\\'o' ( '0' .. '7' )+ ( '_' ( '0' .. '7' )+ )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:395:11: '\\'o' ( '0' .. '7' )+ ( '_' ( '0' .. '7' )+ )*
            {
            match("'o"); 



            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:395:17: ( '0' .. '7' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '7')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:395:29: ( '_' ( '0' .. '7' )+ )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='_') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:395:30: '_' ( '0' .. '7' )+
            	    {
            	    match('_'); 

            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:395:34: ( '0' .. '7' )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( ((LA10_0 >= '0' && LA10_0 <= '7')) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCT"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:396:9: ( '\\'d' ( '0' .. '9' )+ ( '_' ( '0' .. '9' )+ )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:396:11: '\\'d' ( '0' .. '9' )+ ( '_' ( '0' .. '9' )+ )*
            {
            match("'d"); 



            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:396:17: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:396:29: ( '_' ( '0' .. '9' )+ )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='_') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:396:30: '_' ( '0' .. '9' )+
            	    {
            	    match('_'); 

            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:396:34: ( '0' .. '9' )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:397:9: ( '\\'h' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ ( '_' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:397:11: '\\'h' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ ( '_' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )*
            {
            match("'h"); 



            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:397:17: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'F')||(LA15_0 >= 'a' && LA15_0 <= 'f')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:397:47: ( '_' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='_') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:397:48: '_' ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            	    {
            	    match('_'); 

            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:397:52: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( ((LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'A' && LA16_0 <= 'F')||(LA16_0 >= 'a' && LA16_0 <= 'f')) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:399:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:399:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:399:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='$'||(LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:405:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='/') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='/') ) {
                    alt22=1;
                }
                else if ( (LA22_1=='*') ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:405:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:405:16: (~ ( '\\n' | '\\r' ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:405:30: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:405:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:406:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:406:16: ( options {greedy=false; } : . )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='*') ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1=='/') ) {
                                alt21=2;
                            }
                            else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '.')||(LA21_1 >= '0' && LA21_1 <= '\uFFFF')) ) {
                                alt21=1;
                            }


                        }
                        else if ( ((LA21_0 >= '\u0000' && LA21_0 <= ')')||(LA21_0 >= '+' && LA21_0 <= '\uFFFF')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:406:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:412:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:412:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:415:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:415:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:8: ( T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | MODULE | ENDMODULE | INPUT | OUTPUT | INOUT | WIRE | REG | PARAMETER | BEGIN | END | IF | ELSE | CASE | DEFAULT | ENDCASE | FOR | FUNCTION | ENDFUNCTION | ASSIGN | ASSIGNSIMBOL | PLUS | TERM | SHIFT | ANDBW | ORBW | XORS | NAND | NOR | NOTBW | AND | OR | NOT | COMP | EQ | COND | NUM | BIN | OCT | DEC | HEX | ID | COMMENT | WS )
        int alt23=52;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:10: T__62
                {
                mT__62(); 


                }
                break;
            case 2 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:16: T__63
                {
                mT__63(); 


                }
                break;
            case 3 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:22: T__64
                {
                mT__64(); 


                }
                break;
            case 4 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:28: T__65
                {
                mT__65(); 


                }
                break;
            case 5 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:34: T__66
                {
                mT__66(); 


                }
                break;
            case 6 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:40: T__67
                {
                mT__67(); 


                }
                break;
            case 7 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:46: T__68
                {
                mT__68(); 


                }
                break;
            case 8 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:52: T__69
                {
                mT__69(); 


                }
                break;
            case 9 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:58: T__70
                {
                mT__70(); 


                }
                break;
            case 10 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:64: MODULE
                {
                mMODULE(); 


                }
                break;
            case 11 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:71: ENDMODULE
                {
                mENDMODULE(); 


                }
                break;
            case 12 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:81: INPUT
                {
                mINPUT(); 


                }
                break;
            case 13 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:87: OUTPUT
                {
                mOUTPUT(); 


                }
                break;
            case 14 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:94: INOUT
                {
                mINOUT(); 


                }
                break;
            case 15 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:100: WIRE
                {
                mWIRE(); 


                }
                break;
            case 16 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:105: REG
                {
                mREG(); 


                }
                break;
            case 17 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:109: PARAMETER
                {
                mPARAMETER(); 


                }
                break;
            case 18 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:119: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 19 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:125: END
                {
                mEND(); 


                }
                break;
            case 20 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:129: IF
                {
                mIF(); 


                }
                break;
            case 21 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:132: ELSE
                {
                mELSE(); 


                }
                break;
            case 22 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:137: CASE
                {
                mCASE(); 


                }
                break;
            case 23 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:142: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 24 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:150: ENDCASE
                {
                mENDCASE(); 


                }
                break;
            case 25 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:158: FOR
                {
                mFOR(); 


                }
                break;
            case 26 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:162: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 27 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:171: ENDFUNCTION
                {
                mENDFUNCTION(); 


                }
                break;
            case 28 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:183: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 29 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:190: ASSIGNSIMBOL
                {
                mASSIGNSIMBOL(); 


                }
                break;
            case 30 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:203: PLUS
                {
                mPLUS(); 


                }
                break;
            case 31 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:208: TERM
                {
                mTERM(); 


                }
                break;
            case 32 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:213: SHIFT
                {
                mSHIFT(); 


                }
                break;
            case 33 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:219: ANDBW
                {
                mANDBW(); 


                }
                break;
            case 34 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:225: ORBW
                {
                mORBW(); 


                }
                break;
            case 35 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:230: XORS
                {
                mXORS(); 


                }
                break;
            case 36 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:235: NAND
                {
                mNAND(); 


                }
                break;
            case 37 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:240: NOR
                {
                mNOR(); 


                }
                break;
            case 38 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:244: NOTBW
                {
                mNOTBW(); 


                }
                break;
            case 39 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:250: AND
                {
                mAND(); 


                }
                break;
            case 40 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:254: OR
                {
                mOR(); 


                }
                break;
            case 41 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:257: NOT
                {
                mNOT(); 


                }
                break;
            case 42 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:261: COMP
                {
                mCOMP(); 


                }
                break;
            case 43 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:266: EQ
                {
                mEQ(); 


                }
                break;
            case 44 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:269: COND
                {
                mCOND(); 


                }
                break;
            case 45 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:274: NUM
                {
                mNUM(); 


                }
                break;
            case 46 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:278: BIN
                {
                mBIN(); 


                }
                break;
            case 47 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:282: OCT
                {
                mOCT(); 


                }
                break;
            case 48 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:286: DEC
                {
                mDEC(); 


                }
                break;
            case 49 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:290: HEX
                {
                mHEX(); 


                }
                break;
            case 50 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:294: ID
                {
                mID(); 


                }
                break;
            case 51 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:297: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 52 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:1:305: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\12\uffff\14\43\1\66\1\uffff\1\44\2\71\1\73\1\75\1\uffff\1\100\1"+
        "\101\6\uffff\4\43\1\113\12\43\21\uffff\1\43\1\132\3\43\1\uffff\2"+
        "\43\1\140\4\43\1\145\6\43\1\uffff\1\154\3\43\1\160\1\uffff\2\43"+
        "\1\163\1\43\1\uffff\6\43\1\uffff\1\173\1\174\1\43\1\uffff\1\43\1"+
        "\177\1\uffff\3\43\1\u0083\3\43\2\uffff\1\u0087\1\43\1\uffff\2\43"+
        "\1\u008b\1\uffff\1\43\1\u008d\1\43\1\uffff\1\43\1\u0090\1\43\1\uffff"+
        "\1\43\1\uffff\2\43\1\uffff\1\u0095\1\u0096\1\43\1\u0098\2\uffff"+
        "\1\43\1\uffff\1\u009a\1\uffff";
    static final String DFA23_eofS =
        "\u009b\uffff";
    static final String DFA23_minS =
        "\1\11\11\uffff\1\157\1\154\1\146\1\165\1\151\1\145\1\141\1\145\1"+
        "\141\1\145\1\157\1\163\1\75\1\uffff\1\52\1\74\1\76\1\46\1\174\1"+
        "\uffff\1\46\1\75\2\uffff\1\142\3\uffff\2\144\1\163\1\157\1\44\1"+
        "\164\1\162\1\147\1\162\1\147\1\163\1\146\1\162\1\156\1\163\21\uffff"+
        "\1\165\1\44\1\145\2\165\1\uffff\1\160\1\145\1\44\1\141\1\151\1\145"+
        "\1\141\1\44\1\143\1\151\1\154\1\157\1\141\1\165\1\uffff\1\44\2\164"+
        "\1\165\1\44\1\uffff\1\155\1\156\1\44\1\165\1\uffff\1\164\1\147\1"+
        "\145\1\144\1\163\1\156\1\uffff\2\44\1\164\1\uffff\1\145\1\44\1\uffff"+
        "\1\154\1\151\1\156\1\44\1\165\1\145\1\143\2\uffff\1\44\1\164\1\uffff"+
        "\1\164\1\157\1\44\1\uffff\1\154\1\44\1\164\1\uffff\1\145\1\44\1"+
        "\156\1\uffff\1\145\1\uffff\1\151\1\162\1\uffff\2\44\1\157\1\44\2"+
        "\uffff\1\156\1\uffff\1\44\1\uffff";
    static final String DFA23_maxS =
        "\1\176\11\uffff\1\157\2\156\1\165\1\151\1\145\1\141\1\145\1\141"+
        "\1\145\1\165\1\163\1\75\1\uffff\1\57\1\74\1\76\1\46\1\174\1\uffff"+
        "\1\174\1\75\2\uffff\1\157\3\uffff\2\144\1\163\1\160\1\172\1\164"+
        "\1\162\1\147\1\162\1\147\1\163\1\146\1\162\1\156\1\163\21\uffff"+
        "\1\165\1\172\1\145\2\165\1\uffff\1\160\1\145\1\172\1\141\1\151\1"+
        "\145\1\141\1\172\1\143\1\151\1\154\1\157\1\141\1\165\1\uffff\1\172"+
        "\2\164\1\165\1\172\1\uffff\1\155\1\156\1\172\1\165\1\uffff\1\164"+
        "\1\147\1\145\1\144\1\163\1\156\1\uffff\2\172\1\164\1\uffff\1\145"+
        "\1\172\1\uffff\1\154\1\151\1\156\1\172\1\165\1\145\1\143\2\uffff"+
        "\1\172\1\164\1\uffff\1\164\1\157\1\172\1\uffff\1\154\1\172\1\164"+
        "\1\uffff\1\145\1\172\1\156\1\uffff\1\145\1\uffff\1\151\1\162\1\uffff"+
        "\2\172\1\157\1\172\2\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\15\uffff\1\36\5\uffff"+
        "\1\43\2\uffff\1\54\1\55\1\uffff\1\62\1\37\1\64\17\uffff\1\53\1\35"+
        "\1\63\1\40\1\52\1\47\1\41\1\50\1\42\1\44\1\45\1\46\1\51\1\56\1\57"+
        "\1\60\1\61\5\uffff\1\24\16\uffff\1\23\5\uffff\1\20\4\uffff\1\31"+
        "\6\uffff\1\25\3\uffff\1\17\2\uffff\1\26\7\uffff\1\14\1\16\2\uffff"+
        "\1\22\3\uffff\1\12\3\uffff\1\15\3\uffff\1\34\1\uffff\1\30\2\uffff"+
        "\1\27\4\uffff\1\32\1\13\1\uffff\1\21\1\uffff\1\33";
    static final String DFA23_specialS =
        "\u009b\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\1\37\3\uffff\1\44\1\33\1\42"+
            "\1\1\1\2\1\44\1\27\1\3\1\27\1\uffff\1\30\12\41\1\4\1\5\1\31"+
            "\1\26\1\32\1\40\1\uffff\32\43\1\6\1\uffff\1\7\1\35\1\43\1\uffff"+
            "\1\25\1\21\1\22\1\23\1\13\1\24\2\43\1\14\3\43\1\12\1\43\1\15"+
            "\1\20\1\43\1\17\4\43\1\16\3\43\1\10\1\34\1\11\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\50\1\uffff\1\47",
            "\1\52\7\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\5\uffff\1\63",
            "\1\64",
            "\1\65",
            "",
            "\1\67\4\uffff\1\67",
            "\1\70",
            "\1\70",
            "\1\72",
            "\1\74",
            "",
            "\1\76\67\uffff\1\35\35\uffff\1\77",
            "\1\65",
            "",
            "",
            "\1\102\1\uffff\1\104\3\uffff\1\105\6\uffff\1\103",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\112\1\111",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\2\43"+
            "\1\130\2\43\1\131\6\43\1\127\15\43",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\161",
            "\1\162",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\175",
            "",
            "\1\176",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\u008c",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u0091",
            "",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u0097",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "\1\u0099",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | MODULE | ENDMODULE | INPUT | OUTPUT | INOUT | WIRE | REG | PARAMETER | BEGIN | END | IF | ELSE | CASE | DEFAULT | ENDCASE | FOR | FUNCTION | ENDFUNCTION | ASSIGN | ASSIGNSIMBOL | PLUS | TERM | SHIFT | ANDBW | ORBW | XORS | NAND | NOR | NOTBW | AND | OR | NOT | COMP | EQ | COND | NUM | BIN | OCT | DEC | HEX | ID | COMMENT | WS );";
        }
    }
 

}