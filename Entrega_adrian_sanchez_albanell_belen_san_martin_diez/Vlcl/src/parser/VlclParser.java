// $ANTLR 3.4 /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g 2017-04-07 20:28:14

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANDBW", "ARG_LIST", "ARRAY_ACCESS", "ARRAY_RANGE", "ASSIGN", "ASSIGNATION", "ASSIGNSIMBOL", "BEGIN", "BIN", "CASE", "CASE_ITEM", "COMMENT", "COMP", "CONCAT", "CONCAT_MULT", "COND", "DEC", "DEFAULT", "ELSE", "END", "ENDCASE", "ENDFUNCTION", "ENDMODULE", "EQ", "ESC_SEQ", "FOR", "FUNCALL", "FUNCTION", "HEX", "ID", "IF", "INOUT", "INPUT", "LIST_INSTR", "LIST_MODULES", "LIST_STMTS", "MODULE", "NAND", "NOR", "NOT", "NOTBW", "NUM", "NUM_CONST", "OCT", "OR", "ORBW", "OUTPUT", "PARAMETER", "PARAMS", "PART_ARRAY_ACCESS", "PLUS", "REG", "SHIFT", "TERM", "WIRE", "WS", "XORS", "'('", "')'", "','", "':'", "';'", "'['", "']'", "'{'", "'}'"
    };

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
    public String getGrammarFileName() { return "/home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:74:1: prog : ( mod )+ EOF -> ^( LIST_MODULES ( mod )+ ) ;
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
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:74:9: ( ( mod )+ EOF -> ^( LIST_MODULES ( mod )+ ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:74:11: ( mod )+ EOF
            {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:74:11: ( mod )+
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
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:74:11: mod
            	    {
            	    pushFollow(FOLLOW_mod_in_prog323);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog326);  
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
            // 74:20: -> ^( LIST_MODULES ( mod )+ )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:74:23: ^( LIST_MODULES ( mod )+ )
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
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:79:1: mod : MODULE ! ID ^ params ';' ! block_instructions ENDMODULE !;
    public final VlclParser.mod_return mod() throws RecognitionException {
        VlclParser.mod_return retval = new VlclParser.mod_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token MODULE3=null;
        Token ID4=null;
        Token char_literal6=null;
        Token ENDMODULE8=null;
        VlclParser.params_return params5 =null;

        VlclParser.block_instructions_return block_instructions7 =null;


        VlclTree MODULE3_tree=null;
        VlclTree ID4_tree=null;
        VlclTree char_literal6_tree=null;
        VlclTree ENDMODULE8_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:79:9: ( MODULE ! ID ^ params ';' ! block_instructions ENDMODULE !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:79:11: MODULE ! ID ^ params ';' ! block_instructions ENDMODULE !
            {
            root_0 = (VlclTree)adaptor.nil();


            MODULE3=(Token)match(input,MODULE,FOLLOW_MODULE_in_mod358); 

            ID4=(Token)match(input,ID,FOLLOW_ID_in_mod361); 
            ID4_tree = 
            (VlclTree)adaptor.create(ID4)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(ID4_tree, root_0);


            pushFollow(FOLLOW_params_in_mod364);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            char_literal6=(Token)match(input,66,FOLLOW_66_in_mod366); 

            pushFollow(FOLLOW_block_instructions_in_mod369);
            block_instructions7=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions7.getTree());

            ENDMODULE8=(Token)match(input,ENDMODULE,FOLLOW_ENDMODULE_in_mod371); 

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


    public static class block_instructions_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:84:1: block_instructions : ( instruction )* -> ^( LIST_INSTR ( instruction )* ) ;
    public final VlclParser.block_instructions_return block_instructions() throws RecognitionException {
        VlclParser.block_instructions_return retval = new VlclParser.block_instructions_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        VlclParser.instruction_return instruction9 =null;


        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:85:9: ( ( instruction )* -> ^( LIST_INSTR ( instruction )* ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:85:11: ( instruction )*
            {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:85:11: ( instruction )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ASSIGN||LA2_0==CASE||LA2_0==FOR||LA2_0==FUNCTION||(LA2_0 >= ID && LA2_0 <= INPUT)||(LA2_0 >= OUTPUT && LA2_0 <= PARAMETER)||LA2_0==REG||LA2_0==WIRE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:85:12: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_block_instructions401);
            	    instruction9=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction9.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
            // 85:26: -> ^( LIST_INSTR ( instruction )* )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:85:29: ^( LIST_INSTR ( instruction )* )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:85:42: ( instruction )*
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


    public static class block_stmts_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_stmts"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:88:1: block_stmts : ( statement )* -> ^( LIST_STMTS ( statement )* ) ;
    public final VlclParser.block_stmts_return block_stmts() throws RecognitionException {
        VlclParser.block_stmts_return retval = new VlclParser.block_stmts_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        VlclParser.statement_return statement10 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:89:9: ( ( statement )* -> ^( LIST_STMTS ( statement )* ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:89:11: ( statement )*
            {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:89:11: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ASSIGN||LA3_0==CASE||LA3_0==FOR||(LA3_0 >= ID && LA3_0 <= IF)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:89:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block_stmts438);
            	    statement10=statement();

            	    state._fsp--;

            	    stream_statement.add(statement10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 89:24: -> ^( LIST_STMTS ( statement )* )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:89:27: ^( LIST_STMTS ( statement )* )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(LIST_STMTS, "LIST_STMTS")
                , root_1);

                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:89:40: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // $ANTLR end "block_stmts"


    public static class instruction_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:92:1: instruction : ( signal_dec | var_dec | param_dec | mod_dec | func_dec | statement );
    public final VlclParser.instruction_return instruction() throws RecognitionException {
        VlclParser.instruction_return retval = new VlclParser.instruction_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        VlclParser.signal_dec_return signal_dec11 =null;

        VlclParser.var_dec_return var_dec12 =null;

        VlclParser.param_dec_return param_dec13 =null;

        VlclParser.mod_dec_return mod_dec14 =null;

        VlclParser.func_dec_return func_dec15 =null;

        VlclParser.statement_return statement16 =null;



        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:93:9: ( signal_dec | var_dec | param_dec | mod_dec | func_dec | statement )
            int alt4=6;
            switch ( input.LA(1) ) {
            case INOUT:
            case INPUT:
            case OUTPUT:
                {
                alt4=1;
                }
                break;
            case REG:
            case WIRE:
                {
                alt4=2;
                }
                break;
            case PARAMETER:
                {
                alt4=3;
                }
                break;
            case ID:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==ID) ) {
                    alt4=4;
                }
                else if ( (LA4_4==ASSIGNSIMBOL||LA4_4==67) ) {
                    alt4=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                alt4=5;
                }
                break;
            case ASSIGN:
            case CASE:
            case FOR:
            case IF:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:93:11: signal_dec
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_signal_dec_in_instruction474);
                    signal_dec11=signal_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, signal_dec11.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:94:11: var_dec
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_var_dec_in_instruction487);
                    var_dec12=var_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, var_dec12.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:95:11: param_dec
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_param_dec_in_instruction499);
                    param_dec13=param_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, param_dec13.getTree());

                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:96:11: mod_dec
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_mod_dec_in_instruction511);
                    mod_dec14=mod_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, mod_dec14.getTree());

                    }
                    break;
                case 5 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:97:11: func_dec
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_func_dec_in_instruction523);
                    func_dec15=func_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, func_dec15.getTree());

                    }
                    break;
                case 6 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:98:11: statement
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_instruction535);
                    statement16=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement16.getTree());

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


    public static class statement_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:101:1: statement : ( assign | assignation_stmt | ifelse_stmt | case_stmt | for_loop );
    public final VlclParser.statement_return statement() throws RecognitionException {
        VlclParser.statement_return retval = new VlclParser.statement_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        VlclParser.assign_return assign17 =null;

        VlclParser.assignation_stmt_return assignation_stmt18 =null;

        VlclParser.ifelse_stmt_return ifelse_stmt19 =null;

        VlclParser.case_stmt_return case_stmt20 =null;

        VlclParser.for_loop_return for_loop21 =null;



        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:102:9: ( assign | assignation_stmt | ifelse_stmt | case_stmt | for_loop )
            int alt5=5;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case IF:
                {
                alt5=3;
                }
                break;
            case CASE:
                {
                alt5=4;
                }
                break;
            case FOR:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:102:11: assign
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_statement560);
                    assign17=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign17.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:103:11: assignation_stmt
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_stmt_in_statement572);
                    assignation_stmt18=assignation_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation_stmt18.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:104:11: ifelse_stmt
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_ifelse_stmt_in_statement584);
                    ifelse_stmt19=ifelse_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ifelse_stmt19.getTree());

                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:105:11: case_stmt
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_case_stmt_in_statement596);
                    case_stmt20=case_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, case_stmt20.getTree());

                    }
                    break;
                case 5 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:106:11: for_loop
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_for_loop_in_statement608);
                    for_loop21=for_loop();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop21.getTree());

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
    // $ANTLR end "statement"


    public static class signal_dec_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signal_dec"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:112:1: signal_dec : ( INPUT ^| OUTPUT ^| INOUT ^) ( array_dec )? varslist ';' !;
    public final VlclParser.signal_dec_return signal_dec() throws RecognitionException {
        VlclParser.signal_dec_return retval = new VlclParser.signal_dec_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token INPUT22=null;
        Token OUTPUT23=null;
        Token INOUT24=null;
        Token char_literal27=null;
        VlclParser.array_dec_return array_dec25 =null;

        VlclParser.varslist_return varslist26 =null;


        VlclTree INPUT22_tree=null;
        VlclTree OUTPUT23_tree=null;
        VlclTree INOUT24_tree=null;
        VlclTree char_literal27_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:113:9: ( ( INPUT ^| OUTPUT ^| INOUT ^) ( array_dec )? varslist ';' !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:113:11: ( INPUT ^| OUTPUT ^| INOUT ^) ( array_dec )? varslist ';' !
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:113:11: ( INPUT ^| OUTPUT ^| INOUT ^)
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
            case INOUT:
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
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:113:12: INPUT ^
                    {
                    INPUT22=(Token)match(input,INPUT,FOLLOW_INPUT_in_signal_dec637); 
                    INPUT22_tree = 
                    (VlclTree)adaptor.create(INPUT22)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(INPUT22_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:113:21: OUTPUT ^
                    {
                    OUTPUT23=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_signal_dec642); 
                    OUTPUT23_tree = 
                    (VlclTree)adaptor.create(OUTPUT23)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(OUTPUT23_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:113:31: INOUT ^
                    {
                    INOUT24=(Token)match(input,INOUT,FOLLOW_INOUT_in_signal_dec647); 
                    INOUT24_tree = 
                    (VlclTree)adaptor.create(INOUT24)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(INOUT24_tree, root_0);


                    }
                    break;

            }


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:113:39: ( array_dec )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==67) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:113:39: array_dec
                    {
                    pushFollow(FOLLOW_array_dec_in_signal_dec651);
                    array_dec25=array_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, array_dec25.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_varslist_in_signal_dec654);
            varslist26=varslist();

            state._fsp--;

            adaptor.addChild(root_0, varslist26.getTree());

            char_literal27=(Token)match(input,66,FOLLOW_66_in_signal_dec656); 

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
    // $ANTLR end "signal_dec"


    public static class var_dec_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_dec"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:116:1: var_dec : ( REG ^ ( array_dec )? varslist ';' !| WIRE ^ ( array_dec )? ( in_assign | varslist ) ';' !);
    public final VlclParser.var_dec_return var_dec() throws RecognitionException {
        VlclParser.var_dec_return retval = new VlclParser.var_dec_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token REG28=null;
        Token char_literal31=null;
        Token WIRE32=null;
        Token char_literal36=null;
        VlclParser.array_dec_return array_dec29 =null;

        VlclParser.varslist_return varslist30 =null;

        VlclParser.array_dec_return array_dec33 =null;

        VlclParser.in_assign_return in_assign34 =null;

        VlclParser.varslist_return varslist35 =null;


        VlclTree REG28_tree=null;
        VlclTree char_literal31_tree=null;
        VlclTree WIRE32_tree=null;
        VlclTree char_literal36_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:116:9: ( REG ^ ( array_dec )? varslist ';' !| WIRE ^ ( array_dec )? ( in_assign | varslist ) ';' !)
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==REG) ) {
                alt11=1;
            }
            else if ( (LA11_0==WIRE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:116:11: REG ^ ( array_dec )? varslist ';' !
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    REG28=(Token)match(input,REG,FOLLOW_REG_in_var_dec674); 
                    REG28_tree = 
                    (VlclTree)adaptor.create(REG28)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(REG28_tree, root_0);


                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:116:16: ( array_dec )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==67) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:116:16: array_dec
                            {
                            pushFollow(FOLLOW_array_dec_in_var_dec677);
                            array_dec29=array_dec();

                            state._fsp--;

                            adaptor.addChild(root_0, array_dec29.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_varslist_in_var_dec680);
                    varslist30=varslist();

                    state._fsp--;

                    adaptor.addChild(root_0, varslist30.getTree());

                    char_literal31=(Token)match(input,66,FOLLOW_66_in_var_dec682); 

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:117:11: WIRE ^ ( array_dec )? ( in_assign | varslist ) ';' !
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    WIRE32=(Token)match(input,WIRE,FOLLOW_WIRE_in_var_dec695); 
                    WIRE32_tree = 
                    (VlclTree)adaptor.create(WIRE32)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(WIRE32_tree, root_0);


                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:117:17: ( array_dec )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==67) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:117:17: array_dec
                            {
                            pushFollow(FOLLOW_array_dec_in_var_dec698);
                            array_dec33=array_dec();

                            state._fsp--;

                            adaptor.addChild(root_0, array_dec33.getTree());

                            }
                            break;

                    }


                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:117:28: ( in_assign | varslist )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==ASSIGNSIMBOL) ) {
                            alt10=1;
                        }
                        else if ( (LA10_1==64||LA10_1==66) ) {
                            alt10=2;
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
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:117:29: in_assign
                            {
                            pushFollow(FOLLOW_in_assign_in_var_dec702);
                            in_assign34=in_assign();

                            state._fsp--;

                            adaptor.addChild(root_0, in_assign34.getTree());

                            }
                            break;
                        case 2 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:117:41: varslist
                            {
                            pushFollow(FOLLOW_varslist_in_var_dec706);
                            varslist35=varslist();

                            state._fsp--;

                            adaptor.addChild(root_0, varslist35.getTree());

                            }
                            break;

                    }


                    char_literal36=(Token)match(input,66,FOLLOW_66_in_var_dec709); 

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
    // $ANTLR end "var_dec"


    public static class param_dec_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_dec"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:120:1: param_dec : PARAMETER ^ ( array_dec )? in_assign ( ',' ! in_assign )* ';' !;
    public final VlclParser.param_dec_return param_dec() throws RecognitionException {
        VlclParser.param_dec_return retval = new VlclParser.param_dec_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token PARAMETER37=null;
        Token char_literal40=null;
        Token char_literal42=null;
        VlclParser.array_dec_return array_dec38 =null;

        VlclParser.in_assign_return in_assign39 =null;

        VlclParser.in_assign_return in_assign41 =null;


        VlclTree PARAMETER37_tree=null;
        VlclTree char_literal40_tree=null;
        VlclTree char_literal42_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:121:9: ( PARAMETER ^ ( array_dec )? in_assign ( ',' ! in_assign )* ';' !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:121:11: PARAMETER ^ ( array_dec )? in_assign ( ',' ! in_assign )* ';' !
            {
            root_0 = (VlclTree)adaptor.nil();


            PARAMETER37=(Token)match(input,PARAMETER,FOLLOW_PARAMETER_in_param_dec735); 
            PARAMETER37_tree = 
            (VlclTree)adaptor.create(PARAMETER37)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(PARAMETER37_tree, root_0);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:121:22: ( array_dec )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==67) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:121:22: array_dec
                    {
                    pushFollow(FOLLOW_array_dec_in_param_dec738);
                    array_dec38=array_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, array_dec38.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_in_assign_in_param_dec741);
            in_assign39=in_assign();

            state._fsp--;

            adaptor.addChild(root_0, in_assign39.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:121:43: ( ',' ! in_assign )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==64) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:121:44: ',' ! in_assign
            	    {
            	    char_literal40=(Token)match(input,64,FOLLOW_64_in_param_dec744); 

            	    pushFollow(FOLLOW_in_assign_in_param_dec747);
            	    in_assign41=in_assign();

            	    state._fsp--;

            	    adaptor.addChild(root_0, in_assign41.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            char_literal42=(Token)match(input,66,FOLLOW_66_in_param_dec751); 

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
    // $ANTLR end "param_dec"


    public static class in_assign_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_assign"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:124:1: in_assign : ID ASSIGNSIMBOL expr -> ^( ASSIGNATION ID expr ) ;
    public final VlclParser.in_assign_return in_assign() throws RecognitionException {
        VlclParser.in_assign_return retval = new VlclParser.in_assign_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID43=null;
        Token ASSIGNSIMBOL44=null;
        VlclParser.expr_return expr45 =null;


        VlclTree ID43_tree=null;
        VlclTree ASSIGNSIMBOL44_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGNSIMBOL=new RewriteRuleTokenStream(adaptor,"token ASSIGNSIMBOL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:125:9: ( ID ASSIGNSIMBOL expr -> ^( ASSIGNATION ID expr ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:125:11: ID ASSIGNSIMBOL expr
            {
            ID43=(Token)match(input,ID,FOLLOW_ID_in_in_assign777);  
            stream_ID.add(ID43);


            ASSIGNSIMBOL44=(Token)match(input,ASSIGNSIMBOL,FOLLOW_ASSIGNSIMBOL_in_in_assign779);  
            stream_ASSIGNSIMBOL.add(ASSIGNSIMBOL44);


            pushFollow(FOLLOW_expr_in_in_assign781);
            expr45=expr();

            state._fsp--;

            stream_expr.add(expr45.getTree());

            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 125:32: -> ^( ASSIGNATION ID expr )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:125:35: ^( ASSIGNATION ID expr )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(ASSIGNATION, "ASSIGNATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

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
    // $ANTLR end "in_assign"


    public static class mod_dec_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mod_dec"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:128:1: mod_dec : ID ID call_params ';' -> ^( MODULE ID ID call_params ) ;
    public final VlclParser.mod_dec_return mod_dec() throws RecognitionException {
        VlclParser.mod_dec_return retval = new VlclParser.mod_dec_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID46=null;
        Token ID47=null;
        Token char_literal49=null;
        VlclParser.call_params_return call_params48 =null;


        VlclTree ID46_tree=null;
        VlclTree ID47_tree=null;
        VlclTree char_literal49_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_call_params=new RewriteRuleSubtreeStream(adaptor,"rule call_params");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:128:9: ( ID ID call_params ';' -> ^( MODULE ID ID call_params ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:128:11: ID ID call_params ';'
            {
            ID46=(Token)match(input,ID,FOLLOW_ID_in_mod_dec808);  
            stream_ID.add(ID46);


            ID47=(Token)match(input,ID,FOLLOW_ID_in_mod_dec810);  
            stream_ID.add(ID47);


            pushFollow(FOLLOW_call_params_in_mod_dec812);
            call_params48=call_params();

            state._fsp--;

            stream_call_params.add(call_params48.getTree());

            char_literal49=(Token)match(input,66,FOLLOW_66_in_mod_dec814);  
            stream_66.add(char_literal49);


            // AST REWRITE
            // elements: ID, call_params, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 128:33: -> ^( MODULE ID ID call_params )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:128:36: ^( MODULE ID ID call_params )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(MODULE, "MODULE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_call_params.nextTree());

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
    // $ANTLR end "mod_dec"


    public static class func_dec_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_dec"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:131:1: func_dec : FUNCTION ^ ( array_dec )? ID ';' ! func_init beginend_stmt ENDFUNCTION !;
    public final VlclParser.func_dec_return func_dec() throws RecognitionException {
        VlclParser.func_dec_return retval = new VlclParser.func_dec_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token FUNCTION50=null;
        Token ID52=null;
        Token char_literal53=null;
        Token ENDFUNCTION56=null;
        VlclParser.array_dec_return array_dec51 =null;

        VlclParser.func_init_return func_init54 =null;

        VlclParser.beginend_stmt_return beginend_stmt55 =null;


        VlclTree FUNCTION50_tree=null;
        VlclTree ID52_tree=null;
        VlclTree char_literal53_tree=null;
        VlclTree ENDFUNCTION56_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:131:9: ( FUNCTION ^ ( array_dec )? ID ';' ! func_init beginend_stmt ENDFUNCTION !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:131:11: FUNCTION ^ ( array_dec )? ID ';' ! func_init beginend_stmt ENDFUNCTION !
            {
            root_0 = (VlclTree)adaptor.nil();


            FUNCTION50=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_func_dec842); 
            FUNCTION50_tree = 
            (VlclTree)adaptor.create(FUNCTION50)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(FUNCTION50_tree, root_0);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:131:21: ( array_dec )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==67) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:131:21: array_dec
                    {
                    pushFollow(FOLLOW_array_dec_in_func_dec845);
                    array_dec51=array_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, array_dec51.getTree());

                    }
                    break;

            }


            ID52=(Token)match(input,ID,FOLLOW_ID_in_func_dec848); 
            ID52_tree = 
            (VlclTree)adaptor.create(ID52)
            ;
            adaptor.addChild(root_0, ID52_tree);


            char_literal53=(Token)match(input,66,FOLLOW_66_in_func_dec850); 

            pushFollow(FOLLOW_func_init_in_func_dec853);
            func_init54=func_init();

            state._fsp--;

            adaptor.addChild(root_0, func_init54.getTree());

            pushFollow(FOLLOW_beginend_stmt_in_func_dec855);
            beginend_stmt55=beginend_stmt();

            state._fsp--;

            adaptor.addChild(root_0, beginend_stmt55.getTree());

            ENDFUNCTION56=(Token)match(input,ENDFUNCTION,FOLLOW_ENDFUNCTION_in_func_dec857); 

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
    // $ANTLR end "func_dec"


    public static class func_init_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_init"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:134:1: func_init : ( func_input | var_dec )* ;
    public final VlclParser.func_init_return func_init() throws RecognitionException {
        VlclParser.func_init_return retval = new VlclParser.func_init_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        VlclParser.func_input_return func_input57 =null;

        VlclParser.var_dec_return var_dec58 =null;



        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:135:9: ( ( func_input | var_dec )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:135:11: ( func_input | var_dec )*
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:135:11: ( func_input | var_dec )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= INOUT && LA15_0 <= INPUT)) ) {
                    alt15=1;
                }
                else if ( (LA15_0==REG||LA15_0==WIRE) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:135:12: func_input
            	    {
            	    pushFollow(FOLLOW_func_input_in_func_init884);
            	    func_input57=func_input();

            	    state._fsp--;

            	    adaptor.addChild(root_0, func_input57.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:135:25: var_dec
            	    {
            	    pushFollow(FOLLOW_var_dec_in_func_init888);
            	    var_dec58=var_dec();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_dec58.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "func_init"


    public static class func_input_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_input"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:138:1: func_input : ( INPUT ^| INOUT ^) ( array_dec )? varslist ';' !;
    public final VlclParser.func_input_return func_input() throws RecognitionException {
        VlclParser.func_input_return retval = new VlclParser.func_input_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token INPUT59=null;
        Token INOUT60=null;
        Token char_literal63=null;
        VlclParser.array_dec_return array_dec61 =null;

        VlclParser.varslist_return varslist62 =null;


        VlclTree INPUT59_tree=null;
        VlclTree INOUT60_tree=null;
        VlclTree char_literal63_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:139:9: ( ( INPUT ^| INOUT ^) ( array_dec )? varslist ';' !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:139:11: ( INPUT ^| INOUT ^) ( array_dec )? varslist ';' !
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:139:11: ( INPUT ^| INOUT ^)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INPUT) ) {
                alt16=1;
            }
            else if ( (LA16_0==INOUT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:139:12: INPUT ^
                    {
                    INPUT59=(Token)match(input,INPUT,FOLLOW_INPUT_in_func_input916); 
                    INPUT59_tree = 
                    (VlclTree)adaptor.create(INPUT59)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(INPUT59_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:139:21: INOUT ^
                    {
                    INOUT60=(Token)match(input,INOUT,FOLLOW_INOUT_in_func_input921); 
                    INOUT60_tree = 
                    (VlclTree)adaptor.create(INOUT60)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(INOUT60_tree, root_0);


                    }
                    break;

            }


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:139:29: ( array_dec )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==67) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:139:29: array_dec
                    {
                    pushFollow(FOLLOW_array_dec_in_func_input925);
                    array_dec61=array_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, array_dec61.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_varslist_in_func_input928);
            varslist62=varslist();

            state._fsp--;

            adaptor.addChild(root_0, varslist62.getTree());

            char_literal63=(Token)match(input,66,FOLLOW_66_in_func_input930); 

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
    // $ANTLR end "func_input"


    public static class assign_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:144:1: assign : ASSIGN ^ ( array_dec ID | concat_expr ) ASSIGNSIMBOL ! expr ';' !;
    public final VlclParser.assign_return assign() throws RecognitionException {
        VlclParser.assign_return retval = new VlclParser.assign_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ASSIGN64=null;
        Token ID66=null;
        Token ASSIGNSIMBOL68=null;
        Token char_literal70=null;
        VlclParser.array_dec_return array_dec65 =null;

        VlclParser.concat_expr_return concat_expr67 =null;

        VlclParser.expr_return expr69 =null;


        VlclTree ASSIGN64_tree=null;
        VlclTree ID66_tree=null;
        VlclTree ASSIGNSIMBOL68_tree=null;
        VlclTree char_literal70_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:144:9: ( ASSIGN ^ ( array_dec ID | concat_expr ) ASSIGNSIMBOL ! expr ';' !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:144:11: ASSIGN ^ ( array_dec ID | concat_expr ) ASSIGNSIMBOL ! expr ';' !
            {
            root_0 = (VlclTree)adaptor.nil();


            ASSIGN64=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign951); 
            ASSIGN64_tree = 
            (VlclTree)adaptor.create(ASSIGN64)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(ASSIGN64_tree, root_0);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:144:19: ( array_dec ID | concat_expr )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==67) ) {
                alt18=1;
            }
            else if ( (LA18_0==ANDBW||LA18_0==BIN||LA18_0==DEC||(LA18_0 >= HEX && LA18_0 <= ID)||(LA18_0 >= NAND && LA18_0 <= NUM)||LA18_0==OCT||LA18_0==ORBW||LA18_0==PLUS||(LA18_0 >= XORS && LA18_0 <= 62)||LA18_0==69) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:144:20: array_dec ID
                    {
                    pushFollow(FOLLOW_array_dec_in_assign955);
                    array_dec65=array_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, array_dec65.getTree());

                    ID66=(Token)match(input,ID,FOLLOW_ID_in_assign957); 
                    ID66_tree = 
                    (VlclTree)adaptor.create(ID66)
                    ;
                    adaptor.addChild(root_0, ID66_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:144:35: concat_expr
                    {
                    pushFollow(FOLLOW_concat_expr_in_assign961);
                    concat_expr67=concat_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, concat_expr67.getTree());

                    }
                    break;

            }


            ASSIGNSIMBOL68=(Token)match(input,ASSIGNSIMBOL,FOLLOW_ASSIGNSIMBOL_in_assign964); 

            pushFollow(FOLLOW_expr_in_assign967);
            expr69=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr69.getTree());

            char_literal70=(Token)match(input,66,FOLLOW_66_in_assign969); 

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
    // $ANTLR end "assign"


    public static class assignation_stmt_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignation_stmt"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:147:1: assignation_stmt : ( ID | array_acces ) ASSIGNSIMBOL ^ expr ';' !;
    public final VlclParser.assignation_stmt_return assignation_stmt() throws RecognitionException {
        VlclParser.assignation_stmt_return retval = new VlclParser.assignation_stmt_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID71=null;
        Token ASSIGNSIMBOL73=null;
        Token char_literal75=null;
        VlclParser.array_acces_return array_acces72 =null;

        VlclParser.expr_return expr74 =null;


        VlclTree ID71_tree=null;
        VlclTree ASSIGNSIMBOL73_tree=null;
        VlclTree char_literal75_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:148:9: ( ( ID | array_acces ) ASSIGNSIMBOL ^ expr ';' !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:148:11: ( ID | array_acces ) ASSIGNSIMBOL ^ expr ';' !
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:148:11: ( ID | array_acces )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==67) ) {
                    alt19=2;
                }
                else if ( (LA19_1==ASSIGNSIMBOL) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:148:12: ID
                    {
                    ID71=(Token)match(input,ID,FOLLOW_ID_in_assignation_stmt996); 
                    ID71_tree = 
                    (VlclTree)adaptor.create(ID71)
                    ;
                    adaptor.addChild(root_0, ID71_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:148:17: array_acces
                    {
                    pushFollow(FOLLOW_array_acces_in_assignation_stmt1000);
                    array_acces72=array_acces();

                    state._fsp--;

                    adaptor.addChild(root_0, array_acces72.getTree());

                    }
                    break;

            }


            ASSIGNSIMBOL73=(Token)match(input,ASSIGNSIMBOL,FOLLOW_ASSIGNSIMBOL_in_assignation_stmt1003); 
            ASSIGNSIMBOL73_tree = 
            (VlclTree)adaptor.create(ASSIGNSIMBOL73)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(ASSIGNSIMBOL73_tree, root_0);


            pushFollow(FOLLOW_expr_in_assignation_stmt1006);
            expr74=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr74.getTree());

            char_literal75=(Token)match(input,66,FOLLOW_66_in_assignation_stmt1008); 

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
    // $ANTLR end "assignation_stmt"


    public static class beginend_stmt_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beginend_stmt"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:151:1: beginend_stmt : BEGIN ! block_stmts END !;
    public final VlclParser.beginend_stmt_return beginend_stmt() throws RecognitionException {
        VlclParser.beginend_stmt_return retval = new VlclParser.beginend_stmt_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token BEGIN76=null;
        Token END78=null;
        VlclParser.block_stmts_return block_stmts77 =null;


        VlclTree BEGIN76_tree=null;
        VlclTree END78_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:152:9: ( BEGIN ! block_stmts END !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:152:11: BEGIN ! block_stmts END !
            {
            root_0 = (VlclTree)adaptor.nil();


            BEGIN76=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_beginend_stmt1034); 

            pushFollow(FOLLOW_block_stmts_in_beginend_stmt1037);
            block_stmts77=block_stmts();

            state._fsp--;

            adaptor.addChild(root_0, block_stmts77.getTree());

            END78=(Token)match(input,END,FOLLOW_END_in_beginend_stmt1039); 

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
    // $ANTLR end "beginend_stmt"


    public static class ifelse_stmt_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifelse_stmt"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:155:1: ifelse_stmt : IF ^ '(' ! expr ')' ! intern_stmt_bloc ( else_stmt )? ;
    public final VlclParser.ifelse_stmt_return ifelse_stmt() throws RecognitionException {
        VlclParser.ifelse_stmt_return retval = new VlclParser.ifelse_stmt_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token IF79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        VlclParser.expr_return expr81 =null;

        VlclParser.intern_stmt_bloc_return intern_stmt_bloc83 =null;

        VlclParser.else_stmt_return else_stmt84 =null;


        VlclTree IF79_tree=null;
        VlclTree char_literal80_tree=null;
        VlclTree char_literal82_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:156:9: ( IF ^ '(' ! expr ')' ! intern_stmt_bloc ( else_stmt )? )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:156:11: IF ^ '(' ! expr ')' ! intern_stmt_bloc ( else_stmt )?
            {
            root_0 = (VlclTree)adaptor.nil();


            IF79=(Token)match(input,IF,FOLLOW_IF_in_ifelse_stmt1067); 
            IF79_tree = 
            (VlclTree)adaptor.create(IF79)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(IF79_tree, root_0);


            char_literal80=(Token)match(input,62,FOLLOW_62_in_ifelse_stmt1070); 

            pushFollow(FOLLOW_expr_in_ifelse_stmt1073);
            expr81=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr81.getTree());

            char_literal82=(Token)match(input,63,FOLLOW_63_in_ifelse_stmt1075); 

            pushFollow(FOLLOW_intern_stmt_bloc_in_ifelse_stmt1078);
            intern_stmt_bloc83=intern_stmt_bloc();

            state._fsp--;

            adaptor.addChild(root_0, intern_stmt_bloc83.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:156:47: ( else_stmt )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ELSE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:156:47: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_ifelse_stmt1080);
                    else_stmt84=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt84.getTree());

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
    // $ANTLR end "ifelse_stmt"


    public static class else_stmt_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:159:1: else_stmt : ELSE ^ ( ifelse_stmt | intern_stmt_bloc ) ;
    public final VlclParser.else_stmt_return else_stmt() throws RecognitionException {
        VlclParser.else_stmt_return retval = new VlclParser.else_stmt_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ELSE85=null;
        VlclParser.ifelse_stmt_return ifelse_stmt86 =null;

        VlclParser.intern_stmt_bloc_return intern_stmt_bloc87 =null;


        VlclTree ELSE85_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:160:9: ( ELSE ^ ( ifelse_stmt | intern_stmt_bloc ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:160:11: ELSE ^ ( ifelse_stmt | intern_stmt_bloc )
            {
            root_0 = (VlclTree)adaptor.nil();


            ELSE85=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1106); 
            ELSE85_tree = 
            (VlclTree)adaptor.create(ELSE85)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(ELSE85_tree, root_0);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:160:17: ( ifelse_stmt | intern_stmt_bloc )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IF) ) {
                alt21=1;
            }
            else if ( (LA21_0==ASSIGN||LA21_0==BEGIN||LA21_0==CASE||LA21_0==FOR||LA21_0==ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:160:18: ifelse_stmt
                    {
                    pushFollow(FOLLOW_ifelse_stmt_in_else_stmt1110);
                    ifelse_stmt86=ifelse_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ifelse_stmt86.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:160:32: intern_stmt_bloc
                    {
                    pushFollow(FOLLOW_intern_stmt_bloc_in_else_stmt1114);
                    intern_stmt_bloc87=intern_stmt_bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, intern_stmt_bloc87.getTree());

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
    // $ANTLR end "else_stmt"


    public static class case_stmt_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "case_stmt"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:163:1: case_stmt : CASE ^ '(' ! expr ')' ! ( case_item )+ ( default_item )? ENDCASE !;
    public final VlclParser.case_stmt_return case_stmt() throws RecognitionException {
        VlclParser.case_stmt_return retval = new VlclParser.case_stmt_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token CASE88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token ENDCASE94=null;
        VlclParser.expr_return expr90 =null;

        VlclParser.case_item_return case_item92 =null;

        VlclParser.default_item_return default_item93 =null;


        VlclTree CASE88_tree=null;
        VlclTree char_literal89_tree=null;
        VlclTree char_literal91_tree=null;
        VlclTree ENDCASE94_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:164:9: ( CASE ^ '(' ! expr ')' ! ( case_item )+ ( default_item )? ENDCASE !)
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:164:11: CASE ^ '(' ! expr ')' ! ( case_item )+ ( default_item )? ENDCASE !
            {
            root_0 = (VlclTree)adaptor.nil();


            CASE88=(Token)match(input,CASE,FOLLOW_CASE_in_case_stmt1141); 
            CASE88_tree = 
            (VlclTree)adaptor.create(CASE88)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(CASE88_tree, root_0);


            char_literal89=(Token)match(input,62,FOLLOW_62_in_case_stmt1144); 

            pushFollow(FOLLOW_expr_in_case_stmt1147);
            expr90=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr90.getTree());

            char_literal91=(Token)match(input,63,FOLLOW_63_in_case_stmt1149); 

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:164:32: ( case_item )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BIN||LA22_0==DEC||(LA22_0 >= HEX && LA22_0 <= ID)||LA22_0==NUM||LA22_0==OCT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:164:33: case_item
            	    {
            	    pushFollow(FOLLOW_case_item_in_case_stmt1153);
            	    case_item92=case_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, case_item92.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:164:45: ( default_item )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DEFAULT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:164:46: default_item
                    {
                    pushFollow(FOLLOW_default_item_in_case_stmt1158);
                    default_item93=default_item();

                    state._fsp--;

                    adaptor.addChild(root_0, default_item93.getTree());

                    }
                    break;

            }


            ENDCASE94=(Token)match(input,ENDCASE,FOLLOW_ENDCASE_in_case_stmt1162); 

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
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:167:1: case_item : case_opts ':' beginend_stmt -> ^( CASE_ITEM case_opts beginend_stmt ) ;
    public final VlclParser.case_item_return case_item() throws RecognitionException {
        VlclParser.case_item_return retval = new VlclParser.case_item_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal96=null;
        VlclParser.case_opts_return case_opts95 =null;

        VlclParser.beginend_stmt_return beginend_stmt97 =null;


        VlclTree char_literal96_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_case_opts=new RewriteRuleSubtreeStream(adaptor,"rule case_opts");
        RewriteRuleSubtreeStream stream_beginend_stmt=new RewriteRuleSubtreeStream(adaptor,"rule beginend_stmt");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:168:9: ( case_opts ':' beginend_stmt -> ^( CASE_ITEM case_opts beginend_stmt ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:168:11: case_opts ':' beginend_stmt
            {
            pushFollow(FOLLOW_case_opts_in_case_item1188);
            case_opts95=case_opts();

            state._fsp--;

            stream_case_opts.add(case_opts95.getTree());

            char_literal96=(Token)match(input,65,FOLLOW_65_in_case_item1190);  
            stream_65.add(char_literal96);


            pushFollow(FOLLOW_beginend_stmt_in_case_item1192);
            beginend_stmt97=beginend_stmt();

            state._fsp--;

            stream_beginend_stmt.add(beginend_stmt97.getTree());

            // AST REWRITE
            // elements: beginend_stmt, case_opts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 168:39: -> ^( CASE_ITEM case_opts beginend_stmt )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:168:42: ^( CASE_ITEM case_opts beginend_stmt )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(CASE_ITEM, "CASE_ITEM")
                , root_1);

                adaptor.addChild(root_1, stream_case_opts.nextTree());

                adaptor.addChild(root_1, stream_beginend_stmt.nextTree());

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
    // $ANTLR end "case_item"


    public static class case_opts_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "case_opts"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:171:1: case_opts : ( ID | number ) ( ',' ! ( ID | number ) )* ;
    public final VlclParser.case_opts_return case_opts() throws RecognitionException {
        VlclParser.case_opts_return retval = new VlclParser.case_opts_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID98=null;
        Token char_literal100=null;
        Token ID101=null;
        VlclParser.number_return number99 =null;

        VlclParser.number_return number102 =null;


        VlclTree ID98_tree=null;
        VlclTree char_literal100_tree=null;
        VlclTree ID101_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:9: ( ( ID | number ) ( ',' ! ( ID | number ) )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:11: ( ID | number ) ( ',' ! ( ID | number ) )*
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:11: ( ID | number )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==BIN||LA24_0==DEC||LA24_0==HEX||LA24_0==NUM||LA24_0==OCT) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:12: ID
                    {
                    ID98=(Token)match(input,ID,FOLLOW_ID_in_case_opts1228); 
                    ID98_tree = 
                    (VlclTree)adaptor.create(ID98)
                    ;
                    adaptor.addChild(root_0, ID98_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:17: number
                    {
                    pushFollow(FOLLOW_number_in_case_opts1232);
                    number99=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number99.getTree());

                    }
                    break;

            }


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:25: ( ',' ! ( ID | number ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==64) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:26: ',' ! ( ID | number )
            	    {
            	    char_literal100=(Token)match(input,64,FOLLOW_64_in_case_opts1236); 

            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:31: ( ID | number )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==ID) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==BIN||LA25_0==DEC||LA25_0==HEX||LA25_0==NUM||LA25_0==OCT) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:32: ID
            	            {
            	            ID101=(Token)match(input,ID,FOLLOW_ID_in_case_opts1240); 
            	            ID101_tree = 
            	            (VlclTree)adaptor.create(ID101)
            	            ;
            	            adaptor.addChild(root_0, ID101_tree);


            	            }
            	            break;
            	        case 2 :
            	            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:172:37: number
            	            {
            	            pushFollow(FOLLOW_number_in_case_opts1244);
            	            number102=number();

            	            state._fsp--;

            	            adaptor.addChild(root_0, number102.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "case_opts"


    public static class default_item_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "default_item"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:175:1: default_item : DEFAULT ':' beginend_stmt -> ^( CASE_ITEM DEFAULT beginend_stmt ) ;
    public final VlclParser.default_item_return default_item() throws RecognitionException {
        VlclParser.default_item_return retval = new VlclParser.default_item_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token DEFAULT103=null;
        Token char_literal104=null;
        VlclParser.beginend_stmt_return beginend_stmt105 =null;


        VlclTree DEFAULT103_tree=null;
        VlclTree char_literal104_tree=null;
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_beginend_stmt=new RewriteRuleSubtreeStream(adaptor,"rule beginend_stmt");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:176:9: ( DEFAULT ':' beginend_stmt -> ^( CASE_ITEM DEFAULT beginend_stmt ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:176:11: DEFAULT ':' beginend_stmt
            {
            DEFAULT103=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_default_item1272);  
            stream_DEFAULT.add(DEFAULT103);


            char_literal104=(Token)match(input,65,FOLLOW_65_in_default_item1274);  
            stream_65.add(char_literal104);


            pushFollow(FOLLOW_beginend_stmt_in_default_item1276);
            beginend_stmt105=beginend_stmt();

            state._fsp--;

            stream_beginend_stmt.add(beginend_stmt105.getTree());

            // AST REWRITE
            // elements: DEFAULT, beginend_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 176:37: -> ^( CASE_ITEM DEFAULT beginend_stmt )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:176:40: ^( CASE_ITEM DEFAULT beginend_stmt )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(CASE_ITEM, "CASE_ITEM")
                , root_1);

                adaptor.addChild(root_1, 
                stream_DEFAULT.nextNode()
                );

                adaptor.addChild(root_1, stream_beginend_stmt.nextTree());

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
    // $ANTLR end "default_item"


    public static class for_loop_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_loop"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:179:1: for_loop : FOR ^ '(' ! for_index ';' ! for_condition ';' ! for_increment ')' ! intern_stmt_bloc ;
    public final VlclParser.for_loop_return for_loop() throws RecognitionException {
        VlclParser.for_loop_return retval = new VlclParser.for_loop_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token FOR106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        Token char_literal111=null;
        Token char_literal113=null;
        VlclParser.for_index_return for_index108 =null;

        VlclParser.for_condition_return for_condition110 =null;

        VlclParser.for_increment_return for_increment112 =null;

        VlclParser.intern_stmt_bloc_return intern_stmt_bloc114 =null;


        VlclTree FOR106_tree=null;
        VlclTree char_literal107_tree=null;
        VlclTree char_literal109_tree=null;
        VlclTree char_literal111_tree=null;
        VlclTree char_literal113_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:179:9: ( FOR ^ '(' ! for_index ';' ! for_condition ';' ! for_increment ')' ! intern_stmt_bloc )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:179:11: FOR ^ '(' ! for_index ';' ! for_condition ';' ! for_increment ')' ! intern_stmt_bloc
            {
            root_0 = (VlclTree)adaptor.nil();


            FOR106=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop1302); 
            FOR106_tree = 
            (VlclTree)adaptor.create(FOR106)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(FOR106_tree, root_0);


            char_literal107=(Token)match(input,62,FOLLOW_62_in_for_loop1305); 

            pushFollow(FOLLOW_for_index_in_for_loop1308);
            for_index108=for_index();

            state._fsp--;

            adaptor.addChild(root_0, for_index108.getTree());

            char_literal109=(Token)match(input,66,FOLLOW_66_in_for_loop1310); 

            pushFollow(FOLLOW_for_condition_in_for_loop1313);
            for_condition110=for_condition();

            state._fsp--;

            adaptor.addChild(root_0, for_condition110.getTree());

            char_literal111=(Token)match(input,66,FOLLOW_66_in_for_loop1315); 

            pushFollow(FOLLOW_for_increment_in_for_loop1318);
            for_increment112=for_increment();

            state._fsp--;

            adaptor.addChild(root_0, for_increment112.getTree());

            char_literal113=(Token)match(input,63,FOLLOW_63_in_for_loop1320); 

            pushFollow(FOLLOW_intern_stmt_bloc_in_for_loop1323);
            intern_stmt_bloc114=intern_stmt_bloc();

            state._fsp--;

            adaptor.addChild(root_0, intern_stmt_bloc114.getTree());

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
    // $ANTLR end "for_loop"


    public static class for_index_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_index"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:182:1: for_index : ID ASSIGNSIMBOL ^ ( PLUS )? NUM ;
    public final VlclParser.for_index_return for_index() throws RecognitionException {
        VlclParser.for_index_return retval = new VlclParser.for_index_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID115=null;
        Token ASSIGNSIMBOL116=null;
        Token PLUS117=null;
        Token NUM118=null;

        VlclTree ID115_tree=null;
        VlclTree ASSIGNSIMBOL116_tree=null;
        VlclTree PLUS117_tree=null;
        VlclTree NUM118_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:183:9: ( ID ASSIGNSIMBOL ^ ( PLUS )? NUM )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:183:11: ID ASSIGNSIMBOL ^ ( PLUS )? NUM
            {
            root_0 = (VlclTree)adaptor.nil();


            ID115=(Token)match(input,ID,FOLLOW_ID_in_for_index1360); 
            ID115_tree = 
            (VlclTree)adaptor.create(ID115)
            ;
            adaptor.addChild(root_0, ID115_tree);


            ASSIGNSIMBOL116=(Token)match(input,ASSIGNSIMBOL,FOLLOW_ASSIGNSIMBOL_in_for_index1362); 
            ASSIGNSIMBOL116_tree = 
            (VlclTree)adaptor.create(ASSIGNSIMBOL116)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(ASSIGNSIMBOL116_tree, root_0);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:183:28: ( PLUS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==PLUS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:183:28: PLUS
                    {
                    PLUS117=(Token)match(input,PLUS,FOLLOW_PLUS_in_for_index1365); 
                    PLUS117_tree = 
                    (VlclTree)adaptor.create(PLUS117)
                    ;
                    adaptor.addChild(root_0, PLUS117_tree);


                    }
                    break;

            }


            NUM118=(Token)match(input,NUM,FOLLOW_NUM_in_for_index1368); 
            NUM118_tree = 
            (VlclTree)adaptor.create(NUM118)
            ;
            adaptor.addChild(root_0, NUM118_tree);


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
    // $ANTLR end "for_index"


    public static class for_condition_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_condition"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:186:1: for_condition : ID COMP ^ ( ( PLUS )? NUM | ID ) ;
    public final VlclParser.for_condition_return for_condition() throws RecognitionException {
        VlclParser.for_condition_return retval = new VlclParser.for_condition_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID119=null;
        Token COMP120=null;
        Token PLUS121=null;
        Token NUM122=null;
        Token ID123=null;

        VlclTree ID119_tree=null;
        VlclTree COMP120_tree=null;
        VlclTree PLUS121_tree=null;
        VlclTree NUM122_tree=null;
        VlclTree ID123_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:187:9: ( ID COMP ^ ( ( PLUS )? NUM | ID ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:187:11: ID COMP ^ ( ( PLUS )? NUM | ID )
            {
            root_0 = (VlclTree)adaptor.nil();


            ID119=(Token)match(input,ID,FOLLOW_ID_in_for_condition1393); 
            ID119_tree = 
            (VlclTree)adaptor.create(ID119)
            ;
            adaptor.addChild(root_0, ID119_tree);


            COMP120=(Token)match(input,COMP,FOLLOW_COMP_in_for_condition1395); 
            COMP120_tree = 
            (VlclTree)adaptor.create(COMP120)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(COMP120_tree, root_0);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:187:20: ( ( PLUS )? NUM | ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NUM||LA29_0==PLUS) ) {
                alt29=1;
            }
            else if ( (LA29_0==ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:187:21: ( PLUS )? NUM
                    {
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:187:21: ( PLUS )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==PLUS) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:187:21: PLUS
                            {
                            PLUS121=(Token)match(input,PLUS,FOLLOW_PLUS_in_for_condition1399); 
                            PLUS121_tree = 
                            (VlclTree)adaptor.create(PLUS121)
                            ;
                            adaptor.addChild(root_0, PLUS121_tree);


                            }
                            break;

                    }


                    NUM122=(Token)match(input,NUM,FOLLOW_NUM_in_for_condition1402); 
                    NUM122_tree = 
                    (VlclTree)adaptor.create(NUM122)
                    ;
                    adaptor.addChild(root_0, NUM122_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:187:33: ID
                    {
                    ID123=(Token)match(input,ID,FOLLOW_ID_in_for_condition1406); 
                    ID123_tree = 
                    (VlclTree)adaptor.create(ID123)
                    ;
                    adaptor.addChild(root_0, ID123_tree);


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
    // $ANTLR end "for_condition"


    public static class for_increment_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_increment"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:190:1: for_increment : ID ASSIGNSIMBOL ^ ( ID PLUS ^ ( ID | ( PLUS )? NUM ) ) ;
    public final VlclParser.for_increment_return for_increment() throws RecognitionException {
        VlclParser.for_increment_return retval = new VlclParser.for_increment_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID124=null;
        Token ASSIGNSIMBOL125=null;
        Token ID126=null;
        Token PLUS127=null;
        Token ID128=null;
        Token PLUS129=null;
        Token NUM130=null;

        VlclTree ID124_tree=null;
        VlclTree ASSIGNSIMBOL125_tree=null;
        VlclTree ID126_tree=null;
        VlclTree PLUS127_tree=null;
        VlclTree ID128_tree=null;
        VlclTree PLUS129_tree=null;
        VlclTree NUM130_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:9: ( ID ASSIGNSIMBOL ^ ( ID PLUS ^ ( ID | ( PLUS )? NUM ) ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:11: ID ASSIGNSIMBOL ^ ( ID PLUS ^ ( ID | ( PLUS )? NUM ) )
            {
            root_0 = (VlclTree)adaptor.nil();


            ID124=(Token)match(input,ID,FOLLOW_ID_in_for_increment1433); 
            ID124_tree = 
            (VlclTree)adaptor.create(ID124)
            ;
            adaptor.addChild(root_0, ID124_tree);


            ASSIGNSIMBOL125=(Token)match(input,ASSIGNSIMBOL,FOLLOW_ASSIGNSIMBOL_in_for_increment1435); 
            ASSIGNSIMBOL125_tree = 
            (VlclTree)adaptor.create(ASSIGNSIMBOL125)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(ASSIGNSIMBOL125_tree, root_0);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:28: ( ID PLUS ^ ( ID | ( PLUS )? NUM ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:29: ID PLUS ^ ( ID | ( PLUS )? NUM )
            {
            ID126=(Token)match(input,ID,FOLLOW_ID_in_for_increment1439); 
            ID126_tree = 
            (VlclTree)adaptor.create(ID126)
            ;
            adaptor.addChild(root_0, ID126_tree);


            PLUS127=(Token)match(input,PLUS,FOLLOW_PLUS_in_for_increment1441); 
            PLUS127_tree = 
            (VlclTree)adaptor.create(PLUS127)
            ;
            root_0 = (VlclTree)adaptor.becomeRoot(PLUS127_tree, root_0);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:38: ( ID | ( PLUS )? NUM )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==NUM||LA31_0==PLUS) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:39: ID
                    {
                    ID128=(Token)match(input,ID,FOLLOW_ID_in_for_increment1445); 
                    ID128_tree = 
                    (VlclTree)adaptor.create(ID128)
                    ;
                    adaptor.addChild(root_0, ID128_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:44: ( PLUS )? NUM
                    {
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:44: ( PLUS )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==PLUS) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:191:44: PLUS
                            {
                            PLUS129=(Token)match(input,PLUS,FOLLOW_PLUS_in_for_increment1449); 
                            PLUS129_tree = 
                            (VlclTree)adaptor.create(PLUS129)
                            ;
                            adaptor.addChild(root_0, PLUS129_tree);


                            }
                            break;

                    }


                    NUM130=(Token)match(input,NUM,FOLLOW_NUM_in_for_increment1452); 
                    NUM130_tree = 
                    (VlclTree)adaptor.create(NUM130)
                    ;
                    adaptor.addChild(root_0, NUM130_tree);


                    }
                    break;

            }


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
    // $ANTLR end "for_increment"


    public static class funcall_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:194:1: funcall : ID arg= '(' ( callvarslist )? ')' -> ^( FUNCALL ID ^( ARG_LIST[$arg, \"ARG_LIST\"] ( callvarslist )? ) ) ;
    public final VlclParser.funcall_return funcall() throws RecognitionException {
        VlclParser.funcall_return retval = new VlclParser.funcall_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token arg=null;
        Token ID131=null;
        Token char_literal133=null;
        VlclParser.callvarslist_return callvarslist132 =null;


        VlclTree arg_tree=null;
        VlclTree ID131_tree=null;
        VlclTree char_literal133_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_callvarslist=new RewriteRuleSubtreeStream(adaptor,"rule callvarslist");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:194:9: ( ID arg= '(' ( callvarslist )? ')' -> ^( FUNCALL ID ^( ARG_LIST[$arg, \"ARG_LIST\"] ( callvarslist )? ) ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:194:11: ID arg= '(' ( callvarslist )? ')'
            {
            ID131=(Token)match(input,ID,FOLLOW_ID_in_funcall1471);  
            stream_ID.add(ID131);


            arg=(Token)match(input,62,FOLLOW_62_in_funcall1475);  
            stream_62.add(arg);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:194:22: ( callvarslist )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:194:22: callvarslist
                    {
                    pushFollow(FOLLOW_callvarslist_in_funcall1477);
                    callvarslist132=callvarslist();

                    state._fsp--;

                    stream_callvarslist.add(callvarslist132.getTree());

                    }
                    break;

            }


            char_literal133=(Token)match(input,63,FOLLOW_63_in_funcall1480);  
            stream_63.add(char_literal133);


            // AST REWRITE
            // elements: callvarslist, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 194:40: -> ^( FUNCALL ID ^( ARG_LIST[$arg, \"ARG_LIST\"] ( callvarslist )? ) )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:194:43: ^( FUNCALL ID ^( ARG_LIST[$arg, \"ARG_LIST\"] ( callvarslist )? ) )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:194:56: ^( ARG_LIST[$arg, \"ARG_LIST\"] ( callvarslist )? )
                {
                VlclTree root_2 = (VlclTree)adaptor.nil();
                root_2 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(ARG_LIST, arg, "ARG_LIST")
                , root_2);

                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:194:85: ( callvarslist )?
                if ( stream_callvarslist.hasNext() ) {
                    adaptor.addChild(root_2, stream_callvarslist.nextTree());

                }
                stream_callvarslist.reset();

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


    public static class intern_stmt_bloc_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intern_stmt_bloc"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:197:1: intern_stmt_bloc : ( assign | assignation_stmt | case_stmt | for_loop | beginend_stmt );
    public final VlclParser.intern_stmt_bloc_return intern_stmt_bloc() throws RecognitionException {
        VlclParser.intern_stmt_bloc_return retval = new VlclParser.intern_stmt_bloc_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        VlclParser.assign_return assign134 =null;

        VlclParser.assignation_stmt_return assignation_stmt135 =null;

        VlclParser.case_stmt_return case_stmt136 =null;

        VlclParser.for_loop_return for_loop137 =null;

        VlclParser.beginend_stmt_return beginend_stmt138 =null;



        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:198:9: ( assign | assignation_stmt | case_stmt | for_loop | beginend_stmt )
            int alt33=5;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt33=1;
                }
                break;
            case ID:
                {
                alt33=2;
                }
                break;
            case CASE:
                {
                alt33=3;
                }
                break;
            case FOR:
                {
                alt33=4;
                }
                break;
            case BEGIN:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:198:11: assign
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_intern_stmt_bloc1521);
                    assign134=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign134.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:199:11: assignation_stmt
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_stmt_in_intern_stmt_bloc1533);
                    assignation_stmt135=assignation_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation_stmt135.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:200:11: case_stmt
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_case_stmt_in_intern_stmt_bloc1545);
                    case_stmt136=case_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, case_stmt136.getTree());

                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:201:11: for_loop
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_for_loop_in_intern_stmt_bloc1557);
                    for_loop137=for_loop();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop137.getTree());

                    }
                    break;
                case 5 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:202:11: beginend_stmt
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_beginend_stmt_in_intern_stmt_bloc1569);
                    beginend_stmt138=beginend_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, beginend_stmt138.getTree());

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
    // $ANTLR end "intern_stmt_bloc"


    public static class params_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:207:1: params : '(' varslist ')' -> ^( PARAMS varslist ) ;
    public final VlclParser.params_return params() throws RecognitionException {
        VlclParser.params_return retval = new VlclParser.params_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal139=null;
        Token char_literal141=null;
        VlclParser.varslist_return varslist140 =null;


        VlclTree char_literal139_tree=null;
        VlclTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_varslist=new RewriteRuleSubtreeStream(adaptor,"rule varslist");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:207:9: ( '(' varslist ')' -> ^( PARAMS varslist ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:207:11: '(' varslist ')'
            {
            char_literal139=(Token)match(input,62,FOLLOW_62_in_params1589);  
            stream_62.add(char_literal139);


            pushFollow(FOLLOW_varslist_in_params1591);
            varslist140=varslist();

            state._fsp--;

            stream_varslist.add(varslist140.getTree());

            char_literal141=(Token)match(input,63,FOLLOW_63_in_params1593);  
            stream_63.add(char_literal141);


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
            // 207:28: -> ^( PARAMS varslist )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:207:31: ^( PARAMS varslist )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                adaptor.addChild(root_1, stream_varslist.nextTree());

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
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:210:1: varslist : ID ( ',' ! ID )* ;
    public final VlclParser.varslist_return varslist() throws RecognitionException {
        VlclParser.varslist_return retval = new VlclParser.varslist_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID142=null;
        Token char_literal143=null;
        Token ID144=null;

        VlclTree ID142_tree=null;
        VlclTree char_literal143_tree=null;
        VlclTree ID144_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:210:9: ( ID ( ',' ! ID )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:210:11: ID ( ',' ! ID )*
            {
            root_0 = (VlclTree)adaptor.nil();


            ID142=(Token)match(input,ID,FOLLOW_ID_in_varslist1617); 
            ID142_tree = 
            (VlclTree)adaptor.create(ID142)
            ;
            adaptor.addChild(root_0, ID142_tree);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:210:14: ( ',' ! ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==64) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:210:15: ',' ! ID
            	    {
            	    char_literal143=(Token)match(input,64,FOLLOW_64_in_varslist1620); 

            	    ID144=(Token)match(input,ID,FOLLOW_ID_in_varslist1623); 
            	    ID144_tree = 
            	    (VlclTree)adaptor.create(ID144)
            	    ;
            	    adaptor.addChild(root_0, ID144_tree);


            	    }
            	    break;

            	default :
            	    break loop34;
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


    public static class call_params_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_params"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:213:1: call_params : '(' ( callvarslist )? ')' -> ^( PARAMS ( callvarslist )? ) ;
    public final VlclParser.call_params_return call_params() throws RecognitionException {
        VlclParser.call_params_return retval = new VlclParser.call_params_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal145=null;
        Token char_literal147=null;
        VlclParser.callvarslist_return callvarslist146 =null;


        VlclTree char_literal145_tree=null;
        VlclTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_callvarslist=new RewriteRuleSubtreeStream(adaptor,"rule callvarslist");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:214:9: ( '(' ( callvarslist )? ')' -> ^( PARAMS ( callvarslist )? ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:214:11: '(' ( callvarslist )? ')'
            {
            char_literal145=(Token)match(input,62,FOLLOW_62_in_call_params1650);  
            stream_62.add(char_literal145);


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:214:15: ( callvarslist )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:214:15: callvarslist
                    {
                    pushFollow(FOLLOW_callvarslist_in_call_params1652);
                    callvarslist146=callvarslist();

                    state._fsp--;

                    stream_callvarslist.add(callvarslist146.getTree());

                    }
                    break;

            }


            char_literal147=(Token)match(input,63,FOLLOW_63_in_call_params1655);  
            stream_63.add(char_literal147);


            // AST REWRITE
            // elements: callvarslist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 214:33: -> ^( PARAMS ( callvarslist )? )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:214:36: ^( PARAMS ( callvarslist )? )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:214:45: ( callvarslist )?
                if ( stream_callvarslist.hasNext() ) {
                    adaptor.addChild(root_1, stream_callvarslist.nextTree());

                }
                stream_callvarslist.reset();

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
    // $ANTLR end "call_params"


    public static class callvarslist_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callvarslist"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:217:1: callvarslist : varcall ( ',' ! varcall )* ;
    public final VlclParser.callvarslist_return callvarslist() throws RecognitionException {
        VlclParser.callvarslist_return retval = new VlclParser.callvarslist_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal149=null;
        VlclParser.varcall_return varcall148 =null;

        VlclParser.varcall_return varcall150 =null;


        VlclTree char_literal149_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:218:9: ( varcall ( ',' ! varcall )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:218:11: varcall ( ',' ! varcall )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_varcall_in_callvarslist1689);
            varcall148=varcall();

            state._fsp--;

            adaptor.addChild(root_0, varcall148.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:218:19: ( ',' ! varcall )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==64) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:218:20: ',' ! varcall
            	    {
            	    char_literal149=(Token)match(input,64,FOLLOW_64_in_callvarslist1692); 

            	    pushFollow(FOLLOW_varcall_in_callvarslist1695);
            	    varcall150=varcall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, varcall150.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "callvarslist"


    public static class varcall_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varcall"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:221:1: varcall : ( ID | array_acces );
    public final VlclParser.varcall_return varcall() throws RecognitionException {
        VlclParser.varcall_return retval = new VlclParser.varcall_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID151=null;
        VlclParser.array_acces_return array_acces152 =null;


        VlclTree ID151_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:221:9: ( ID | array_acces )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==67) ) {
                    alt37=2;
                }
                else if ( ((LA37_1 >= 63 && LA37_1 <= 64)) ) {
                    alt37=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:222:9: ID
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    ID151=(Token)match(input,ID,FOLLOW_ID_in_varcall1722); 
                    ID151_tree = 
                    (VlclTree)adaptor.create(ID151)
                    ;
                    adaptor.addChild(root_0, ID151_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:223:11: array_acces
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_array_acces_in_varcall1734);
                    array_acces152=array_acces();

                    state._fsp--;

                    adaptor.addChild(root_0, array_acces152.getTree());

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
    // $ANTLR end "varcall"


    public static class array_dec_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_dec"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:227:1: array_dec : '[' NUM ':' NUM ']' -> ^( ARRAY_RANGE NUM NUM ) ;
    public final VlclParser.array_dec_return array_dec() throws RecognitionException {
        VlclParser.array_dec_return retval = new VlclParser.array_dec_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal153=null;
        Token NUM154=null;
        Token char_literal155=null;
        Token NUM156=null;
        Token char_literal157=null;

        VlclTree char_literal153_tree=null;
        VlclTree NUM154_tree=null;
        VlclTree char_literal155_tree=null;
        VlclTree NUM156_tree=null;
        VlclTree char_literal157_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:228:9: ( '[' NUM ':' NUM ']' -> ^( ARRAY_RANGE NUM NUM ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:228:11: '[' NUM ':' NUM ']'
            {
            char_literal153=(Token)match(input,67,FOLLOW_67_in_array_dec1760);  
            stream_67.add(char_literal153);


            NUM154=(Token)match(input,NUM,FOLLOW_NUM_in_array_dec1762);  
            stream_NUM.add(NUM154);


            char_literal155=(Token)match(input,65,FOLLOW_65_in_array_dec1764);  
            stream_65.add(char_literal155);


            NUM156=(Token)match(input,NUM,FOLLOW_NUM_in_array_dec1766);  
            stream_NUM.add(NUM156);


            char_literal157=(Token)match(input,68,FOLLOW_68_in_array_dec1768);  
            stream_68.add(char_literal157);


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
            // 228:31: -> ^( ARRAY_RANGE NUM NUM )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:228:34: ^( ARRAY_RANGE NUM NUM )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(ARRAY_RANGE, "ARRAY_RANGE")
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


    public static class array_acces_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_acces"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:231:1: array_acces : ID '[' acces_expr ']' -> ^( ARRAY_ACCESS ID acces_expr ) ;
    public final VlclParser.array_acces_return array_acces() throws RecognitionException {
        VlclParser.array_acces_return retval = new VlclParser.array_acces_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        VlclParser.acces_expr_return acces_expr160 =null;


        VlclTree ID158_tree=null;
        VlclTree char_literal159_tree=null;
        VlclTree char_literal161_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_acces_expr=new RewriteRuleSubtreeStream(adaptor,"rule acces_expr");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:232:9: ( ID '[' acces_expr ']' -> ^( ARRAY_ACCESS ID acces_expr ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:232:11: ID '[' acces_expr ']'
            {
            ID158=(Token)match(input,ID,FOLLOW_ID_in_array_acces1803);  
            stream_ID.add(ID158);


            char_literal159=(Token)match(input,67,FOLLOW_67_in_array_acces1805);  
            stream_67.add(char_literal159);


            pushFollow(FOLLOW_acces_expr_in_array_acces1807);
            acces_expr160=acces_expr();

            state._fsp--;

            stream_acces_expr.add(acces_expr160.getTree());

            char_literal161=(Token)match(input,68,FOLLOW_68_in_array_acces1809);  
            stream_68.add(char_literal161);


            // AST REWRITE
            // elements: ID, acces_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 232:33: -> ^( ARRAY_ACCESS ID acces_expr )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:232:36: ^( ARRAY_ACCESS ID acces_expr )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(ARRAY_ACCESS, "ARRAY_ACCESS")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_acces_expr.nextTree());

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
    // $ANTLR end "array_acces"


    public static class acces_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "acces_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:235:1: acces_expr : expr ( ':' expr -> ^( PART_ARRAY_ACCESS expr expr ) | -> expr ) ;
    public final VlclParser.acces_expr_return acces_expr() throws RecognitionException {
        VlclParser.acces_expr_return retval = new VlclParser.acces_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal163=null;
        VlclParser.expr_return expr162 =null;

        VlclParser.expr_return expr164 =null;


        VlclTree char_literal163_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:236:9: ( expr ( ':' expr -> ^( PART_ARRAY_ACCESS expr expr ) | -> expr ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:236:11: expr ( ':' expr -> ^( PART_ARRAY_ACCESS expr expr ) | -> expr )
            {
            pushFollow(FOLLOW_expr_in_acces_expr1844);
            expr162=expr();

            state._fsp--;

            stream_expr.add(expr162.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:236:16: ( ':' expr -> ^( PART_ARRAY_ACCESS expr expr ) | -> expr )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==65) ) {
                alt38=1;
            }
            else if ( (LA38_0==68) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:236:17: ':' expr
                    {
                    char_literal163=(Token)match(input,65,FOLLOW_65_in_acces_expr1847);  
                    stream_65.add(char_literal163);


                    pushFollow(FOLLOW_expr_in_acces_expr1849);
                    expr164=expr();

                    state._fsp--;

                    stream_expr.add(expr164.getTree());

                    // AST REWRITE
                    // elements: expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (VlclTree)adaptor.nil();
                    // 236:26: -> ^( PART_ARRAY_ACCESS expr expr )
                    {
                        // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:236:29: ^( PART_ARRAY_ACCESS expr expr )
                        {
                        VlclTree root_1 = (VlclTree)adaptor.nil();
                        root_1 = (VlclTree)adaptor.becomeRoot(
                        (VlclTree)adaptor.create(PART_ARRAY_ACCESS, "PART_ARRAY_ACCESS")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:237:26: 
                    {
                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (VlclTree)adaptor.nil();
                    // 237:26: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "acces_expr"


    public static class expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:243:1: expr : logic_or_expr ( COND ^ cond_expr )? ;
    public final VlclParser.expr_return expr() throws RecognitionException {
        VlclParser.expr_return retval = new VlclParser.expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token COND166=null;
        VlclParser.logic_or_expr_return logic_or_expr165 =null;

        VlclParser.cond_expr_return cond_expr167 =null;


        VlclTree COND166_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:243:9: ( logic_or_expr ( COND ^ cond_expr )? )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:243:11: logic_or_expr ( COND ^ cond_expr )?
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_logic_or_expr_in_expr1927);
            logic_or_expr165=logic_or_expr();

            state._fsp--;

            adaptor.addChild(root_0, logic_or_expr165.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:243:25: ( COND ^ cond_expr )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COND) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:243:26: COND ^ cond_expr
                    {
                    COND166=(Token)match(input,COND,FOLLOW_COND_in_expr1930); 
                    COND166_tree = 
                    (VlclTree)adaptor.create(COND166)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(COND166_tree, root_0);


                    pushFollow(FOLLOW_cond_expr_in_expr1933);
                    cond_expr167=cond_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, cond_expr167.getTree());

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
    // $ANTLR end "expr"


    public static class cond_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:246:1: cond_expr : logic_or_expr ':' ! logic_or_expr ;
    public final VlclParser.cond_expr_return cond_expr() throws RecognitionException {
        VlclParser.cond_expr_return retval = new VlclParser.cond_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal169=null;
        VlclParser.logic_or_expr_return logic_or_expr168 =null;

        VlclParser.logic_or_expr_return logic_or_expr170 =null;


        VlclTree char_literal169_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:247:9: ( logic_or_expr ':' ! logic_or_expr )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:247:11: logic_or_expr ':' ! logic_or_expr
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_logic_or_expr_in_cond_expr1960);
            logic_or_expr168=logic_or_expr();

            state._fsp--;

            adaptor.addChild(root_0, logic_or_expr168.getTree());

            char_literal169=(Token)match(input,65,FOLLOW_65_in_cond_expr1962); 

            pushFollow(FOLLOW_logic_or_expr_in_cond_expr1965);
            logic_or_expr170=logic_or_expr();

            state._fsp--;

            adaptor.addChild(root_0, logic_or_expr170.getTree());

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
    // $ANTLR end "cond_expr"


    public static class logic_or_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_or_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:250:1: logic_or_expr : logic_and_expr ( OR ^ logic_and_expr )* ;
    public final VlclParser.logic_or_expr_return logic_or_expr() throws RecognitionException {
        VlclParser.logic_or_expr_return retval = new VlclParser.logic_or_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token OR172=null;
        VlclParser.logic_and_expr_return logic_and_expr171 =null;

        VlclParser.logic_and_expr_return logic_and_expr173 =null;


        VlclTree OR172_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:251:9: ( logic_and_expr ( OR ^ logic_and_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:251:11: logic_and_expr ( OR ^ logic_and_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_logic_and_expr_in_logic_or_expr1990);
            logic_and_expr171=logic_and_expr();

            state._fsp--;

            adaptor.addChild(root_0, logic_and_expr171.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:251:26: ( OR ^ logic_and_expr )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==OR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:251:27: OR ^ logic_and_expr
            	    {
            	    OR172=(Token)match(input,OR,FOLLOW_OR_in_logic_or_expr1993); 
            	    OR172_tree = 
            	    (VlclTree)adaptor.create(OR172)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(OR172_tree, root_0);


            	    pushFollow(FOLLOW_logic_and_expr_in_logic_or_expr1996);
            	    logic_and_expr173=logic_and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logic_and_expr173.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "logic_or_expr"


    public static class logic_and_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_and_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:254:1: logic_and_expr : bw_or_expr ( AND ^ bw_or_expr )* ;
    public final VlclParser.logic_and_expr_return logic_and_expr() throws RecognitionException {
        VlclParser.logic_and_expr_return retval = new VlclParser.logic_and_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token AND175=null;
        VlclParser.bw_or_expr_return bw_or_expr174 =null;

        VlclParser.bw_or_expr_return bw_or_expr176 =null;


        VlclTree AND175_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:255:9: ( bw_or_expr ( AND ^ bw_or_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:255:11: bw_or_expr ( AND ^ bw_or_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_bw_or_expr_in_logic_and_expr2023);
            bw_or_expr174=bw_or_expr();

            state._fsp--;

            adaptor.addChild(root_0, bw_or_expr174.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:255:22: ( AND ^ bw_or_expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==AND) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:255:23: AND ^ bw_or_expr
            	    {
            	    AND175=(Token)match(input,AND,FOLLOW_AND_in_logic_and_expr2026); 
            	    AND175_tree = 
            	    (VlclTree)adaptor.create(AND175)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(AND175_tree, root_0);


            	    pushFollow(FOLLOW_bw_or_expr_in_logic_and_expr2029);
            	    bw_or_expr176=bw_or_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bw_or_expr176.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "logic_and_expr"


    public static class bw_or_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bw_or_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:258:1: bw_or_expr : bw_xor_expr ( ORBW ^ bw_xor_expr )* ;
    public final VlclParser.bw_or_expr_return bw_or_expr() throws RecognitionException {
        VlclParser.bw_or_expr_return retval = new VlclParser.bw_or_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ORBW178=null;
        VlclParser.bw_xor_expr_return bw_xor_expr177 =null;

        VlclParser.bw_xor_expr_return bw_xor_expr179 =null;


        VlclTree ORBW178_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:259:9: ( bw_xor_expr ( ORBW ^ bw_xor_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:259:11: bw_xor_expr ( ORBW ^ bw_xor_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_bw_xor_expr_in_bw_or_expr2056);
            bw_xor_expr177=bw_xor_expr();

            state._fsp--;

            adaptor.addChild(root_0, bw_xor_expr177.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:259:23: ( ORBW ^ bw_xor_expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ORBW) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:259:24: ORBW ^ bw_xor_expr
            	    {
            	    ORBW178=(Token)match(input,ORBW,FOLLOW_ORBW_in_bw_or_expr2059); 
            	    ORBW178_tree = 
            	    (VlclTree)adaptor.create(ORBW178)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(ORBW178_tree, root_0);


            	    pushFollow(FOLLOW_bw_xor_expr_in_bw_or_expr2062);
            	    bw_xor_expr179=bw_xor_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bw_xor_expr179.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "bw_or_expr"


    public static class bw_xor_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bw_xor_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:262:1: bw_xor_expr : bw_and_expr ( XORS ^ bw_and_expr )* ;
    public final VlclParser.bw_xor_expr_return bw_xor_expr() throws RecognitionException {
        VlclParser.bw_xor_expr_return retval = new VlclParser.bw_xor_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token XORS181=null;
        VlclParser.bw_and_expr_return bw_and_expr180 =null;

        VlclParser.bw_and_expr_return bw_and_expr182 =null;


        VlclTree XORS181_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:263:9: ( bw_and_expr ( XORS ^ bw_and_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:263:11: bw_and_expr ( XORS ^ bw_and_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_bw_and_expr_in_bw_xor_expr2089);
            bw_and_expr180=bw_and_expr();

            state._fsp--;

            adaptor.addChild(root_0, bw_and_expr180.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:263:23: ( XORS ^ bw_and_expr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==XORS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:263:24: XORS ^ bw_and_expr
            	    {
            	    XORS181=(Token)match(input,XORS,FOLLOW_XORS_in_bw_xor_expr2092); 
            	    XORS181_tree = 
            	    (VlclTree)adaptor.create(XORS181)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(XORS181_tree, root_0);


            	    pushFollow(FOLLOW_bw_and_expr_in_bw_xor_expr2095);
            	    bw_and_expr182=bw_and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bw_and_expr182.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "bw_xor_expr"


    public static class bw_and_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bw_and_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:266:1: bw_and_expr : eq_expr ( ANDBW ^ eq_expr )* ;
    public final VlclParser.bw_and_expr_return bw_and_expr() throws RecognitionException {
        VlclParser.bw_and_expr_return retval = new VlclParser.bw_and_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ANDBW184=null;
        VlclParser.eq_expr_return eq_expr183 =null;

        VlclParser.eq_expr_return eq_expr185 =null;


        VlclTree ANDBW184_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:267:9: ( eq_expr ( ANDBW ^ eq_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:267:11: eq_expr ( ANDBW ^ eq_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_eq_expr_in_bw_and_expr2122);
            eq_expr183=eq_expr();

            state._fsp--;

            adaptor.addChild(root_0, eq_expr183.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:267:19: ( ANDBW ^ eq_expr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==ANDBW) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:267:20: ANDBW ^ eq_expr
            	    {
            	    ANDBW184=(Token)match(input,ANDBW,FOLLOW_ANDBW_in_bw_and_expr2125); 
            	    ANDBW184_tree = 
            	    (VlclTree)adaptor.create(ANDBW184)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(ANDBW184_tree, root_0);


            	    pushFollow(FOLLOW_eq_expr_in_bw_and_expr2128);
            	    eq_expr185=eq_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, eq_expr185.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "bw_and_expr"


    public static class eq_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eq_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:270:1: eq_expr : comp_expr ( EQ ^ comp_expr )* ;
    public final VlclParser.eq_expr_return eq_expr() throws RecognitionException {
        VlclParser.eq_expr_return retval = new VlclParser.eq_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token EQ187=null;
        VlclParser.comp_expr_return comp_expr186 =null;

        VlclParser.comp_expr_return comp_expr188 =null;


        VlclTree EQ187_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:270:9: ( comp_expr ( EQ ^ comp_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:270:11: comp_expr ( EQ ^ comp_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_comp_expr_in_eq_expr2147);
            comp_expr186=comp_expr();

            state._fsp--;

            adaptor.addChild(root_0, comp_expr186.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:270:21: ( EQ ^ comp_expr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==EQ) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:270:22: EQ ^ comp_expr
            	    {
            	    EQ187=(Token)match(input,EQ,FOLLOW_EQ_in_eq_expr2150); 
            	    EQ187_tree = 
            	    (VlclTree)adaptor.create(EQ187)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(EQ187_tree, root_0);


            	    pushFollow(FOLLOW_comp_expr_in_eq_expr2153);
            	    comp_expr188=comp_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comp_expr188.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "eq_expr"


    public static class comp_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comp_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:273:1: comp_expr : shift_expr ( COMP ^ shift_expr )* ;
    public final VlclParser.comp_expr_return comp_expr() throws RecognitionException {
        VlclParser.comp_expr_return retval = new VlclParser.comp_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token COMP190=null;
        VlclParser.shift_expr_return shift_expr189 =null;

        VlclParser.shift_expr_return shift_expr191 =null;


        VlclTree COMP190_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:274:9: ( shift_expr ( COMP ^ shift_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:274:11: shift_expr ( COMP ^ shift_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_shift_expr_in_comp_expr2180);
            shift_expr189=shift_expr();

            state._fsp--;

            adaptor.addChild(root_0, shift_expr189.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:274:22: ( COMP ^ shift_expr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMP) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:274:23: COMP ^ shift_expr
            	    {
            	    COMP190=(Token)match(input,COMP,FOLLOW_COMP_in_comp_expr2183); 
            	    COMP190_tree = 
            	    (VlclTree)adaptor.create(COMP190)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(COMP190_tree, root_0);


            	    pushFollow(FOLLOW_shift_expr_in_comp_expr2186);
            	    shift_expr191=shift_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shift_expr191.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // $ANTLR end "comp_expr"


    public static class shift_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shift_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:277:1: shift_expr : plus_expr ( SHIFT ^ NUM )? ;
    public final VlclParser.shift_expr_return shift_expr() throws RecognitionException {
        VlclParser.shift_expr_return retval = new VlclParser.shift_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token SHIFT193=null;
        Token NUM194=null;
        VlclParser.plus_expr_return plus_expr192 =null;


        VlclTree SHIFT193_tree=null;
        VlclTree NUM194_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:278:9: ( plus_expr ( SHIFT ^ NUM )? )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:278:11: plus_expr ( SHIFT ^ NUM )?
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_plus_expr_in_shift_expr2213);
            plus_expr192=plus_expr();

            state._fsp--;

            adaptor.addChild(root_0, plus_expr192.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:278:21: ( SHIFT ^ NUM )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==SHIFT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:278:22: SHIFT ^ NUM
                    {
                    SHIFT193=(Token)match(input,SHIFT,FOLLOW_SHIFT_in_shift_expr2216); 
                    SHIFT193_tree = 
                    (VlclTree)adaptor.create(SHIFT193)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(SHIFT193_tree, root_0);


                    NUM194=(Token)match(input,NUM,FOLLOW_NUM_in_shift_expr2219); 
                    NUM194_tree = 
                    (VlclTree)adaptor.create(NUM194)
                    ;
                    adaptor.addChild(root_0, NUM194_tree);


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
    // $ANTLR end "shift_expr"


    public static class plus_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "plus_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:281:1: plus_expr : term_expr ( PLUS ^ term_expr )* ;
    public final VlclParser.plus_expr_return plus_expr() throws RecognitionException {
        VlclParser.plus_expr_return retval = new VlclParser.plus_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token PLUS196=null;
        VlclParser.term_expr_return term_expr195 =null;

        VlclParser.term_expr_return term_expr197 =null;


        VlclTree PLUS196_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:282:9: ( term_expr ( PLUS ^ term_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:282:11: term_expr ( PLUS ^ term_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_term_expr_in_plus_expr2246);
            term_expr195=term_expr();

            state._fsp--;

            adaptor.addChild(root_0, term_expr195.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:282:21: ( PLUS ^ term_expr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==PLUS) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:282:22: PLUS ^ term_expr
            	    {
            	    PLUS196=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr2249); 
            	    PLUS196_tree = 
            	    (VlclTree)adaptor.create(PLUS196)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(PLUS196_tree, root_0);


            	    pushFollow(FOLLOW_term_expr_in_plus_expr2252);
            	    term_expr197=term_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term_expr197.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "plus_expr"


    public static class term_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:285:1: term_expr : concat_expr ( TERM ^ concat_expr )* ;
    public final VlclParser.term_expr_return term_expr() throws RecognitionException {
        VlclParser.term_expr_return retval = new VlclParser.term_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token TERM199=null;
        VlclParser.concat_expr_return concat_expr198 =null;

        VlclParser.concat_expr_return concat_expr200 =null;


        VlclTree TERM199_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:286:9: ( concat_expr ( TERM ^ concat_expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:286:11: concat_expr ( TERM ^ concat_expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_concat_expr_in_term_expr2279);
            concat_expr198=concat_expr();

            state._fsp--;

            adaptor.addChild(root_0, concat_expr198.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:286:23: ( TERM ^ concat_expr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==TERM) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:286:24: TERM ^ concat_expr
            	    {
            	    TERM199=(Token)match(input,TERM,FOLLOW_TERM_in_term_expr2282); 
            	    TERM199_tree = 
            	    (VlclTree)adaptor.create(TERM199)
            	    ;
            	    root_0 = (VlclTree)adaptor.becomeRoot(TERM199_tree, root_0);


            	    pushFollow(FOLLOW_concat_expr_in_term_expr2285);
            	    concat_expr200=concat_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, concat_expr200.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // $ANTLR end "term_expr"


    public static class concat_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "concat_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:289:1: concat_expr : ( unari_expr | ( num_mult )? '{' concat_params '}' -> ^( CONCAT ( num_mult )? concat_params ) );
    public final VlclParser.concat_expr_return concat_expr() throws RecognitionException {
        VlclParser.concat_expr_return retval = new VlclParser.concat_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal203=null;
        Token char_literal205=null;
        VlclParser.unari_expr_return unari_expr201 =null;

        VlclParser.num_mult_return num_mult202 =null;

        VlclParser.concat_params_return concat_params204 =null;


        VlclTree char_literal203_tree=null;
        VlclTree char_literal205_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_num_mult=new RewriteRuleSubtreeStream(adaptor,"rule num_mult");
        RewriteRuleSubtreeStream stream_concat_params=new RewriteRuleSubtreeStream(adaptor,"rule concat_params");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:290:9: ( unari_expr | ( num_mult )? '{' concat_params '}' -> ^( CONCAT ( num_mult )? concat_params ) )
            int alt51=2;
            switch ( input.LA(1) ) {
            case ANDBW:
            case BIN:
            case DEC:
            case HEX:
            case ID:
            case NAND:
            case NOR:
            case NOT:
            case NOTBW:
            case OCT:
            case ORBW:
            case PLUS:
            case XORS:
            case 62:
                {
                alt51=1;
                }
                break;
            case NUM:
                {
                int LA51_2 = input.LA(2);

                if ( ((LA51_2 >= AND && LA51_2 <= ANDBW)||LA51_2==ASSIGNSIMBOL||LA51_2==BIN||LA51_2==COMP||(LA51_2 >= COND && LA51_2 <= DEC)||LA51_2==EQ||LA51_2==HEX||(LA51_2 >= OCT && LA51_2 <= ORBW)||LA51_2==PLUS||(LA51_2 >= SHIFT && LA51_2 <= TERM)||LA51_2==XORS||(LA51_2 >= 63 && LA51_2 <= 66)||LA51_2==68||LA51_2==70) ) {
                    alt51=1;
                }
                else if ( (LA51_2==69) ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;

                }
                }
                break;
            case 69:
                {
                alt51=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:290:11: unari_expr
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_unari_expr_in_concat_expr2312);
                    unari_expr201=unari_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unari_expr201.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:291:11: ( num_mult )? '{' concat_params '}'
                    {
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:291:11: ( num_mult )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==NUM) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:291:11: num_mult
                            {
                            pushFollow(FOLLOW_num_mult_in_concat_expr2324);
                            num_mult202=num_mult();

                            state._fsp--;

                            stream_num_mult.add(num_mult202.getTree());

                            }
                            break;

                    }


                    char_literal203=(Token)match(input,69,FOLLOW_69_in_concat_expr2327);  
                    stream_69.add(char_literal203);


                    pushFollow(FOLLOW_concat_params_in_concat_expr2329);
                    concat_params204=concat_params();

                    state._fsp--;

                    stream_concat_params.add(concat_params204.getTree());

                    char_literal205=(Token)match(input,70,FOLLOW_70_in_concat_expr2331);  
                    stream_70.add(char_literal205);


                    // AST REWRITE
                    // elements: concat_params, num_mult
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (VlclTree)adaptor.nil();
                    // 291:43: -> ^( CONCAT ( num_mult )? concat_params )
                    {
                        // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:291:46: ^( CONCAT ( num_mult )? concat_params )
                        {
                        VlclTree root_1 = (VlclTree)adaptor.nil();
                        root_1 = (VlclTree)adaptor.becomeRoot(
                        (VlclTree)adaptor.create(CONCAT, "CONCAT")
                        , root_1);

                        // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:291:55: ( num_mult )?
                        if ( stream_num_mult.hasNext() ) {
                            adaptor.addChild(root_1, stream_num_mult.nextTree());

                        }
                        stream_num_mult.reset();

                        adaptor.addChild(root_1, stream_concat_params.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "concat_expr"


    public static class num_mult_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_mult"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:294:1: num_mult : NUM -> ^( CONCAT_MULT NUM ) ;
    public final VlclParser.num_mult_return num_mult() throws RecognitionException {
        VlclParser.num_mult_return retval = new VlclParser.num_mult_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token NUM206=null;

        VlclTree NUM206_tree=null;
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:294:9: ( NUM -> ^( CONCAT_MULT NUM ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:294:11: NUM
            {
            NUM206=(Token)match(input,NUM,FOLLOW_NUM_in_num_mult2358);  
            stream_NUM.add(NUM206);


            // AST REWRITE
            // elements: NUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (VlclTree)adaptor.nil();
            // 294:15: -> ^( CONCAT_MULT NUM )
            {
                // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:294:18: ^( CONCAT_MULT NUM )
                {
                VlclTree root_1 = (VlclTree)adaptor.nil();
                root_1 = (VlclTree)adaptor.becomeRoot(
                (VlclTree)adaptor.create(CONCAT_MULT, "CONCAT_MULT")
                , root_1);

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
    // $ANTLR end "num_mult"


    public static class concat_params_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "concat_params"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:297:1: concat_params : expr ( ',' ! expr )* ;
    public final VlclParser.concat_params_return concat_params() throws RecognitionException {
        VlclParser.concat_params_return retval = new VlclParser.concat_params_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token char_literal208=null;
        VlclParser.expr_return expr207 =null;

        VlclParser.expr_return expr209 =null;


        VlclTree char_literal208_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:298:9: ( expr ( ',' ! expr )* )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:298:11: expr ( ',' ! expr )*
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_concat_params2391);
            expr207=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr207.getTree());

            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:298:16: ( ',' ! expr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==64) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:298:17: ',' ! expr
            	    {
            	    char_literal208=(Token)match(input,64,FOLLOW_64_in_concat_params2394); 

            	    pushFollow(FOLLOW_expr_in_concat_params2397);
            	    expr209=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr209.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "concat_params"


    public static class unari_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unari_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:301:1: unari_expr : red_expr ;
    public final VlclParser.unari_expr_return unari_expr() throws RecognitionException {
        VlclParser.unari_expr_return retval = new VlclParser.unari_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        VlclParser.red_expr_return red_expr210 =null;



        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:302:9: ( red_expr )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:302:11: red_expr
            {
            root_0 = (VlclTree)adaptor.nil();


            pushFollow(FOLLOW_red_expr_in_unari_expr2424);
            red_expr210=red_expr();

            state._fsp--;

            adaptor.addChild(root_0, red_expr210.getTree());

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
    // $ANTLR end "unari_expr"


    public static class red_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "red_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:1: red_expr : ( ANDBW ^| ORBW ^| XORS ^| NAND ^| NOR ^)? bitlogic_neg ;
    public final VlclParser.red_expr_return red_expr() throws RecognitionException {
        VlclParser.red_expr_return retval = new VlclParser.red_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ANDBW211=null;
        Token ORBW212=null;
        Token XORS213=null;
        Token NAND214=null;
        Token NOR215=null;
        VlclParser.bitlogic_neg_return bitlogic_neg216 =null;


        VlclTree ANDBW211_tree=null;
        VlclTree ORBW212_tree=null;
        VlclTree XORS213_tree=null;
        VlclTree NAND214_tree=null;
        VlclTree NOR215_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:9: ( ( ANDBW ^| ORBW ^| XORS ^| NAND ^| NOR ^)? bitlogic_neg )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:11: ( ANDBW ^| ORBW ^| XORS ^| NAND ^| NOR ^)? bitlogic_neg
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:11: ( ANDBW ^| ORBW ^| XORS ^| NAND ^| NOR ^)?
            int alt53=6;
            switch ( input.LA(1) ) {
                case ANDBW:
                    {
                    alt53=1;
                    }
                    break;
                case ORBW:
                    {
                    alt53=2;
                    }
                    break;
                case XORS:
                    {
                    alt53=3;
                    }
                    break;
                case NAND:
                    {
                    alt53=4;
                    }
                    break;
                case NOR:
                    {
                    alt53=5;
                    }
                    break;
            }

            switch (alt53) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:12: ANDBW ^
                    {
                    ANDBW211=(Token)match(input,ANDBW,FOLLOW_ANDBW_in_red_expr2441); 
                    ANDBW211_tree = 
                    (VlclTree)adaptor.create(ANDBW211)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(ANDBW211_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:21: ORBW ^
                    {
                    ORBW212=(Token)match(input,ORBW,FOLLOW_ORBW_in_red_expr2446); 
                    ORBW212_tree = 
                    (VlclTree)adaptor.create(ORBW212)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(ORBW212_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:29: XORS ^
                    {
                    XORS213=(Token)match(input,XORS,FOLLOW_XORS_in_red_expr2451); 
                    XORS213_tree = 
                    (VlclTree)adaptor.create(XORS213)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(XORS213_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:37: NAND ^
                    {
                    NAND214=(Token)match(input,NAND,FOLLOW_NAND_in_red_expr2456); 
                    NAND214_tree = 
                    (VlclTree)adaptor.create(NAND214)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(NAND214_tree, root_0);


                    }
                    break;
                case 5 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:305:45: NOR ^
                    {
                    NOR215=(Token)match(input,NOR,FOLLOW_NOR_in_red_expr2461); 
                    NOR215_tree = 
                    (VlclTree)adaptor.create(NOR215)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(NOR215_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_bitlogic_neg_in_red_expr2466);
            bitlogic_neg216=bitlogic_neg();

            state._fsp--;

            adaptor.addChild(root_0, bitlogic_neg216.getTree());

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
    // $ANTLR end "red_expr"


    public static class bitlogic_neg_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitlogic_neg"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:308:1: bitlogic_neg : ( NOT ^| NOTBW ^)? paren_expr ;
    public final VlclParser.bitlogic_neg_return bitlogic_neg() throws RecognitionException {
        VlclParser.bitlogic_neg_return retval = new VlclParser.bitlogic_neg_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token NOT217=null;
        Token NOTBW218=null;
        VlclParser.paren_expr_return paren_expr219 =null;


        VlclTree NOT217_tree=null;
        VlclTree NOTBW218_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:309:9: ( ( NOT ^| NOTBW ^)? paren_expr )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:309:11: ( NOT ^| NOTBW ^)? paren_expr
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:309:11: ( NOT ^| NOTBW ^)?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==NOT) ) {
                alt54=1;
            }
            else if ( (LA54_0==NOTBW) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:309:12: NOT ^
                    {
                    NOT217=(Token)match(input,NOT,FOLLOW_NOT_in_bitlogic_neg2492); 
                    NOT217_tree = 
                    (VlclTree)adaptor.create(NOT217)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(NOT217_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:309:19: NOTBW ^
                    {
                    NOTBW218=(Token)match(input,NOTBW,FOLLOW_NOTBW_in_bitlogic_neg2497); 
                    NOTBW218_tree = 
                    (VlclTree)adaptor.create(NOTBW218)
                    ;
                    root_0 = (VlclTree)adaptor.becomeRoot(NOTBW218_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_paren_expr_in_bitlogic_neg2502);
            paren_expr219=paren_expr();

            state._fsp--;

            adaptor.addChild(root_0, paren_expr219.getTree());

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
    // $ANTLR end "bitlogic_neg"


    public static class paren_expr_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paren_expr"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:312:1: paren_expr : ( PLUS )? ( atom | '(' ! expr ')' !) ;
    public final VlclParser.paren_expr_return paren_expr() throws RecognitionException {
        VlclParser.paren_expr_return retval = new VlclParser.paren_expr_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token PLUS220=null;
        Token char_literal222=null;
        Token char_literal224=null;
        VlclParser.atom_return atom221 =null;

        VlclParser.expr_return expr223 =null;


        VlclTree PLUS220_tree=null;
        VlclTree char_literal222_tree=null;
        VlclTree char_literal224_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:313:9: ( ( PLUS )? ( atom | '(' ! expr ')' !) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:313:11: ( PLUS )? ( atom | '(' ! expr ')' !)
            {
            root_0 = (VlclTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:313:11: ( PLUS )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==PLUS) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:313:11: PLUS
                    {
                    PLUS220=(Token)match(input,PLUS,FOLLOW_PLUS_in_paren_expr2527); 
                    PLUS220_tree = 
                    (VlclTree)adaptor.create(PLUS220)
                    ;
                    adaptor.addChild(root_0, PLUS220_tree);


                    }
                    break;

            }


            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:313:17: ( atom | '(' ! expr ')' !)
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==BIN||LA56_0==DEC||(LA56_0 >= HEX && LA56_0 <= ID)||LA56_0==NUM||LA56_0==OCT) ) {
                alt56=1;
            }
            else if ( (LA56_0==62) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:313:18: atom
                    {
                    pushFollow(FOLLOW_atom_in_paren_expr2531);
                    atom221=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom221.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:313:25: '(' ! expr ')' !
                    {
                    char_literal222=(Token)match(input,62,FOLLOW_62_in_paren_expr2535); 

                    pushFollow(FOLLOW_expr_in_paren_expr2538);
                    expr223=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr223.getTree());

                    char_literal224=(Token)match(input,63,FOLLOW_63_in_paren_expr2540); 

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
    // $ANTLR end "paren_expr"


    public static class atom_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:316:1: atom : ( ID | array_acces | funcall | number );
    public final VlclParser.atom_return atom() throws RecognitionException {
        VlclParser.atom_return retval = new VlclParser.atom_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token ID225=null;
        VlclParser.array_acces_return array_acces226 =null;

        VlclParser.funcall_return funcall227 =null;

        VlclParser.number_return number228 =null;


        VlclTree ID225_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:316:9: ( ID | array_acces | funcall | number )
            int alt57=4;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ID) ) {
                switch ( input.LA(2) ) {
                case 67:
                    {
                    alt57=2;
                    }
                    break;
                case 62:
                    {
                    alt57=3;
                    }
                    break;
                case AND:
                case ANDBW:
                case ASSIGNSIMBOL:
                case COMP:
                case COND:
                case EQ:
                case OR:
                case ORBW:
                case PLUS:
                case SHIFT:
                case TERM:
                case XORS:
                case 63:
                case 64:
                case 65:
                case 66:
                case 68:
                case 70:
                    {
                    alt57=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA57_0==BIN||LA57_0==DEC||LA57_0==HEX||LA57_0==NUM||LA57_0==OCT) ) {
                alt57=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:317:9: ID
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    ID225=(Token)match(input,ID,FOLLOW_ID_in_atom2570); 
                    ID225_tree = 
                    (VlclTree)adaptor.create(ID225)
                    ;
                    adaptor.addChild(root_0, ID225_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:318:11: array_acces
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_array_acces_in_atom2582);
                    array_acces226=array_acces();

                    state._fsp--;

                    adaptor.addChild(root_0, array_acces226.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:319:11: funcall
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom2594);
                    funcall227=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall227.getTree());

                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:320:11: number
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_number_in_atom2606);
                    number228=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number228.getTree());

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
    // $ANTLR end "atom"


    public static class number_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:325:1: number : ( base_num | NUM | NUM base_num -> ^( NUM_CONST NUM ( base_num )? ) );
    public final VlclParser.number_return number() throws RecognitionException {
        VlclParser.number_return retval = new VlclParser.number_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token NUM230=null;
        Token NUM231=null;
        VlclParser.base_num_return base_num229 =null;

        VlclParser.base_num_return base_num232 =null;


        VlclTree NUM230_tree=null;
        VlclTree NUM231_tree=null;
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_base_num=new RewriteRuleSubtreeStream(adaptor,"rule base_num");
        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:325:9: ( base_num | NUM | NUM base_num -> ^( NUM_CONST NUM ( base_num )? ) )
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==BIN||LA58_0==DEC||LA58_0==HEX||LA58_0==OCT) ) {
                alt58=1;
            }
            else if ( (LA58_0==NUM) ) {
                int LA58_2 = input.LA(2);

                if ( ((LA58_2 >= AND && LA58_2 <= ANDBW)||LA58_2==ASSIGNSIMBOL||LA58_2==COMP||LA58_2==COND||LA58_2==EQ||(LA58_2 >= OR && LA58_2 <= ORBW)||LA58_2==PLUS||(LA58_2 >= SHIFT && LA58_2 <= TERM)||LA58_2==XORS||(LA58_2 >= 63 && LA58_2 <= 66)||LA58_2==68||LA58_2==70) ) {
                    alt58=2;
                }
                else if ( (LA58_2==BIN||LA58_2==DEC||LA58_2==HEX||LA58_2==OCT) ) {
                    alt58=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:325:11: base_num
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    pushFollow(FOLLOW_base_num_in_number2626);
                    base_num229=base_num();

                    state._fsp--;

                    adaptor.addChild(root_0, base_num229.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:326:11: NUM
                    {
                    root_0 = (VlclTree)adaptor.nil();


                    NUM230=(Token)match(input,NUM,FOLLOW_NUM_in_number2638); 
                    NUM230_tree = 
                    (VlclTree)adaptor.create(NUM230)
                    ;
                    adaptor.addChild(root_0, NUM230_tree);


                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:327:11: NUM base_num
                    {
                    NUM231=(Token)match(input,NUM,FOLLOW_NUM_in_number2650);  
                    stream_NUM.add(NUM231);


                    pushFollow(FOLLOW_base_num_in_number2652);
                    base_num232=base_num();

                    state._fsp--;

                    stream_base_num.add(base_num232.getTree());

                    // AST REWRITE
                    // elements: NUM, base_num
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (VlclTree)adaptor.nil();
                    // 327:24: -> ^( NUM_CONST NUM ( base_num )? )
                    {
                        // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:327:27: ^( NUM_CONST NUM ( base_num )? )
                        {
                        VlclTree root_1 = (VlclTree)adaptor.nil();
                        root_1 = (VlclTree)adaptor.becomeRoot(
                        (VlclTree)adaptor.create(NUM_CONST, "NUM_CONST")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NUM.nextNode()
                        );

                        // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:327:43: ( base_num )?
                        if ( stream_base_num.hasNext() ) {
                            adaptor.addChild(root_1, stream_base_num.nextTree());

                        }
                        stream_base_num.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "number"


    public static class base_num_return extends ParserRuleReturnScope {
        VlclTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_num"
    // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:329:1: base_num : ( BIN | OCT | DEC | HEX ) ;
    public final VlclParser.base_num_return base_num() throws RecognitionException {
        VlclParser.base_num_return retval = new VlclParser.base_num_return();
        retval.start = input.LT(1);


        VlclTree root_0 = null;

        Token set233=null;

        VlclTree set233_tree=null;

        try {
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:329:9: ( ( BIN | OCT | DEC | HEX ) )
            // /home/brutus729/Documents/FIB/PRACTICA_CL/Entrega_adrian_sanchez_albanell_belen_san_martin_diez/Vlcl/src/parser/Vlcl.g:
            {
            root_0 = (VlclTree)adaptor.nil();


            set233=(Token)input.LT(1);

            if ( input.LA(1)==BIN||input.LA(1)==DEC||input.LA(1)==HEX||input.LA(1)==OCT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (VlclTree)adaptor.create(set233)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "base_num"

    // Delegated rules


 

    public static final BitSet FOLLOW_mod_in_prog323 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_EOF_in_prog326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_mod358 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_mod361 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_params_in_mod364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_mod366 = new BitSet(new long[]{0x0918003D48004200L});
    public static final BitSet FOLLOW_block_instructions_in_mod369 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ENDMODULE_in_mod371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions401 = new BitSet(new long[]{0x0918003D40004202L});
    public static final BitSet FOLLOW_statement_in_block_stmts438 = new BitSet(new long[]{0x0000000C40004202L});
    public static final BitSet FOLLOW_signal_dec_in_instruction474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_dec_in_instruction487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_dec_in_instruction499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mod_dec_in_instruction511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_dec_in_instruction523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_instruction535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_statement560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_stmt_in_statement572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifelse_stmt_in_statement584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_stmt_in_statement596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_in_statement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INPUT_in_signal_dec637 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OUTPUT_in_signal_dec642 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_INOUT_in_signal_dec647 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_array_dec_in_signal_dec651 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_varslist_in_signal_dec654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_signal_dec656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REG_in_var_dec674 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_array_dec_in_var_dec677 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_varslist_in_var_dec680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_var_dec682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WIRE_in_var_dec695 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_array_dec_in_var_dec698 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_in_assign_in_var_dec702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varslist_in_var_dec706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_var_dec709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMETER_in_param_dec735 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_array_dec_in_param_dec738 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_in_assign_in_param_dec741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_64_in_param_dec744 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_in_assign_in_param_dec747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_66_in_param_dec751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_in_assign777 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ASSIGNSIMBOL_in_in_assign779 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_in_assign781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_mod_dec808 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_mod_dec810 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_call_params_in_mod_dec812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_mod_dec814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_func_dec842 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_array_dec_in_func_dec845 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_func_dec848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_func_dec850 = new BitSet(new long[]{0x0900003000001000L});
    public static final BitSet FOLLOW_func_init_in_func_dec853 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_beginend_stmt_in_func_dec855 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENDFUNCTION_in_func_dec857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_input_in_func_init884 = new BitSet(new long[]{0x0900003000000002L});
    public static final BitSet FOLLOW_var_dec_in_func_init888 = new BitSet(new long[]{0x0900003000000002L});
    public static final BitSet FOLLOW_INPUT_in_func_input916 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_INOUT_in_func_input921 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_array_dec_in_func_input925 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_varslist_in_func_input928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_func_input930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign951 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000028L});
    public static final BitSet FOLLOW_array_dec_in_assign955 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_assign957 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_concat_expr_in_assign961 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ASSIGNSIMBOL_in_assign964 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_assign967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_assign969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignation_stmt996 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_array_acces_in_assignation_stmt1000 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ASSIGNSIMBOL_in_assignation_stmt1003 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_assignation_stmt1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_assignation_stmt1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_beginend_stmt1034 = new BitSet(new long[]{0x0000000C41004200L});
    public static final BitSet FOLLOW_block_stmts_in_beginend_stmt1037 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_END_in_beginend_stmt1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifelse_stmt1067 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifelse_stmt1070 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_ifelse_stmt1073 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ifelse_stmt1075 = new BitSet(new long[]{0x0000000440005200L});
    public static final BitSet FOLLOW_intern_stmt_bloc_in_ifelse_stmt1078 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_else_stmt_in_ifelse_stmt1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt1106 = new BitSet(new long[]{0x0000000C40005200L});
    public static final BitSet FOLLOW_ifelse_stmt_in_else_stmt1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intern_stmt_bloc_in_else_stmt1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_stmt1141 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_case_stmt1144 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_case_stmt1147 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_case_stmt1149 = new BitSet(new long[]{0x0001400600202000L});
    public static final BitSet FOLLOW_case_item_in_case_stmt1153 = new BitSet(new long[]{0x0001400602602000L});
    public static final BitSet FOLLOW_default_item_in_case_stmt1158 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ENDCASE_in_case_stmt1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_opts_in_case_item1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_case_item1190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_beginend_stmt_in_case_item1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_case_opts1228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_number_in_case_opts1232 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_case_opts1236 = new BitSet(new long[]{0x0001400600202000L});
    public static final BitSet FOLLOW_ID_in_case_opts1240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_number_in_case_opts1244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEFAULT_in_default_item1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_default_item1274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_beginend_stmt_in_default_item1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop1302 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_for_loop1305 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_for_index_in_for_loop1308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_for_loop1310 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_for_condition_in_for_loop1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_for_loop1315 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_for_increment_in_for_loop1318 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_for_loop1320 = new BitSet(new long[]{0x0000000440005200L});
    public static final BitSet FOLLOW_intern_stmt_bloc_in_for_loop1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_index1360 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ASSIGNSIMBOL_in_for_index1362 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_PLUS_in_for_index1365 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NUM_in_for_index1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_condition1393 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMP_in_for_condition1395 = new BitSet(new long[]{0x0080400400000000L});
    public static final BitSet FOLLOW_PLUS_in_for_condition1399 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NUM_in_for_condition1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_condition1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_increment1433 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ASSIGNSIMBOL_in_for_increment1435 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_for_increment1439 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PLUS_in_for_increment1441 = new BitSet(new long[]{0x0080400400000000L});
    public static final BitSet FOLLOW_ID_in_for_increment1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_for_increment1449 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NUM_in_for_increment1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1471 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_funcall1475 = new BitSet(new long[]{0x8000000400000000L});
    public static final BitSet FOLLOW_callvarslist_in_funcall1477 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_funcall1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_intern_stmt_bloc1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_stmt_in_intern_stmt_bloc1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_stmt_in_intern_stmt_bloc1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_in_intern_stmt_bloc1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beginend_stmt_in_intern_stmt_bloc1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_params1589 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_varslist_in_params1591 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_params1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_varslist1617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_varslist1620 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_varslist1623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_62_in_call_params1650 = new BitSet(new long[]{0x8000000400000000L});
    public static final BitSet FOLLOW_callvarslist_in_call_params1652 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_call_params1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varcall_in_callvarslist1689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_callvarslist1692 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_varcall_in_callvarslist1695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ID_in_varcall1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_acces_in_varcall1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_array_dec1760 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NUM_in_array_dec1762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_array_dec1764 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NUM_in_array_dec1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_array_dec1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_array_acces1803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_array_acces1805 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_acces_expr_in_array_acces1807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_array_acces1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_acces_expr1844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_acces_expr1847 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_acces_expr1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_or_expr_in_expr1927 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COND_in_expr1930 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_cond_expr_in_expr1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_or_expr_in_cond_expr1960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_cond_expr1962 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_logic_or_expr_in_cond_expr1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_and_expr_in_logic_or_expr1990 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_OR_in_logic_or_expr1993 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_logic_and_expr_in_logic_or_expr1996 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_bw_or_expr_in_logic_and_expr2023 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_logic_and_expr2026 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_bw_or_expr_in_logic_and_expr2029 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_bw_xor_expr_in_bw_or_expr2056 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ORBW_in_bw_or_expr2059 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_bw_xor_expr_in_bw_or_expr2062 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_bw_and_expr_in_bw_xor_expr2089 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_XORS_in_bw_xor_expr2092 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_bw_and_expr_in_bw_xor_expr2095 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_eq_expr_in_bw_and_expr2122 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ANDBW_in_bw_and_expr2125 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_eq_expr_in_bw_and_expr2128 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_comp_expr_in_eq_expr2147 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_EQ_in_eq_expr2150 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_comp_expr_in_eq_expr2153 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_shift_expr_in_comp_expr2180 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMP_in_comp_expr2183 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_shift_expr_in_comp_expr2186 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_plus_expr_in_shift_expr2213 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_SHIFT_in_shift_expr2216 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NUM_in_shift_expr2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_expr_in_plus_expr2246 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_PLUS_in_plus_expr2249 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_term_expr_in_plus_expr2252 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_concat_expr_in_term_expr2279 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_TERM_in_term_expr2282 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_concat_expr_in_term_expr2285 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_unari_expr_in_concat_expr2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_mult_in_concat_expr2324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_concat_expr2327 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_concat_params_in_concat_expr2329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_concat_expr2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_num_mult2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_concat_params2391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_concat_params2394 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_concat_params2397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_red_expr_in_unari_expr2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANDBW_in_red_expr2441 = new BitSet(new long[]{0x4081700600202000L});
    public static final BitSet FOLLOW_ORBW_in_red_expr2446 = new BitSet(new long[]{0x4081700600202000L});
    public static final BitSet FOLLOW_XORS_in_red_expr2451 = new BitSet(new long[]{0x4081700600202000L});
    public static final BitSet FOLLOW_NAND_in_red_expr2456 = new BitSet(new long[]{0x4081700600202000L});
    public static final BitSet FOLLOW_NOR_in_red_expr2461 = new BitSet(new long[]{0x4081700600202000L});
    public static final BitSet FOLLOW_bitlogic_neg_in_red_expr2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_bitlogic_neg2492 = new BitSet(new long[]{0x4081400600202000L});
    public static final BitSet FOLLOW_NOTBW_in_bitlogic_neg2497 = new BitSet(new long[]{0x4081400600202000L});
    public static final BitSet FOLLOW_paren_expr_in_bitlogic_neg2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_paren_expr2527 = new BitSet(new long[]{0x4001400600202000L});
    public static final BitSet FOLLOW_atom_in_paren_expr2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_paren_expr2535 = new BitSet(new long[]{0x60857C0600202020L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_paren_expr2538 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_paren_expr2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_acces_in_atom2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_atom2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_num_in_number2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_number2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_number2650 = new BitSet(new long[]{0x0001000200202000L});
    public static final BitSet FOLLOW_base_num_in_number2652 = new BitSet(new long[]{0x0000000000000002L});

}