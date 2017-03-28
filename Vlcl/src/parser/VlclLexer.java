// $ANTLR 3.4 /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g 2017-03-28 19:13:58

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VlclLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ARRAY_ACCESS=6;
    public static final int ARRAY_RANK=7;
    public static final int ASSIGN=8;
    public static final int BEGIN=9;
    public static final int CASE=10;
    public static final int COMMENT=11;
    public static final int DEFAULT=12;
    public static final int ELSE=13;
    public static final int EMODULE=14;
    public static final int END=15;
    public static final int ENDCASE=16;
    public static final int ESC_SEQ=17;
    public static final int FUNCALL=18;
    public static final int ID=19;
    public static final int IF=20;
    public static final int INPUT=21;
    public static final int LIST_INSTR=22;
    public static final int LIST_MODULES=23;
    public static final int MODULE=24;
    public static final int NUM=25;
    public static final int OR=26;
    public static final int OUTPUT=27;
    public static final int PARAMS=28;
    public static final int STRING=29;
    public static final int WIRE=30;
    public static final int WS=31;
    public static final int XOR=32;

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
    public String getGrammarFileName() { return "/home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g"; }

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:6:7: ( '(' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:6:9: '('
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:7:7: ( ')' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:7:9: ')'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:8:7: ( ',' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:8:9: ','
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:9:7: ( ':' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:9:9: ':'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:10:7: ( ';' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:10:9: ';'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:11:7: ( '[' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:11:9: '['
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:12:7: ( ']' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:12:9: ']'
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
    // $ANTLR end "T__39"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:135:9: ( 'module' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:135:11: 'module'
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

    // $ANTLR start "EMODULE"
    public final void mEMODULE() throws RecognitionException {
        try {
            int _type = EMODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:136:9: ( 'endmodule' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:136:11: 'endmodule'
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
    // $ANTLR end "EMODULE"

    // $ANTLR start "INPUT"
    public final void mINPUT() throws RecognitionException {
        try {
            int _type = INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:137:9: ( 'input' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:137:11: 'input'
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
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:138:9: ( 'output' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:138:11: 'output'
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

    // $ANTLR start "WIRE"
    public final void mWIRE() throws RecognitionException {
        try {
            int _type = WIRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:139:9: ( 'wire' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:139:11: 'wire'
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

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:140:9: ( 'if' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:140:11: 'if'
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
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:141:9: ( 'else' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:141:11: 'else'
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
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:142:9: ( 'case' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:142:11: 'case'
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
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:143:9: ( 'default' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:143:11: 'default'
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
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:144:9: ( 'endcase' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:144:11: 'endcase'
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

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:145:9: ( 'begin' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:145:11: 'begin'
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
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:146:9: ( 'end' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:146:11: 'end'
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

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:147:9: ( '=' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:147:11: '='
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
    // $ANTLR end "ASSIGN"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:148:9: ( '^' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:148:11: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:149:9: ( '|' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:149:11: '|'
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
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:150:9: ( '&' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:150:11: '&'
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
    // $ANTLR end "AND"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:151:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:151:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:151:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:
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
            	    break loop1;
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

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:152:9: ( ( '0' .. '9' )+ )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:152:11: ( '0' .. '9' )+
            {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:152:11: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:157:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:157:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:157:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:
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
                    	    break loop3;
                        }
                    } while (true);


                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:157:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:157:30: '\\r'
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
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:158:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:158:16: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:158:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:162:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:162:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:162:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:162:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:162:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:168:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:168:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:171:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:171:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | MODULE | EMODULE | INPUT | OUTPUT | WIRE | IF | ELSE | CASE | DEFAULT | ENDCASE | BEGIN | END | ASSIGN | XOR | OR | AND | ID | NUM | COMMENT | STRING | WS )
        int alt8=28;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:10: T__33
                {
                mT__33(); 


                }
                break;
            case 2 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:16: T__34
                {
                mT__34(); 


                }
                break;
            case 3 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:22: T__35
                {
                mT__35(); 


                }
                break;
            case 4 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:28: T__36
                {
                mT__36(); 


                }
                break;
            case 5 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:34: T__37
                {
                mT__37(); 


                }
                break;
            case 6 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:40: T__38
                {
                mT__38(); 


                }
                break;
            case 7 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:46: T__39
                {
                mT__39(); 


                }
                break;
            case 8 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:52: MODULE
                {
                mMODULE(); 


                }
                break;
            case 9 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:59: EMODULE
                {
                mEMODULE(); 


                }
                break;
            case 10 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:67: INPUT
                {
                mINPUT(); 


                }
                break;
            case 11 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:73: OUTPUT
                {
                mOUTPUT(); 


                }
                break;
            case 12 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:80: WIRE
                {
                mWIRE(); 


                }
                break;
            case 13 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:85: IF
                {
                mIF(); 


                }
                break;
            case 14 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:88: ELSE
                {
                mELSE(); 


                }
                break;
            case 15 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:93: CASE
                {
                mCASE(); 


                }
                break;
            case 16 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:98: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 17 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:106: ENDCASE
                {
                mENDCASE(); 


                }
                break;
            case 18 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:114: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 19 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:120: END
                {
                mEND(); 


                }
                break;
            case 20 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:124: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 21 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:131: XOR
                {
                mXOR(); 


                }
                break;
            case 22 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:135: OR
                {
                mOR(); 


                }
                break;
            case 23 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:138: AND
                {
                mAND(); 


                }
                break;
            case 24 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:142: ID
                {
                mID(); 


                }
                break;
            case 25 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:145: NUM
                {
                mNUM(); 


                }
                break;
            case 26 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:149: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 27 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:157: STRING
                {
                mSTRING(); 


                }
                break;
            case 28 :
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:1:164: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\10\uffff\10\24\11\uffff\4\24\1\47\6\24\1\60\2\24\1\uffff\10\24"+
        "\1\uffff\1\73\2\24\1\76\1\77\5\24\1\uffff\1\105\1\24\2\uffff\1\24"+
        "\1\110\1\111\2\24\1\uffff\1\114\1\24\2\uffff\1\24\1\117\1\uffff"+
        "\1\120\1\24\2\uffff\1\122\1\uffff";
    static final String DFA8_eofS =
        "\123\uffff";
    static final String DFA8_minS =
        "\1\11\7\uffff\1\157\1\154\1\146\1\165\1\151\1\141\2\145\11\uffff"+
        "\2\144\1\163\1\160\1\44\1\164\1\162\1\163\1\146\1\147\1\165\1\44"+
        "\1\145\1\165\1\uffff\1\160\2\145\1\141\1\151\1\154\1\157\1\141\1"+
        "\uffff\1\44\1\164\1\165\2\44\1\165\1\156\1\145\1\144\1\163\1\uffff"+
        "\1\44\1\164\2\uffff\1\154\2\44\1\165\1\145\1\uffff\1\44\1\164\2"+
        "\uffff\1\154\1\44\1\uffff\1\44\1\145\2\uffff\1\44\1\uffff";
    static final String DFA8_maxS =
        "\1\174\7\uffff\1\157\2\156\1\165\1\151\1\141\2\145\11\uffff\2\144"+
        "\1\163\1\160\1\172\1\164\1\162\1\163\1\146\1\147\1\165\1\172\1\145"+
        "\1\165\1\uffff\1\160\2\145\1\141\1\151\1\154\1\157\1\141\1\uffff"+
        "\1\172\1\164\1\165\2\172\1\165\1\156\1\145\1\144\1\163\1\uffff\1"+
        "\172\1\164\2\uffff\1\154\2\172\1\165\1\145\1\uffff\1\172\1\164\2"+
        "\uffff\1\154\1\172\1\uffff\1\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\10\uffff\1\24\1\25\1\26\1\27"+
        "\1\30\1\31\1\32\1\33\1\34\16\uffff\1\15\10\uffff\1\23\12\uffff\1"+
        "\16\2\uffff\1\14\1\17\5\uffff\1\12\2\uffff\1\22\1\10\2\uffff\1\13"+
        "\2\uffff\1\21\1\20\1\uffff\1\11";
    static final String DFA8_specialS =
        "\123\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\uffff\1\27\3\uffff\1\23\1"+
            "\uffff\1\1\1\2\2\uffff\1\3\2\uffff\1\26\12\25\1\4\1\5\1\uffff"+
            "\1\20\3\uffff\32\24\1\6\1\uffff\1\7\1\21\1\24\1\uffff\1\24\1"+
            "\17\1\15\1\16\1\11\3\24\1\12\3\24\1\10\1\24\1\13\7\24\1\14\3"+
            "\24\1\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31",
            "\1\33\1\uffff\1\32",
            "\1\35\7\uffff\1\34",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\2\24"+
            "\1\57\11\24\1\56\15\24",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\74",
            "\1\75",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\106",
            "",
            "",
            "\1\107",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\112",
            "\1\113",
            "",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\115",
            "",
            "",
            "\1\116",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\121",
            "",
            "",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | MODULE | EMODULE | INPUT | OUTPUT | WIRE | IF | ELSE | CASE | DEFAULT | ENDCASE | BEGIN | END | ASSIGN | XOR | OR | AND | ID | NUM | COMMENT | STRING | WS );";
        }
    }
 

}