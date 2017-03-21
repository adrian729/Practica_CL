// $ANTLR 3.4 /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g 2017-03-21 19:35:37

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ARRAY_ACCESS", "ARRAY_RANK", "ASSIGN", "COMMENT", "EMODULE", "ESC_SEQ", "FUNCALL", "ID", "INPUT", "LIST_INSTR", "LIST_MODULES", "MODULE", "NUM", "OR", "OUTPUT", "PARAMS", "STRING", "WIRE", "WS", "XOR", "'('", "')'", "','", "':'", "';'", "'['", "']'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:58:1: prog : ( mod )+ EOF -> ^( LIST_MODULES ( mod )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.mod_return mod1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod");
        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:58:6: ( ( mod )+ EOF -> ^( LIST_MODULES ( mod )+ ) )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:58:8: ( mod )+ EOF
            {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:58:8: ( mod )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==MODULE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:58:8: mod
            	    {
            	    pushFollow(FOLLOW_mod_in_prog128);
            	    mod1=mod();

            	    state._fsp--;

            	    stream_mod.add(mod1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog131);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: mod
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 58:17: -> ^( LIST_MODULES ( mod )+ )
            {
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:58:20: ^( LIST_MODULES ( mod )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_MODULES, "LIST_MODULES")
                , root_1);

                if ( !(stream_mod.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_mod.hasNext() ) {
                    adaptor.addChild(root_1, stream_mod.nextTree());

                }
                stream_mod.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class mod_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mod"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:61:1: mod : MODULE ^ ID params block_instructions EMODULE !;
    public final AslParser.mod_return mod() throws RecognitionException {
        AslParser.mod_return retval = new AslParser.mod_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODULE3=null;
        Token ID4=null;
        Token EMODULE7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree MODULE3_tree=null;
        AslTree ID4_tree=null;
        AslTree EMODULE7_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:61:4: ( MODULE ^ ID params block_instructions EMODULE !)
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:61:6: MODULE ^ ID params block_instructions EMODULE !
            {
            root_0 = (AslTree)adaptor.nil();


            MODULE3=(Token)match(input,MODULE,FOLLOW_MODULE_in_mod156); 
            MODULE3_tree = 
            (AslTree)adaptor.create(MODULE3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODULE3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_mod159); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_mod161);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_mod163);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            EMODULE7=(Token)match(input,EMODULE,FOLLOW_EMODULE_in_mod165); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mod"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:63:1: params : '(' ( varslist )? ')' -> ^( PARAMS ( varslist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.varslist_return varslist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_varslist=new RewriteRuleSubtreeStream(adaptor,"rule varslist");
        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:63:9: ( '(' ( varslist )? ')' -> ^( PARAMS ( varslist )? ) )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:63:11: '(' ( varslist )? ')'
            {
            char_literal8=(Token)match(input,26,FOLLOW_26_in_params176);  
            stream_26.add(char_literal8);


            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:63:15: ( varslist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:63:15: varslist
                    {
                    pushFollow(FOLLOW_varslist_in_params178);
                    varslist9=varslist();

                    state._fsp--;

                    stream_varslist.add(varslist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,27,FOLLOW_27_in_params181);  
            stream_27.add(char_literal10);


            // AST REWRITE
            // elements: varslist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 63:29: -> ^( PARAMS ( varslist )? )
            {
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:63:32: ^( PARAMS ( varslist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:63:41: ( varslist )?
                if ( stream_varslist.hasNext() ) {
                    adaptor.addChild(root_1, stream_varslist.nextTree());

                }
                stream_varslist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class varslist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varslist"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:66:1: varslist : ID ( ',' ! ID )* ;
    public final AslParser.varslist_return varslist() throws RecognitionException {
        AslParser.varslist_return retval = new AslParser.varslist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID11=null;
        Token char_literal12=null;
        Token ID13=null;

        AslTree ID11_tree=null;
        AslTree char_literal12_tree=null;
        AslTree ID13_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:66:9: ( ID ( ',' ! ID )* )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:66:11: ID ( ',' ! ID )*
            {
            root_0 = (AslTree)adaptor.nil();


            ID11=(Token)match(input,ID,FOLLOW_ID_in_varslist206); 
            ID11_tree = 
            (AslTree)adaptor.create(ID11)
            ;
            adaptor.addChild(root_0, ID11_tree);


            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:66:14: ( ',' ! ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:66:15: ',' ! ID
            	    {
            	    char_literal12=(Token)match(input,28,FOLLOW_28_in_varslist209); 

            	    ID13=(Token)match(input,ID,FOLLOW_ID_in_varslist212); 
            	    ID13_tree = 
            	    (AslTree)adaptor.create(ID13)
            	    ;
            	    adaptor.addChild(root_0, ID13_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varslist"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:69:1: block_instructions : ( instruction ';' )+ -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal15=null;
        AslParser.instruction_return instruction14 =null;


        AslTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:69:19: ( ( instruction ';' )+ -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:70:9: ( instruction ';' )+
            {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:70:9: ( instruction ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= ID && LA4_0 <= INPUT)||LA4_0==OUTPUT||LA4_0==WIRE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:70:10: instruction ';'
            	    {
            	    pushFollow(FOLLOW_instruction_in_block_instructions239);
            	    instruction14=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction14.getTree());

            	    char_literal15=(Token)match(input,30,FOLLOW_30_in_block_instructions241);  
            	    stream_30.add(char_literal15);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 70:28: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:70:31: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:74:1: instruction : ( declaration | funcall | assignation );
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.declaration_return declaration16 =null;

        AslParser.funcall_return funcall17 =null;

        AslParser.assignation_return assignation18 =null;



        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:74:12: ( declaration | funcall | assignation )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INPUT||LA5_0==OUTPUT||LA5_0==WIRE) ) {
                alt5=1;
            }
            else if ( (LA5_0==ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==ID) ) {
                    alt5=2;
                }
                else if ( (LA5_2==ASSIGN) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:75:9: declaration
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_instruction277);
                    declaration16=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration16.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:76:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction289);
                    funcall17=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall17.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:77:11: assignation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_instruction301);
                    assignation18=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation18.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class declaration_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:80:1: declaration : ( INPUT ^| OUTPUT ^| WIRE ^) array_dec varslist ;
    public final AslParser.declaration_return declaration() throws RecognitionException {
        AslParser.declaration_return retval = new AslParser.declaration_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INPUT19=null;
        Token OUTPUT20=null;
        Token WIRE21=null;
        AslParser.array_dec_return array_dec22 =null;

        AslParser.varslist_return varslist23 =null;


        AslTree INPUT19_tree=null;
        AslTree OUTPUT20_tree=null;
        AslTree WIRE21_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:80:12: ( ( INPUT ^| OUTPUT ^| WIRE ^) array_dec varslist )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:80:14: ( INPUT ^| OUTPUT ^| WIRE ^) array_dec varslist
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:80:14: ( INPUT ^| OUTPUT ^| WIRE ^)
            int alt6=3;
            switch ( input.LA(1) ) {
            case INPUT:
                {
                alt6=1;
                }
                break;
            case OUTPUT:
                {
                alt6=2;
                }
                break;
            case WIRE:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:80:15: INPUT ^
                    {
                    INPUT19=(Token)match(input,INPUT,FOLLOW_INPUT_in_declaration318); 
                    INPUT19_tree = 
                    (AslTree)adaptor.create(INPUT19)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(INPUT19_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:80:22: OUTPUT ^
                    {
                    OUTPUT20=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_declaration321); 
                    OUTPUT20_tree = 
                    (AslTree)adaptor.create(OUTPUT20)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(OUTPUT20_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:80:30: WIRE ^
                    {
                    WIRE21=(Token)match(input,WIRE,FOLLOW_WIRE_in_declaration324); 
                    WIRE21_tree = 
                    (AslTree)adaptor.create(WIRE21)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(WIRE21_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_array_dec_in_declaration328);
            array_dec22=array_dec();

            state._fsp--;

            adaptor.addChild(root_0, array_dec22.getTree());

            pushFollow(FOLLOW_varslist_in_declaration330);
            varslist23=varslist();

            state._fsp--;

            adaptor.addChild(root_0, varslist23.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class array_dec_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_dec"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:82:1: array_dec : '[' NUM ':' NUM ']' -> ^( ARRAY_RANK NUM NUM ) ;
    public final AslParser.array_dec_return array_dec() throws RecognitionException {
        AslParser.array_dec_return retval = new AslParser.array_dec_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal24=null;
        Token NUM25=null;
        Token char_literal26=null;
        Token NUM27=null;
        Token char_literal28=null;

        AslTree char_literal24_tree=null;
        AslTree NUM25_tree=null;
        AslTree char_literal26_tree=null;
        AslTree NUM27_tree=null;
        AslTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:82:10: ( '[' NUM ':' NUM ']' -> ^( ARRAY_RANK NUM NUM ) )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:82:12: '[' NUM ':' NUM ']'
            {
            char_literal24=(Token)match(input,31,FOLLOW_31_in_array_dec338);  
            stream_31.add(char_literal24);


            NUM25=(Token)match(input,NUM,FOLLOW_NUM_in_array_dec340);  
            stream_NUM.add(NUM25);


            char_literal26=(Token)match(input,29,FOLLOW_29_in_array_dec342);  
            stream_29.add(char_literal26);


            NUM27=(Token)match(input,NUM,FOLLOW_NUM_in_array_dec344);  
            stream_NUM.add(NUM27);


            char_literal28=(Token)match(input,32,FOLLOW_32_in_array_dec346);  
            stream_32.add(char_literal28);


            // AST REWRITE
            // elements: NUM, NUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 82:32: -> ^( ARRAY_RANK NUM NUM )
            {
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:82:35: ^( ARRAY_RANK NUM NUM )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARRAY_RANK, "ARRAY_RANK")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NUM.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_NUM.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_dec"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:84:1: funcall : ID ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID29=null;
        Token ID30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        AslParser.expr_list_return expr_list32 =null;


        AslTree ID29_tree=null;
        AslTree ID30_tree=null;
        AslTree char_literal31_tree=null;
        AslTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:84:9: ( ID ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:84:11: ID ID '(' ( expr_list )? ')'
            {
            ID29=(Token)match(input,ID,FOLLOW_ID_in_funcall365);  
            stream_ID.add(ID29);


            ID30=(Token)match(input,ID,FOLLOW_ID_in_funcall367);  
            stream_ID.add(ID30);


            char_literal31=(Token)match(input,26,FOLLOW_26_in_funcall369);  
            stream_26.add(char_literal31);


            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:84:21: ( expr_list )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:84:21: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall371);
                    expr_list32=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list32.getTree());

                    }
                    break;

            }


            char_literal33=(Token)match(input,27,FOLLOW_27_in_funcall374);  
            stream_27.add(char_literal33);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 84:36: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:84:39: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:84:52: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:84:62: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:1: expr_list : ( ID | array_access ) ( ',' ! ( ID | array_access ) )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID34=null;
        Token char_literal36=null;
        Token ID37=null;
        AslParser.array_access_return array_access35 =null;

        AslParser.array_access_return array_access38 =null;


        AslTree ID34_tree=null;
        AslTree char_literal36_tree=null;
        AslTree ID37_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:10: ( ( ID | array_access ) ( ',' ! ( ID | array_access ) )* )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:12: ( ID | array_access ) ( ',' ! ( ID | array_access ) )*
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:12: ( ID | array_access )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==31) ) {
                    alt8=2;
                }
                else if ( ((LA8_1 >= 27 && LA8_1 <= 28)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:13: ID
                    {
                    ID34=(Token)match(input,ID,FOLLOW_ID_in_expr_list406); 
                    ID34_tree = 
                    (AslTree)adaptor.create(ID34)
                    ;
                    adaptor.addChild(root_0, ID34_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:16: array_access
                    {
                    pushFollow(FOLLOW_array_access_in_expr_list408);
                    array_access35=array_access();

                    state._fsp--;

                    adaptor.addChild(root_0, array_access35.getTree());

                    }
                    break;

            }


            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:30: ( ',' ! ( ID | array_access ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:31: ',' ! ( ID | array_access )
            	    {
            	    char_literal36=(Token)match(input,28,FOLLOW_28_in_expr_list412); 

            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:36: ( ID | array_access )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==ID) ) {
            	        int LA9_1 = input.LA(2);

            	        if ( (LA9_1==31) ) {
            	            alt9=2;
            	        }
            	        else if ( ((LA9_1 >= 27 && LA9_1 <= 28)) ) {
            	            alt9=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:37: ID
            	            {
            	            ID37=(Token)match(input,ID,FOLLOW_ID_in_expr_list416); 
            	            ID37_tree = 
            	            (AslTree)adaptor.create(ID37)
            	            ;
            	            adaptor.addChild(root_0, ID37_tree);


            	            }
            	            break;
            	        case 2 :
            	            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:87:40: array_access
            	            {
            	            pushFollow(FOLLOW_array_access_in_expr_list418);
            	            array_access38=array_access();

            	            state._fsp--;

            	            adaptor.addChild(root_0, array_access38.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class array_access_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_access"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:89:1: array_access : ID ac= '[' NUM ']' -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID NUM ) ;
    public final AslParser.array_access_return array_access() throws RecognitionException {
        AslParser.array_access_return retval = new AslParser.array_access_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ac=null;
        Token ID39=null;
        Token NUM40=null;
        Token char_literal41=null;

        AslTree ac_tree=null;
        AslTree ID39_tree=null;
        AslTree NUM40_tree=null;
        AslTree char_literal41_tree=null;
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:90:9: ( ID ac= '[' NUM ']' -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID NUM ) )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:90:13: ID ac= '[' NUM ']'
            {
            ID39=(Token)match(input,ID,FOLLOW_ID_in_array_access442);  
            stream_ID.add(ID39);


            ac=(Token)match(input,31,FOLLOW_31_in_array_access446);  
            stream_31.add(ac);


            NUM40=(Token)match(input,NUM,FOLLOW_NUM_in_array_access448);  
            stream_NUM.add(NUM40);


            char_literal41=(Token)match(input,32,FOLLOW_32_in_array_access450);  
            stream_32.add(char_literal41);


            // AST REWRITE
            // elements: ID, NUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 90:31: -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID NUM )
            {
                // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:90:34: ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID NUM )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARRAY_ACCESS, ac, "ARRAY_ACCESS")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_NUM.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_access"


    public static class assignation_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignation"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:93:1: assignation : ID ASSIGN bool_or ;
    public final AslParser.assignation_return assignation() throws RecognitionException {
        AslParser.assignation_return retval = new AslParser.assignation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID42=null;
        Token ASSIGN43=null;
        AslParser.bool_or_return bool_or44 =null;


        AslTree ID42_tree=null;
        AslTree ASSIGN43_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:93:12: ( ID ASSIGN bool_or )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:93:14: ID ASSIGN bool_or
            {
            root_0 = (AslTree)adaptor.nil();


            ID42=(Token)match(input,ID,FOLLOW_ID_in_assignation477); 
            ID42_tree = 
            (AslTree)adaptor.create(ID42)
            ;
            adaptor.addChild(root_0, ID42_tree);


            ASSIGN43=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignation479); 
            ASSIGN43_tree = 
            (AslTree)adaptor.create(ASSIGN43)
            ;
            adaptor.addChild(root_0, ASSIGN43_tree);


            pushFollow(FOLLOW_bool_or_in_assignation481);
            bool_or44=bool_or();

            state._fsp--;

            adaptor.addChild(root_0, bool_or44.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignation"


    public static class bool_or_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_or"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:95:1: bool_or : bool_xor ( OR ^ bool_xor )* ;
    public final AslParser.bool_or_return bool_or() throws RecognitionException {
        AslParser.bool_or_return retval = new AslParser.bool_or_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR46=null;
        AslParser.bool_xor_return bool_xor45 =null;

        AslParser.bool_xor_return bool_xor47 =null;


        AslTree OR46_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:95:8: ( bool_xor ( OR ^ bool_xor )* )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:95:10: bool_xor ( OR ^ bool_xor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_bool_xor_in_bool_or489);
            bool_xor45=bool_xor();

            state._fsp--;

            adaptor.addChild(root_0, bool_xor45.getTree());

            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:95:19: ( OR ^ bool_xor )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:95:20: OR ^ bool_xor
            	    {
            	    OR46=(Token)match(input,OR,FOLLOW_OR_in_bool_or492); 
            	    OR46_tree = 
            	    (AslTree)adaptor.create(OR46)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR46_tree, root_0);


            	    pushFollow(FOLLOW_bool_xor_in_bool_or495);
            	    bool_xor47=bool_xor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bool_xor47.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_or"


    public static class bool_xor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_xor"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:97:1: bool_xor : bool_and ( XOR ^ bool_and )* ;
    public final AslParser.bool_xor_return bool_xor() throws RecognitionException {
        AslParser.bool_xor_return retval = new AslParser.bool_xor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token XOR49=null;
        AslParser.bool_and_return bool_and48 =null;

        AslParser.bool_and_return bool_and50 =null;


        AslTree XOR49_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:97:9: ( bool_and ( XOR ^ bool_and )* )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:97:11: bool_and ( XOR ^ bool_and )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_bool_and_in_bool_xor505);
            bool_and48=bool_and();

            state._fsp--;

            adaptor.addChild(root_0, bool_and48.getTree());

            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:97:20: ( XOR ^ bool_and )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==XOR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:97:21: XOR ^ bool_and
            	    {
            	    XOR49=(Token)match(input,XOR,FOLLOW_XOR_in_bool_xor508); 
            	    XOR49_tree = 
            	    (AslTree)adaptor.create(XOR49)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(XOR49_tree, root_0);


            	    pushFollow(FOLLOW_bool_and_in_bool_xor511);
            	    bool_and50=bool_and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bool_and50.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_xor"


    public static class bool_and_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_and"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:99:1: bool_and : bool_atom ( AND ^ bool_atom )* ;
    public final AslParser.bool_and_return bool_and() throws RecognitionException {
        AslParser.bool_and_return retval = new AslParser.bool_and_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND52=null;
        AslParser.bool_atom_return bool_atom51 =null;

        AslParser.bool_atom_return bool_atom53 =null;


        AslTree AND52_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:99:9: ( bool_atom ( AND ^ bool_atom )* )
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:99:11: bool_atom ( AND ^ bool_atom )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_bool_atom_in_bool_and521);
            bool_atom51=bool_atom();

            state._fsp--;

            adaptor.addChild(root_0, bool_atom51.getTree());

            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:99:21: ( AND ^ bool_atom )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:99:22: AND ^ bool_atom
            	    {
            	    AND52=(Token)match(input,AND,FOLLOW_AND_in_bool_and524); 
            	    AND52_tree = 
            	    (AslTree)adaptor.create(AND52)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND52_tree, root_0);


            	    pushFollow(FOLLOW_bool_atom_in_bool_and527);
            	    bool_atom53=bool_atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bool_atom53.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_and"


    public static class bool_atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_atom"
    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:101:1: bool_atom : ( ID | '(' ! bool_or ')' !);
    public final AslParser.bool_atom_return bool_atom() throws RecognitionException {
        AslParser.bool_atom_return retval = new AslParser.bool_atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        AslParser.bool_or_return bool_or56 =null;


        AslTree ID54_tree=null;
        AslTree char_literal55_tree=null;
        AslTree char_literal57_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:101:10: ( ID | '(' ! bool_or ')' !)
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:102:9: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID54=(Token)match(input,ID,FOLLOW_ID_in_bool_atom546); 
                    ID54_tree = 
                    (AslTree)adaptor.create(ID54)
                    ;
                    adaptor.addChild(root_0, ID54_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/PRACTICA/Asl/src/parser/Asl.g:103:11: '(' ! bool_or ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal55=(Token)match(input,26,FOLLOW_26_in_bool_atom559); 

                    pushFollow(FOLLOW_bool_or_in_bool_atom562);
                    bool_or56=bool_or();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_or56.getTree());

                    char_literal57=(Token)match(input,27,FOLLOW_27_in_bool_atom564); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_mod_in_prog128 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EOF_in_prog131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_mod156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_mod159 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_params_in_mod161 = new BitSet(new long[]{0x0000000000906000L});
    public static final BitSet FOLLOW_block_instructions_in_mod163 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EMODULE_in_mod165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_params176 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_varslist_in_params178 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_params181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_varslist206 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_varslist209 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_varslist212 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions239 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_block_instructions241 = new BitSet(new long[]{0x0000000000906002L});
    public static final BitSet FOLLOW_declaration_in_instruction277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_instruction301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INPUT_in_declaration318 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_OUTPUT_in_declaration321 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_WIRE_in_declaration324 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_array_dec_in_declaration328 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_varslist_in_declaration330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_array_dec338 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUM_in_array_dec340 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_array_dec342 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUM_in_array_dec344 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_array_dec346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall365 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_funcall367 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_funcall369 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_expr_list_in_funcall371 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_funcall374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr_list406 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_array_access_in_expr_list408 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_expr_list412 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_expr_list416 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_array_access_in_expr_list418 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ID_in_array_access442 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_array_access446 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUM_in_array_access448 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_array_access450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignation477 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assignation479 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_bool_or_in_assignation481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_xor_in_bool_or489 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_OR_in_bool_or492 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_bool_xor_in_bool_or495 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_bool_and_in_bool_xor505 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_XOR_in_bool_xor508 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_bool_and_in_bool_xor511 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_bool_atom_in_bool_and521 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_bool_and524 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_bool_atom_in_bool_and527 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_bool_atom546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_bool_atom559 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_bool_or_in_bool_atom562 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_bool_atom564 = new BitSet(new long[]{0x0000000000000002L});

}