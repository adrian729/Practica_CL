// $ANTLR 3.4 /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g 2017-03-28 19:13:58

    package parser;
    import interp.VlclTree;


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
public class VlclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ARRAY_ACCESS", "ARRAY_RANK", "ASSIGN", "BEGIN", "CASE", "COMMENT", "DEFAULT", "ELSE", "EMODULE", "END", "ENDCASE", "ESC_SEQ", "FUNCALL", "ID", "IF", "INPUT", "LIST_INSTR", "LIST_MODULES", "MODULE", "NUM", "OR", "OUTPUT", "PARAMS", "STRING", "WIRE", "WS", "XOR", "'('", "')'", "','", "':'", "';'", "'['", "']'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VlclParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VlclParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return VlclParser.tokenNames; }
    public String getGrammarFileName() { return "/home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:58:1: prog : ( mod )+ EOF -> ^( LIST_MODULES ( mod )+ ) ;
    public final VlclParser.prog_return prog() throws RecognitionException {
        VlclParser.prog_return retval = new VlclParser.prog_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token EOF2=null;
        VlclParser.mod_return mod1 =null;


        VlclTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_mod=new RewriteRuleSubtreeStream(adaptor,"rule mod");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:58:9: ( ( mod )+ EOF -> ^( LIST_MODULES ( mod )+ ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:58:11: ( mod )+ EOF
            {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:58:11: ( mod )+
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
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:58:11: mod
            	    {
            	    pushFollow(FOLLOW_mod_in_prog131);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog134);  
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

            root_0 = (VlclTree)adaptor.nil();
            // 58:20: -> ^( LIST_MODULES ( mod )+ )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:58:23: ^( LIST_MODULES ( mod )+ )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(LIST_MODULES, "LIST_MODULES")
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


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class mod_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mod"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:61:1: mod : MODULE ^ ID params ';' ! block_instructions EMODULE !;
    public final VlclParser.mod_return mod() throws RecognitionException {
        VlclParser.mod_return retval = new VlclParser.mod_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token MODULE3=null;
        Token ID4=null;
        Token char_literal6=null;
        Token EMODULE8=null;
        VlclParser.params_return params5 =null;

        VlclParser.block_instructions_return block_instructions7 =null;


        VlclTree MODULE3_tree=null;
        VlclTree ID4_tree=null;
        VlclTree char_literal6_tree=null;
        VlclTree EMODULE8_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:61:4: ( MODULE ^ ID params ';' ! block_instructions EMODULE !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:61:6: MODULE ^ ID params ';' ! block_instructions EMODULE !
            {
            root_0 = (VlclTree)adaptor.nil();


            MODULE3=(Token)match(input,MODULE,FOLLOW_MODULE_in_mod159); 
            MODULE3_tree = 
            (VlclTree)adaptor.create(MODULE3)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(MODULE3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_mod162); 
            ID4_tree = 
            (VlclTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_mod164);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            char_literal6=(Token)match(input,37,FOLLOW_37_in_mod166); 

            pushFollow(FOLLOW_block_instructions_in_mod169);
            block_instructions7=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions7.getTree());

            EMODULE8=(Token)match(input,EMODULE,FOLLOW_EMODULE_in_mod171); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mod"


    public static class params_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:63:1: params : '(' ( varslist )? ')' -> ^( PARAMS ( varslist )? ) ;
    public final VlclParser.params_return params() throws RecognitionException {
        VlclParser.params_return retval = new VlclParser.params_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        VlclParser.varslist_return varslist10 =null;


        VlclTree char_literal9_tree=null;
        VlclTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_varslist=new RewriteRuleSubtreeStream(adaptor,"rule varslist");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:63:9: ( '(' ( varslist )? ')' -> ^( PARAMS ( varslist )? ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:63:11: '(' ( varslist )? ')'
            {
            char_literal9=(Token)match(input,33,FOLLOW_33_in_params182);  
            stream_33.add(char_literal9);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:63:15: ( varslist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:63:15: varslist
                    {
                    pushFollow(FOLLOW_varslist_in_params184);
                    varslist10=varslist();

                    state._fsp--;

                    stream_varslist.add(varslist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,34,FOLLOW_34_in_params187);  
            stream_34.add(char_literal11);


            // AST REWRITE
            // elements: varslist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 63:29: -> ^( PARAMS ( varslist )? )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:63:32: ^( PARAMS ( varslist )? )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:63:41: ( varslist )?
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


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class varslist_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varslist"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:66:1: varslist : ID ( ',' ! ID )* ;
    public final VlclParser.varslist_return varslist() throws RecognitionException {
        VlclParser.varslist_return retval = new VlclParser.varslist_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID12=null;
        Token char_literal13=null;
        Token ID14=null;

        VlclTree ID12_tree=null;
        VlclTree char_literal13_tree=null;
        VlclTree ID14_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:66:9: ( ID ( ',' ! ID )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:66:11: ID ( ',' ! ID )*
            {
            root_0 = (VlclTree)adaptor.nil();


            ID12=(Token)match(input,ID,FOLLOW_ID_in_varslist212); 
            ID12_tree = 
            (VlclTree)adaptor.create(ID12)
            ;
            adaptor.addChild(root_0, ID12_tree);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:66:14: ( ',' ! ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:66:15: ',' ! ID
            	    {
            	    char_literal13=(Token)match(input,35,FOLLOW_35_in_varslist215); 

            	    ID14=(Token)match(input,ID,FOLLOW_ID_in_varslist218); 
            	    ID14_tree = 
            	    (VlclTree)adaptor.create(ID14)
            	    ;
            	    adaptor.addChild(root_0, ID14_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varslist"


    public static class block_instructions_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:69:1: block_instructions : ( ( declaration | instruction ) ';' )+ -> ^( LIST_INSTR ( instruction )+ ) ;
    public final VlclParser.block_instructions_return block_instructions() throws RecognitionException {
        VlclParser.block_instructions_return retval = new VlclParser.block_instructions_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal17=null;
        VlclParser.declaration_return declaration15 =null;

        VlclParser.instruction_return instruction16 =null;


        VlclTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:69:19: ( ( ( declaration | instruction ) ';' )+ -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:70:9: ( ( declaration | instruction ) ';' )+
            {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:70:9: ( ( declaration | instruction ) ';' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CASE||(LA5_0 >= ID && LA5_0 <= INPUT)||LA5_0==OUTPUT||LA5_0==WIRE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:70:10: ( declaration | instruction ) ';'
            	    {
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:70:10: ( declaration | instruction )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==INPUT||LA4_0==OUTPUT||LA4_0==WIRE) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==CASE||(LA4_0 >= ID && LA4_0 <= IF)) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:70:11: declaration
            	            {
            	            pushFollow(FOLLOW_declaration_in_block_instructions246);
            	            declaration15=declaration();

            	            state._fsp--;

            	            stream_declaration.add(declaration15.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:70:25: instruction
            	            {
            	            pushFollow(FOLLOW_instruction_in_block_instructions250);
            	            instruction16=instruction();

            	            state._fsp--;

            	            stream_instruction.add(instruction16.getTree());

            	            }
            	            break;

            	    }


            	    char_literal17=(Token)match(input,37,FOLLOW_37_in_block_instructions253);  
            	    stream_37.add(char_literal17);


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


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 70:44: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:70:47: ^( LIST_INSTR ( instruction )+ )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
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


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:74:1: instruction : ( funcall | assignation | ifelse | case_stmt );
    public final VlclParser.instruction_return instruction() throws RecognitionException {
        VlclParser.instruction_return retval = new VlclParser.instruction_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        VlclParser.funcall_return funcall18 =null;

        VlclParser.assignation_return assignation19 =null;

        VlclParser.ifelse_return ifelse20 =null;

        VlclParser.case_stmt_return case_stmt21 =null;



        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:74:12: ( funcall | assignation | ifelse | case_stmt )
            int alt6=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==ASSIGN) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=3;
                }
                break;
            case CASE:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:75:9: funcall
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction289);
                    funcall18=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall18.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:76:11: assignation
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_instruction301);
                    assignation19=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation19.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:77:11: ifelse
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_ifelse_in_instruction313);
                    ifelse20=ifelse();

                    state._fsp--;

                    adaptor.addChild(root_0, ifelse20.getTree());

                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:78:11: case_stmt
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_case_stmt_in_instruction325);
                    case_stmt21=case_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, case_stmt21.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class declaration_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:1: declaration : ( INPUT ^| OUTPUT ^| WIRE ^) ( array_dec )? varslist ;
    public final VlclParser.declaration_return declaration() throws RecognitionException {
        VlclParser.declaration_return retval = new VlclParser.declaration_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token INPUT22=null;
        Token OUTPUT23=null;
        Token WIRE24=null;
        VlclParser.array_dec_return array_dec25 =null;

        VlclParser.varslist_return varslist26 =null;


        VlclTree INPUT22_tree=null;
        VlclTree OUTPUT23_tree=null;
        VlclTree WIRE24_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:12: ( ( INPUT ^| OUTPUT ^| WIRE ^) ( array_dec )? varslist )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:14: ( INPUT ^| OUTPUT ^| WIRE ^) ( array_dec )? varslist
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:14: ( INPUT ^| OUTPUT ^| WIRE ^)
            int alt7=3;
            switch ( input.LA(1) ) {
            case INPUT:
                {
                alt7=1;
                }
                break;
            case OUTPUT:
                {
                alt7=2;
                }
                break;
            case WIRE:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:15: INPUT ^
                    {
                    INPUT22=(Token)match(input,INPUT,FOLLOW_INPUT_in_declaration342); 
                    INPUT22_tree = 
                    (VlclTree)adaptor.create(INPUT22)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(INPUT22_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:22: OUTPUT ^
                    {
                    OUTPUT23=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_declaration345); 
                    OUTPUT23_tree = 
                    (VlclTree)adaptor.create(OUTPUT23)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(OUTPUT23_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:30: WIRE ^
                    {
                    WIRE24=(Token)match(input,WIRE,FOLLOW_WIRE_in_declaration348); 
                    WIRE24_tree = 
                    (VlclTree)adaptor.create(WIRE24)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(WIRE24_tree, root_0);


                    }
                    break;

            }


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:37: ( array_dec )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:81:37: array_dec
                    {
                    pushFollow(FOLLOW_array_dec_in_declaration352);
                    array_dec25=array_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, array_dec25.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_varslist_in_declaration355);
            varslist26=varslist();

            state._fsp--;

            adaptor.addChild(root_0, varslist26.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class array_dec_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_dec"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:83:1: array_dec : '[' NUM ':' NUM ']' -> ^( ARRAY_RANK NUM NUM ) ;
    public final VlclParser.array_dec_return array_dec() throws RecognitionException {
        VlclParser.array_dec_return retval = new VlclParser.array_dec_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal27=null;
        Token NUM28=null;
        Token char_literal29=null;
        Token NUM30=null;
        Token char_literal31=null;

        VlclTree char_literal27_tree=null;
        VlclTree NUM28_tree=null;
        VlclTree char_literal29_tree=null;
        VlclTree NUM30_tree=null;
        VlclTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:83:10: ( '[' NUM ':' NUM ']' -> ^( ARRAY_RANK NUM NUM ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:83:12: '[' NUM ':' NUM ']'
            {
            char_literal27=(Token)match(input,38,FOLLOW_38_in_array_dec363);  
            stream_38.add(char_literal27);


            NUM28=(Token)match(input,NUM,FOLLOW_NUM_in_array_dec365);  
            stream_NUM.add(NUM28);


            char_literal29=(Token)match(input,36,FOLLOW_36_in_array_dec367);  
            stream_36.add(char_literal29);


            NUM30=(Token)match(input,NUM,FOLLOW_NUM_in_array_dec369);  
            stream_NUM.add(NUM30);


            char_literal31=(Token)match(input,39,FOLLOW_39_in_array_dec371);  
            stream_39.add(char_literal31);


            // AST REWRITE
            // elements: NUM, NUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 83:32: -> ^( ARRAY_RANK NUM NUM )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:83:35: ^( ARRAY_RANK NUM NUM )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(ARRAY_RANK, "ARRAY_RANK")
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


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_dec"


    public static class funcall_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:85:1: funcall : ID ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final VlclParser.funcall_return funcall() throws RecognitionException {
        VlclParser.funcall_return retval = new VlclParser.funcall_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID32=null;
        Token ID33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        VlclParser.expr_list_return expr_list35 =null;


        VlclTree ID32_tree=null;
        VlclTree ID33_tree=null;
        VlclTree char_literal34_tree=null;
        VlclTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:85:9: ( ID ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:85:11: ID ID '(' ( expr_list )? ')'
            {
            ID32=(Token)match(input,ID,FOLLOW_ID_in_funcall390);  
            stream_ID.add(ID32);


            ID33=(Token)match(input,ID,FOLLOW_ID_in_funcall392);  
            stream_ID.add(ID33);


            char_literal34=(Token)match(input,33,FOLLOW_33_in_funcall394);  
            stream_33.add(char_literal34);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:85:21: ( expr_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:85:21: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall396);
                    expr_list35=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list35.getTree());

                    }
                    break;

            }


            char_literal36=(Token)match(input,34,FOLLOW_34_in_funcall399);  
            stream_34.add(char_literal36);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 85:36: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:85:39: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:85:52: ^( ARGLIST ( expr_list )? )
                {
                VlclTree root_2 = (VlclTree)adaptor.nil();
                root_2 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:85:62: ( expr_list )?
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


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:1: expr_list : ( ID | array_access ) ( ',' ! ( ID | array_access ) )* ;
    public final VlclParser.expr_list_return expr_list() throws RecognitionException {
        VlclParser.expr_list_return retval = new VlclParser.expr_list_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID37=null;
        Token char_literal39=null;
        Token ID40=null;
        VlclParser.array_access_return array_access38 =null;

        VlclParser.array_access_return array_access41 =null;


        VlclTree ID37_tree=null;
        VlclTree char_literal39_tree=null;
        VlclTree ID40_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:10: ( ( ID | array_access ) ( ',' ! ( ID | array_access ) )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:12: ( ID | array_access ) ( ',' ! ( ID | array_access ) )*
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:12: ( ID | array_access )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==38) ) {
                    alt10=2;
                }
                else if ( ((LA10_1 >= 34 && LA10_1 <= 35)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:13: ID
                    {
                    ID37=(Token)match(input,ID,FOLLOW_ID_in_expr_list431); 
                    ID37_tree = 
                    (VlclTree)adaptor.create(ID37)
                    ;
                    adaptor.addChild(root_0, ID37_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:16: array_access
                    {
                    pushFollow(FOLLOW_array_access_in_expr_list433);
                    array_access38=array_access();

                    state._fsp--;

                    adaptor.addChild(root_0, array_access38.getTree());

                    }
                    break;

            }


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:30: ( ',' ! ( ID | array_access ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:31: ',' ! ( ID | array_access )
            	    {
            	    char_literal39=(Token)match(input,35,FOLLOW_35_in_expr_list437); 

            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:36: ( ID | array_access )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==ID) ) {
            	        int LA11_1 = input.LA(2);

            	        if ( (LA11_1==38) ) {
            	            alt11=2;
            	        }
            	        else if ( ((LA11_1 >= 34 && LA11_1 <= 35)) ) {
            	            alt11=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:37: ID
            	            {
            	            ID40=(Token)match(input,ID,FOLLOW_ID_in_expr_list441); 
            	            ID40_tree = 
            	            (VlclTree)adaptor.create(ID40)
            	            ;
            	            adaptor.addChild(root_0, ID40_tree);


            	            }
            	            break;
            	        case 2 :
            	            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:88:40: array_access
            	            {
            	            pushFollow(FOLLOW_array_access_in_expr_list443);
            	            array_access41=array_access();

            	            state._fsp--;

            	            adaptor.addChild(root_0, array_access41.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class array_access_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_access"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:90:1: array_access : ID ac= '[' NUM ']' -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID NUM ) ;
    public final VlclParser.array_access_return array_access() throws RecognitionException {
        VlclParser.array_access_return retval = new VlclParser.array_access_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ac=null;
        Token ID42=null;
        Token NUM43=null;
        Token char_literal44=null;

        VlclTree ac_tree=null;
        VlclTree ID42_tree=null;
        VlclTree NUM43_tree=null;
        VlclTree char_literal44_tree=null;
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:91:9: ( ID ac= '[' NUM ']' -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID NUM ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:91:13: ID ac= '[' NUM ']'
            {
            ID42=(Token)match(input,ID,FOLLOW_ID_in_array_access467);  
            stream_ID.add(ID42);


            ac=(Token)match(input,38,FOLLOW_38_in_array_access471);  
            stream_38.add(ac);


            NUM43=(Token)match(input,NUM,FOLLOW_NUM_in_array_access473);  
            stream_NUM.add(NUM43);


            char_literal44=(Token)match(input,39,FOLLOW_39_in_array_access475);  
            stream_39.add(char_literal44);


            // AST REWRITE
            // elements: NUM, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 91:31: -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID NUM )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:91:34: ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID NUM )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(ARRAY_ACCESS, ac, "ARRAY_ACCESS")
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


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_access"


    public static class assignation_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignation"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:94:1: assignation : ID ASSIGN logic_or ;
    public final VlclParser.assignation_return assignation() throws RecognitionException {
        VlclParser.assignation_return retval = new VlclParser.assignation_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID45=null;
        Token ASSIGN46=null;
        VlclParser.logic_or_return logic_or47 =null;


        VlclTree ID45_tree=null;
        VlclTree ASSIGN46_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:94:12: ( ID ASSIGN logic_or )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:94:14: ID ASSIGN logic_or
            {
            root_0 = (VlclTree)adaptor.nil();


            ID45=(Token)match(input,ID,FOLLOW_ID_in_assignation502); 
            ID45_tree = 
            (VlclTree)adaptor.create(ID45)
            ;
            adaptor.addChild(root_0, ID45_tree);


            ASSIGN46=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignation504); 
            ASSIGN46_tree = 
            (VlclTree)adaptor.create(ASSIGN46)
            ;
            adaptor.addChild(root_0, ASSIGN46_tree);


            pushFollow(FOLLOW_logic_or_in_assignation506);
            logic_or47=logic_or();

            state._fsp--;

            adaptor.addChild(root_0, logic_or47.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignation"


    public static class ifelse_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifelse"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:96:1: ifelse : IF ^ '(' ! bool_or ')' ! beginend ( ELSE ^ ( ifelse | beginend ) )? ;
    public final VlclParser.ifelse_return ifelse() throws RecognitionException {
        VlclParser.ifelse_return retval = new VlclParser.ifelse_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token IF48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Token ELSE53=null;
        VlclParser.bool_or_return bool_or50 =null;

        VlclParser.beginend_return beginend52 =null;

        VlclParser.ifelse_return ifelse54 =null;

        VlclParser.beginend_return beginend55 =null;


        VlclTree IF48_tree=null;
        VlclTree char_literal49_tree=null;
        VlclTree char_literal51_tree=null;
        VlclTree ELSE53_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:96:9: ( IF ^ '(' ! bool_or ')' ! beginend ( ELSE ^ ( ifelse | beginend ) )? )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:96:11: IF ^ '(' ! bool_or ')' ! beginend ( ELSE ^ ( ifelse | beginend ) )?
            {
            root_0 = (VlclTree)adaptor.nil();


            IF48=(Token)match(input,IF,FOLLOW_IF_in_ifelse516); 
            IF48_tree = 
            (VlclTree)adaptor.create(IF48)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(IF48_tree, root_0);


            char_literal49=(Token)match(input,33,FOLLOW_33_in_ifelse519); 

            pushFollow(FOLLOW_bool_or_in_ifelse522);
            bool_or50=bool_or();

            state._fsp--;

            adaptor.addChild(root_0, bool_or50.getTree());

            char_literal51=(Token)match(input,34,FOLLOW_34_in_ifelse524); 

            pushFollow(FOLLOW_beginend_in_ifelse527);
            beginend52=beginend();

            state._fsp--;

            adaptor.addChild(root_0, beginend52.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:96:42: ( ELSE ^ ( ifelse | beginend ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:96:43: ELSE ^ ( ifelse | beginend )
                    {
                    ELSE53=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelse530); 
                    ELSE53_tree = 
                    (VlclTree)adaptor.create(ELSE53)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(ELSE53_tree, root_0);


                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:96:49: ( ifelse | beginend )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==IF) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==BEGIN) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }
                    switch (alt13) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:96:50: ifelse
                            {
                            pushFollow(FOLLOW_ifelse_in_ifelse534);
                            ifelse54=ifelse();

                            state._fsp--;

                            adaptor.addChild(root_0, ifelse54.getTree());

                            }
                            break;
                        case 2 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:96:59: beginend
                            {
                            pushFollow(FOLLOW_beginend_in_ifelse538);
                            beginend55=beginend();

                            state._fsp--;

                            adaptor.addChild(root_0, beginend55.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifelse"


    public static class case_stmt_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "case_stmt"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:99:1: case_stmt : CASE ^ '(' ! ID ')' ! ( case_item )* ( default_item )? ;
    public final VlclParser.case_stmt_return case_stmt() throws RecognitionException {
        VlclParser.case_stmt_return retval = new VlclParser.case_stmt_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token CASE56=null;
        Token char_literal57=null;
        Token ID58=null;
        Token char_literal59=null;
        VlclParser.case_item_return case_item60 =null;

        VlclParser.default_item_return default_item61 =null;


        VlclTree CASE56_tree=null;
        VlclTree char_literal57_tree=null;
        VlclTree ID58_tree=null;
        VlclTree char_literal59_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:99:10: ( CASE ^ '(' ! ID ')' ! ( case_item )* ( default_item )? )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:99:12: CASE ^ '(' ! ID ')' ! ( case_item )* ( default_item )?
            {
            root_0 = (VlclTree)adaptor.nil();


            CASE56=(Token)match(input,CASE,FOLLOW_CASE_in_case_stmt557); 
            CASE56_tree = 
            (VlclTree)adaptor.create(CASE56)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(CASE56_tree, root_0);


            char_literal57=(Token)match(input,33,FOLLOW_33_in_case_stmt560); 

            ID58=(Token)match(input,ID,FOLLOW_ID_in_case_stmt563); 
            ID58_tree = 
            (VlclTree)adaptor.create(ID58)
            ;
            adaptor.addChild(root_0, ID58_tree);


            char_literal59=(Token)match(input,34,FOLLOW_34_in_case_stmt565); 

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:99:31: ( case_item )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ID) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==36) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:99:32: case_item
            	    {
            	    pushFollow(FOLLOW_case_item_in_case_stmt569);
            	    case_item60=case_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, case_item60.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:99:44: ( default_item )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DEFAULT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:99:45: default_item
                    {
                    pushFollow(FOLLOW_default_item_in_case_stmt574);
                    default_item61=default_item();

                    state._fsp--;

                    adaptor.addChild(root_0, default_item61.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "case_stmt"


    public static class case_item_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "case_item"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:103:1: case_item : ID ^ ':' ! beginend ;
    public final VlclParser.case_item_return case_item() throws RecognitionException {
        VlclParser.case_item_return retval = new VlclParser.case_item_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID62=null;
        Token char_literal63=null;
        VlclParser.beginend_return beginend64 =null;


        VlclTree ID62_tree=null;
        VlclTree char_literal63_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:103:10: ( ID ^ ':' ! beginend )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:103:12: ID ^ ':' ! beginend
            {
            root_0 = (VlclTree)adaptor.nil();


            ID62=(Token)match(input,ID,FOLLOW_ID_in_case_item601); 
            ID62_tree = 
            (VlclTree)adaptor.create(ID62)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(ID62_tree, root_0);


            char_literal63=(Token)match(input,36,FOLLOW_36_in_case_item604); 

            pushFollow(FOLLOW_beginend_in_case_item607);
            beginend64=beginend();

            state._fsp--;

            adaptor.addChild(root_0, beginend64.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "case_item"


    public static class default_item_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "default_item"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:106:1: default_item : DEFAULT ^ ':' ! beginend ;
    public final VlclParser.default_item_return default_item() throws RecognitionException {
        VlclParser.default_item_return retval = new VlclParser.default_item_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token DEFAULT65=null;
        Token char_literal66=null;
        VlclParser.beginend_return beginend67 =null;


        VlclTree DEFAULT65_tree=null;
        VlclTree char_literal66_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:106:13: ( DEFAULT ^ ':' ! beginend )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:106:15: DEFAULT ^ ':' ! beginend
            {
            root_0 = (VlclTree)adaptor.nil();


            DEFAULT65=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_default_item623); 
            DEFAULT65_tree = 
            (VlclTree)adaptor.create(DEFAULT65)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(DEFAULT65_tree, root_0);


            char_literal66=(Token)match(input,36,FOLLOW_36_in_default_item626); 

            pushFollow(FOLLOW_beginend_in_default_item629);
            beginend67=beginend();

            state._fsp--;

            adaptor.addChild(root_0, beginend67.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "default_item"


    public static class beginend_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beginend"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:109:1: beginend : BEGIN ! ( instruction )* END !;
    public final VlclParser.beginend_return beginend() throws RecognitionException {
        VlclParser.beginend_return retval = new VlclParser.beginend_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token BEGIN68=null;
        Token END70=null;
        VlclParser.instruction_return instruction69 =null;


        VlclTree BEGIN68_tree=null;
        VlclTree END70_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:109:9: ( BEGIN ! ( instruction )* END !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:109:11: BEGIN ! ( instruction )* END !
            {
            root_0 = (VlclTree)adaptor.nil();


            BEGIN68=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_beginend645); 

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:109:18: ( instruction )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==CASE||(LA17_0 >= ID && LA17_0 <= IF)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:109:19: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_beginend649);
            	    instruction69=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction69.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            END70=(Token)match(input,END,FOLLOW_END_in_beginend653); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "beginend"


    public static class bool_or_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_or"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:112:1: bool_or : bool_and ( OR ^ bool_and )* ;
    public final VlclParser.bool_or_return bool_or() throws RecognitionException {
        VlclParser.bool_or_return retval = new VlclParser.bool_or_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token OR72=null;
        VlclParser.bool_and_return bool_and71 =null;

        VlclParser.bool_and_return bool_and73 =null;


        VlclTree OR72_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:112:9: ( bool_and ( OR ^ bool_and )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:112:11: bool_and ( OR ^ bool_and )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_bool_and_in_bool_or671);
            bool_and71=bool_and();

            state._fsp--;

            adaptor.addChild(root_0, bool_and71.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:112:20: ( OR ^ bool_and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==OR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:112:21: OR ^ bool_and
            	    {
            	    OR72=(Token)match(input,OR,FOLLOW_OR_in_bool_or674); 
            	    OR72_tree = 
            	    (VlclTree)adaptor.create(OR72)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(OR72_tree, root_0);


            	    pushFollow(FOLLOW_bool_and_in_bool_or677);
            	    bool_and73=bool_and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bool_and73.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_or"


    public static class bool_and_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_and"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:114:1: bool_and : bool_atom ( AND ^ bool_atom )* ;
    public final VlclParser.bool_and_return bool_and() throws RecognitionException {
        VlclParser.bool_and_return retval = new VlclParser.bool_and_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token AND75=null;
        VlclParser.bool_atom_return bool_atom74 =null;

        VlclParser.bool_atom_return bool_atom76 =null;


        VlclTree AND75_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:114:9: ( bool_atom ( AND ^ bool_atom )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:114:11: bool_atom ( AND ^ bool_atom )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_bool_atom_in_bool_and687);
            bool_atom74=bool_atom();

            state._fsp--;

            adaptor.addChild(root_0, bool_atom74.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:114:21: ( AND ^ bool_atom )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AND) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:114:22: AND ^ bool_atom
            	    {
            	    AND75=(Token)match(input,AND,FOLLOW_AND_in_bool_and690); 
            	    AND75_tree = 
            	    (VlclTree)adaptor.create(AND75)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(AND75_tree, root_0);


            	    pushFollow(FOLLOW_bool_atom_in_bool_and693);
            	    bool_atom76=bool_atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bool_atom76.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_and"


    public static class bool_atom_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_atom"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:116:1: bool_atom : ( ID | '(' ! bool_or ')' !);
    public final VlclParser.bool_atom_return bool_atom() throws RecognitionException {
        VlclParser.bool_atom_return retval = new VlclParser.bool_atom_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        VlclParser.bool_or_return bool_or79 =null;


        VlclTree ID77_tree=null;
        VlclTree char_literal78_tree=null;
        VlclTree char_literal80_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:116:10: ( ID | '(' ! bool_or ')' !)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==33) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:117:9: ID
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    ID77=(Token)match(input,ID,FOLLOW_ID_in_bool_atom711); 
                    ID77_tree = 
                    (VlclTree)adaptor.create(ID77)
                    ;
                    adaptor.addChild(root_0, ID77_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:118:11: '(' ! bool_or ')' !
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    char_literal78=(Token)match(input,33,FOLLOW_33_in_bool_atom724); 

                    pushFollow(FOLLOW_bool_or_in_bool_atom727);
                    bool_or79=bool_or();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_or79.getTree());

                    char_literal80=(Token)match(input,34,FOLLOW_34_in_bool_atom729); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_atom"


    public static class logic_or_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_or"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:122:1: logic_or : logic_xor ( OR ^ logic_xor )* ;
    public final VlclParser.logic_or_return logic_or() throws RecognitionException {
        VlclParser.logic_or_return retval = new VlclParser.logic_or_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token OR82=null;
        VlclParser.logic_xor_return logic_xor81 =null;

        VlclParser.logic_xor_return logic_xor83 =null;


        VlclTree OR82_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:122:9: ( logic_xor ( OR ^ logic_xor )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:122:11: logic_xor ( OR ^ logic_xor )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_logic_xor_in_logic_or747);
            logic_xor81=logic_xor();

            state._fsp--;

            adaptor.addChild(root_0, logic_xor81.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:122:21: ( OR ^ logic_xor )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==OR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:122:22: OR ^ logic_xor
            	    {
            	    OR82=(Token)match(input,OR,FOLLOW_OR_in_logic_or750); 
            	    OR82_tree = 
            	    (VlclTree)adaptor.create(OR82)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(OR82_tree, root_0);


            	    pushFollow(FOLLOW_logic_xor_in_logic_or753);
            	    logic_xor83=logic_xor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logic_xor83.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logic_or"


    public static class logic_xor_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_xor"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:124:1: logic_xor : logic_and ( XOR ^ logic_and )* ;
    public final VlclParser.logic_xor_return logic_xor() throws RecognitionException {
        VlclParser.logic_xor_return retval = new VlclParser.logic_xor_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token XOR85=null;
        VlclParser.logic_and_return logic_and84 =null;

        VlclParser.logic_and_return logic_and86 =null;


        VlclTree XOR85_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:124:10: ( logic_and ( XOR ^ logic_and )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:124:12: logic_and ( XOR ^ logic_and )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_logic_and_in_logic_xor763);
            logic_and84=logic_and();

            state._fsp--;

            adaptor.addChild(root_0, logic_and84.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:124:22: ( XOR ^ logic_and )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==XOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:124:23: XOR ^ logic_and
            	    {
            	    XOR85=(Token)match(input,XOR,FOLLOW_XOR_in_logic_xor766); 
            	    XOR85_tree = 
            	    (VlclTree)adaptor.create(XOR85)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(XOR85_tree, root_0);


            	    pushFollow(FOLLOW_logic_and_in_logic_xor769);
            	    logic_and86=logic_and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logic_and86.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logic_xor"


    public static class logic_and_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_and"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:126:1: logic_and : logic_atom ( AND ^ logic_atom )* ;
    public final VlclParser.logic_and_return logic_and() throws RecognitionException {
        VlclParser.logic_and_return retval = new VlclParser.logic_and_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token AND88=null;
        VlclParser.logic_atom_return logic_atom87 =null;

        VlclParser.logic_atom_return logic_atom89 =null;


        VlclTree AND88_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:126:10: ( logic_atom ( AND ^ logic_atom )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:126:12: logic_atom ( AND ^ logic_atom )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_logic_atom_in_logic_and779);
            logic_atom87=logic_atom();

            state._fsp--;

            adaptor.addChild(root_0, logic_atom87.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:126:23: ( AND ^ logic_atom )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:126:24: AND ^ logic_atom
            	    {
            	    AND88=(Token)match(input,AND,FOLLOW_AND_in_logic_and782); 
            	    AND88_tree = 
            	    (VlclTree)adaptor.create(AND88)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(AND88_tree, root_0);


            	    pushFollow(FOLLOW_logic_atom_in_logic_and785);
            	    logic_atom89=logic_atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logic_atom89.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logic_and"


    public static class logic_atom_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_atom"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:128:1: logic_atom : ( ID | '(' ! logic_or ')' !);
    public final VlclParser.logic_atom_return logic_atom() throws RecognitionException {
        VlclParser.logic_atom_return retval = new VlclParser.logic_atom_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID90=null;
        Token char_literal91=null;
        Token char_literal93=null;
        VlclParser.logic_or_return logic_or92 =null;


        VlclTree ID90_tree=null;
        VlclTree char_literal91_tree=null;
        VlclTree char_literal93_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:128:11: ( ID | '(' ! logic_or ')' !)
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==33) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:129:9: ID
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    ID90=(Token)match(input,ID,FOLLOW_ID_in_logic_atom803); 
                    ID90_tree = 
                    (VlclTree)adaptor.create(ID90)
                    ;
                    adaptor.addChild(root_0, ID90_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Vlcl/src/parser/Vlcl.g:130:11: '(' ! logic_or ')' !
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    char_literal91=(Token)match(input,33,FOLLOW_33_in_logic_atom815); 

                    pushFollow(FOLLOW_logic_or_in_logic_atom818);
                    logic_or92=logic_or();

                    state._fsp--;

                    adaptor.addChild(root_0, logic_or92.getTree());

                    char_literal93=(Token)match(input,34,FOLLOW_34_in_logic_atom820); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (VlclTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (VlclTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logic_atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_mod_in_prog131 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EOF_in_prog134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_mod159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_mod162 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_mod164 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_mod166 = new BitSet(new long[]{0x0000000048380400L});
    public static final BitSet FOLLOW_block_instructions_in_mod169 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EMODULE_in_mod171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_params182 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_varslist_in_params184 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_params187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_varslist212 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_varslist215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_varslist218 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_declaration_in_block_instructions246 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions250 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_block_instructions253 = new BitSet(new long[]{0x0000000048380402L});
    public static final BitSet FOLLOW_funcall_in_instruction289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_instruction301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifelse_in_instruction313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_stmt_in_instruction325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INPUT_in_declaration342 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_OUTPUT_in_declaration345 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_WIRE_in_declaration348 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_array_dec_in_declaration352 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_varslist_in_declaration355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_array_dec363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NUM_in_array_dec365 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_array_dec367 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NUM_in_array_dec369 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_array_dec371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall390 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_funcall392 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_funcall394 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_expr_list_in_funcall396 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_funcall399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr_list431 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_array_access_in_expr_list433 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_expr_list437 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_expr_list441 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_array_access_in_expr_list443 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_array_access467 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_array_access471 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NUM_in_array_access473 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_array_access475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignation502 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_assignation504 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_logic_or_in_assignation506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifelse516 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ifelse519 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_bool_or_in_ifelse522 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ifelse524 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_beginend_in_ifelse527 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ELSE_in_ifelse530 = new BitSet(new long[]{0x0000000000100200L});
    public static final BitSet FOLLOW_ifelse_in_ifelse534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beginend_in_ifelse538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_stmt557 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_case_stmt560 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_case_stmt563 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_case_stmt565 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_case_item_in_case_stmt569 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_default_item_in_case_stmt574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_case_item601 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_case_item604 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_beginend_in_case_item607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_item623 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_default_item626 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_beginend_in_default_item629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_beginend645 = new BitSet(new long[]{0x0000000000188400L});
    public static final BitSet FOLLOW_instruction_in_beginend649 = new BitSet(new long[]{0x0000000000188400L});
    public static final BitSet FOLLOW_END_in_beginend653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_in_bool_or671 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_OR_in_bool_or674 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_bool_and_in_bool_or677 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_bool_atom_in_bool_and687 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_bool_and690 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_bool_atom_in_bool_and693 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_bool_atom711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_bool_atom724 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_bool_or_in_bool_atom727 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_bool_atom729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_xor_in_logic_or747 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_OR_in_logic_or750 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_logic_xor_in_logic_or753 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_logic_and_in_logic_xor763 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_XOR_in_logic_xor766 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_logic_and_in_logic_xor769 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_logic_atom_in_logic_and779 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_logic_and782 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_logic_atom_in_logic_and785 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_logic_atom803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_logic_atom815 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_logic_or_in_logic_atom818 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_logic_atom820 = new BitSet(new long[]{0x0000000000000002L});

}