// $ANTLR 3.4 /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g 2017-03-21 19:35:37

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ARRAY_ACCESS=6;
    public static final int ARRAY_RANK=7;
    public static final int ASSIGN=8;
    public static final int COMMENT=9;
    public static final int EMODULE=10;
    public static final int ESC_SEQ=11;
    public static final int FUNCALL=12;
    public static final int ID=13;
    public static final int INPUT=14;
    public static final int LIST_INSTR=15;
    public static final int LIST_MODULES=16;
    public static final int MODULE=17;
    public static final int NUM=18;
    public static final int OR=19;
    public static final int OUTPUT=20;
    public static final int PARAMS=21;
    public static final int STRING=22;
    public static final int WIRE=23;
    public static final int WS=24;
    public static final int XOR=25;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:6:7: ( '(' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:6:9: '('
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:7:7: ( ')' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:7:9: ')'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:8:7: ( ',' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:8:9: ','
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:9:7: ( ':' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:9:9: ':'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:10:7: ( ';' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:10:9: ';'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:11:7: ( '[' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:11:9: '['
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:12:7: ( ']' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:12:9: ']'
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
    // $ANTLR end "T__32"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:107:9: ( 'module' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:107:11: 'module'
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:108:9: ( 'endmodule' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:108:11: 'endmodule'
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:109:9: ( 'input' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:109:11: 'input'
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:110:9: ( 'output' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:110:11: 'output'
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:111:9: ( 'wire' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:111:11: 'wire'
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

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:112:9: ( '=' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:112:11: '='
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:113:9: ( '^' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:113:11: '^'
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:114:9: ( '|' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:114:11: '|'
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:115:9: ( '&' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:115:11: '&'
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:116:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:116:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:116:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:117:9: ( ( '0' .. '9' )+ )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:117:11: ( '0' .. '9' )+
            {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:117:11: ( '0' .. '9' )+
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
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:122:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:122:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:122:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:
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


                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:122:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:122:30: '\\r'
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
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:123:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:123:13: ( options {greedy=false; } : . )*
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
                    	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:123:41: .
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:127:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:127:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:127:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:127:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:127:28: ~ ( '\\\\' | '\"' )
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:133:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:133:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:136:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:136:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | MODULE | EMODULE | INPUT | OUTPUT | WIRE | ASSIGN | XOR | OR | AND | ID | NUM | COMMENT | STRING | WS )
        int alt8=21;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt8=1;
            }
            break;
        case ')':
            {
            alt8=2;
            }
            break;
        case ',':
            {
            alt8=3;
            }
            break;
        case ':':
            {
            alt8=4;
            }
            break;
        case ';':
            {
            alt8=5;
            }
            break;
        case '[':
            {
            alt8=6;
            }
            break;
        case ']':
            {
            alt8=7;
            }
            break;
        case 'm':
            {
            int LA8_8 = input.LA(2);

            if ( (LA8_8=='o') ) {
                int LA8_22 = input.LA(3);

                if ( (LA8_22=='d') ) {
                    int LA8_27 = input.LA(4);

                    if ( (LA8_27=='u') ) {
                        int LA8_32 = input.LA(5);

                        if ( (LA8_32=='l') ) {
                            int LA8_37 = input.LA(6);

                            if ( (LA8_37=='e') ) {
                                int LA8_42 = input.LA(7);

                                if ( (LA8_42=='$'||(LA8_42 >= '0' && LA8_42 <= '9')||(LA8_42 >= 'A' && LA8_42 <= 'Z')||LA8_42=='_'||(LA8_42 >= 'a' && LA8_42 <= 'z')) ) {
                                    alt8=17;
                                }
                                else {
                                    alt8=8;
                                }
                            }
                            else {
                                alt8=17;
                            }
                        }
                        else {
                            alt8=17;
                        }
                    }
                    else {
                        alt8=17;
                    }
                }
                else {
                    alt8=17;
                }
            }
            else {
                alt8=17;
            }
            }
            break;
        case 'e':
            {
            int LA8_9 = input.LA(2);

            if ( (LA8_9=='n') ) {
                int LA8_23 = input.LA(3);

                if ( (LA8_23=='d') ) {
                    int LA8_28 = input.LA(4);

                    if ( (LA8_28=='m') ) {
                        int LA8_33 = input.LA(5);

                        if ( (LA8_33=='o') ) {
                            int LA8_38 = input.LA(6);

                            if ( (LA8_38=='d') ) {
                                int LA8_43 = input.LA(7);

                                if ( (LA8_43=='u') ) {
                                    int LA8_47 = input.LA(8);

                                    if ( (LA8_47=='l') ) {
                                        int LA8_49 = input.LA(9);

                                        if ( (LA8_49=='e') ) {
                                            int LA8_50 = input.LA(10);

                                            if ( (LA8_50=='$'||(LA8_50 >= '0' && LA8_50 <= '9')||(LA8_50 >= 'A' && LA8_50 <= 'Z')||LA8_50=='_'||(LA8_50 >= 'a' && LA8_50 <= 'z')) ) {
                                                alt8=17;
                                            }
                                            else {
                                                alt8=9;
                                            }
                                        }
                                        else {
                                            alt8=17;
                                        }
                                    }
                                    else {
                                        alt8=17;
                                    }
                                }
                                else {
                                    alt8=17;
                                }
                            }
                            else {
                                alt8=17;
                            }
                        }
                        else {
                            alt8=17;
                        }
                    }
                    else {
                        alt8=17;
                    }
                }
                else {
                    alt8=17;
                }
            }
            else {
                alt8=17;
            }
            }
            break;
        case 'i':
            {
            int LA8_10 = input.LA(2);

            if ( (LA8_10=='n') ) {
                int LA8_24 = input.LA(3);

                if ( (LA8_24=='p') ) {
                    int LA8_29 = input.LA(4);

                    if ( (LA8_29=='u') ) {
                        int LA8_34 = input.LA(5);

                        if ( (LA8_34=='t') ) {
                            int LA8_39 = input.LA(6);

                            if ( (LA8_39=='$'||(LA8_39 >= '0' && LA8_39 <= '9')||(LA8_39 >= 'A' && LA8_39 <= 'Z')||LA8_39=='_'||(LA8_39 >= 'a' && LA8_39 <= 'z')) ) {
                                alt8=17;
                            }
                            else {
                                alt8=10;
                            }
                        }
                        else {
                            alt8=17;
                        }
                    }
                    else {
                        alt8=17;
                    }
                }
                else {
                    alt8=17;
                }
            }
            else {
                alt8=17;
            }
            }
            break;
        case 'o':
            {
            int LA8_11 = input.LA(2);

            if ( (LA8_11=='u') ) {
                int LA8_25 = input.LA(3);

                if ( (LA8_25=='t') ) {
                    int LA8_30 = input.LA(4);

                    if ( (LA8_30=='p') ) {
                        int LA8_35 = input.LA(5);

                        if ( (LA8_35=='u') ) {
                            int LA8_40 = input.LA(6);

                            if ( (LA8_40=='t') ) {
                                int LA8_45 = input.LA(7);

                                if ( (LA8_45=='$'||(LA8_45 >= '0' && LA8_45 <= '9')||(LA8_45 >= 'A' && LA8_45 <= 'Z')||LA8_45=='_'||(LA8_45 >= 'a' && LA8_45 <= 'z')) ) {
                                    alt8=17;
                                }
                                else {
                                    alt8=11;
                                }
                            }
                            else {
                                alt8=17;
                            }
                        }
                        else {
                            alt8=17;
                        }
                    }
                    else {
                        alt8=17;
                    }
                }
                else {
                    alt8=17;
                }
            }
            else {
                alt8=17;
            }
            }
            break;
        case 'w':
            {
            int LA8_12 = input.LA(2);

            if ( (LA8_12=='i') ) {
                int LA8_26 = input.LA(3);

                if ( (LA8_26=='r') ) {
                    int LA8_31 = input.LA(4);

                    if ( (LA8_31=='e') ) {
                        int LA8_36 = input.LA(5);

                        if ( (LA8_36=='$'||(LA8_36 >= '0' && LA8_36 <= '9')||(LA8_36 >= 'A' && LA8_36 <= 'Z')||LA8_36=='_'||(LA8_36 >= 'a' && LA8_36 <= 'z')) ) {
                            alt8=17;
                        }
                        else {
                            alt8=12;
                        }
                    }
                    else {
                        alt8=17;
                    }
                }
                else {
                    alt8=17;
                }
            }
            else {
                alt8=17;
            }
            }
            break;
        case '=':
            {
            alt8=13;
            }
            break;
        case '^':
            {
            alt8=14;
            }
            break;
        case '|':
            {
            alt8=15;
            }
            break;
        case '&':
            {
            alt8=16;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'f':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt8=17;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt8=18;
            }
            break;
        case '/':
            {
            alt8=19;
            }
            break;
        case '\"':
            {
            alt8=20;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt8=21;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 8, 0, input);

            throw nvae;

        }

        switch (alt8) {
            case 1 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:10: T__26
                {
                mT__26(); 


                }
                break;
            case 2 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:16: T__27
                {
                mT__27(); 


                }
                break;
            case 3 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:22: T__28
                {
                mT__28(); 


                }
                break;
            case 4 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:28: T__29
                {
                mT__29(); 


                }
                break;
            case 5 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:34: T__30
                {
                mT__30(); 


                }
                break;
            case 6 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:40: T__31
                {
                mT__31(); 


                }
                break;
            case 7 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:46: T__32
                {
                mT__32(); 


                }
                break;
            case 8 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:52: MODULE
                {
                mMODULE(); 


                }
                break;
            case 9 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:59: EMODULE
                {
                mEMODULE(); 


                }
                break;
            case 10 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:67: INPUT
                {
                mINPUT(); 


                }
                break;
            case 11 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:73: OUTPUT
                {
                mOUTPUT(); 


                }
                break;
            case 12 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:80: WIRE
                {
                mWIRE(); 


                }
                break;
            case 13 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:85: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 14 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:92: XOR
                {
                mXOR(); 


                }
                break;
            case 15 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:96: OR
                {
                mOR(); 


                }
                break;
            case 16 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:99: AND
                {
                mAND(); 


                }
                break;
            case 17 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:103: ID
                {
                mID(); 


                }
                break;
            case 18 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:106: NUM
                {
                mNUM(); 


                }
                break;
            case 19 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:110: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 20 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:118: STRING
                {
                mSTRING(); 


                }
                break;
            case 21 :
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:1:125: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}