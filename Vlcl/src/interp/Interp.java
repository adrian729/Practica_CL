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

package interp;

import parser.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Graph to print and data */
    private DataStructure Data;

    private VlclTree T;

    private String outStr; //Text a pintar al finalitzar el programa.
                            //Hauria de ser un programa Latex ben fet.

    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(VlclTree T) {
        this.T = T;
        this.Data = new DataStructure();
        outStr = "";
        PreProcessVlcl(this.T);
    }

    /** Runs the program. */
    public void Run() {
        assert this.T != null && this.T.getType() == VlclLexer.LIST_MODULES;
        int n = this.T.getChildCount();
        outStr += docHead();
        for(int i = 0; i < n; ++i) {
            createModule(this.T.getChild(i));
            Data.resetData(true);
        }
        outStr += docFooter();
        System.out.print(outStr);
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See VlclTree.java for details.
     */
    private void PreProcessVlcl(VlclTree t) {
        if (t == null) return;
        switch(t.getType()) {
            case VlclLexer.NUM: t.setIntValue(); break;
            default: break;
        }
        int n = t.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessVlcl(t.getChild(i));
    }

    /**
    * Llegeix i crea el latex del module t.
    */
    private void createModule(VlclTree t) {
        assert t != null && t.getType() == VlclLexer.ID;
        String modName = t.getText();
        Data.setActModName(modName);
        addModuleParams(t.getChild(0));
        executeBlockInstructions(t.getChild(1));
        if(Data.getActModUnusedParams().size() > 0)
            throw new RuntimeException("alguna senyal del modul no ha estat declarada.");
        Data.checkModParamTypes();
        int posx, posy;
        posx = Data.getMinPosX();
        posy = Data.getMaxPosY();
        outStr += moduleHead(modName, posx, posy);
        outStr += Data.printModuleTex();
        outStr += moduleFooter();
        
    }

    private void addModuleParams(VlclTree t) {
        assert t != null && t.getType() == VlclLexer.PARAMS;
        int nChild = 0;
        VlclTree child = t.getChild(nChild);
        while(child != null) {
            Data.addActModParam(child.getText());
            child = t.getChild(++nChild);
        }
    }

    private void executeBlockInstructions(VlclTree t) {
        if(t == null) return;
        assert t.getType() == VlclLexer.LIST_INSTR;
        int nChild = 0;
        VlclTree child = t.getChild(0);
        while(child != null) {
            switch(child.getType()) {
                // signal_dec
                case VlclLexer.INPUT:
                case VlclLexer.OUTPUT:
                case VlclLexer.INOUT:
                    executeSignalDec(child);
                    break;
                // var_dec
                case VlclLexer.WIRE:
                case VlclLexer.REG:
                    executeVarDec(child);
                    break;
                // param_dec
                case VlclLexer.PARAMETER:
                    executeParamDec(child);
                    break;
                // mod_dec
                case VlclLexer.MODULE:
                    executeModuleDec(child);
                    break;
                // func_dec
                case VlclLexer.FUNCTION:
                    executeFunctionDec(child);
                    break;
                // statement
                default:
                    executeStatement(child);
                    break;
            }
            child = t.getChild(++nChild);
        }
    }


    /**
    * Llegeix una declaracio de senyals i afegeix les senyals al Data.
    */
    private void executeSignalDec(VlclTree t) {
        assert t.getType() == VlclLexer.INPUT ||
                t.getType() == VlclLexer.OUTPUT ||
                t.getType() == VlclLexer.INOUT;
        int nChild = 0;
        VlclTree child = t.getChild(0);
        // Definim el rang del senyal (si no es un vector de bits, sera -1 -1).
        SignalRange r = new SignalRange();
        if(child.getType() == VlclLexer.ARRAY_RANGE) {
            r = getRange(child);
            child = t.getChild(++nChild);
        }
        // Declaracio dels senyals (segons de quin tipus son).
        // Inputs i inouts son directament afegits als nodes com a wire (ho fa Data).
        switch(t.getType()) {
            case VlclLexer.INPUT:
                while(child != null) {                    
                    Data.addActModInput(child.getText(), new SignalRange(r));
                    child = t.getChild(++nChild);
                }
                break;
            case VlclLexer.OUTPUT:
                while(child != null) {
                    Data.addActModOutput(child.getText(), new SignalRange(r));
                    child = t.getChild(++nChild);
                }
                break;
            case VlclLexer.INOUT:
                while(child != null) {
                    Data.addActModInout(child.getText(), new SignalRange(r));
                    child = t.getChild(++nChild);
                }
                break;
        }
    }

    /**
    * Llegeix una declaracio de variables i les afegeix al Data.
    */
    private void executeVarDec(VlclTree t) {
        assert t.getType() == VlclLexer.WIRE || t.getType() == VlclLexer.REG;
        int nChild = 0;
        VlclTree child = t.getChild(nChild);
        SignalRange r = new SignalRange();
        if(child.getType() == VlclLexer.ARRAY_RANGE) {
            r = getRange(child);
            child = t.getChild(++nChild);
        }
        String varName;
        // Si tenim una assignacio al mateix temps que fem la declaracio.
        if(child.getType() == VlclLexer.ASSIGNSIMBOL) {
            assert t.getType() == VlclLexer.WIRE;
            varName = child.getChild(0).getText();
        }
        else { // Si no es una assignacio ha de ser la primera variable.
            varName = child.getText();
        }
        NodeType nType = NodeType.WIRE;
        if(t.getType() == VlclLexer.REG) nType = NodeType.REG;
        Data.addVar(varName, varName, r, nType);
        // Un cop afegida la variable, si era amb assignacio fem l'assignacio.
        if(child.getType() == VlclLexer.ASSIGNSIMBOL) {
            VlclTree exprTree = child.getChild(1);
            executeExpression(varName, r, exprTree);
        }
        // Si hi ha mes fills els declarem.
        // En el cas de que fos una assignacio ja sabem que no hi haura mes.
        child = t.getChild(++nChild);
        while(child != null) {
            varName = child.getText();
            Data.addVar(varName, varName, r, nType);
            child = t.getChild(++nChild);
        }
    }

    /*
    * Executa un conjunt d'assignacions a parametres.
    */
    private void executeParamDec(VlclTree t) {
        assert t.getType() == VlclLexer.PARAMETER;
        int nChild = 0;        
        VlclTree child = t.getChild(nChild);
        SignalRange r = new SignalRange();
        if(child.getType() == VlclLexer.ARRAY_RANGE) {
            r = getRange(child);
            child = t.getChild(++nChild);
        }
        NodeType nType = NodeType.PARAMETER;
        while(child != null) {
            String paramName = child.getChild(0).getText();
            Data.addVar(paramName, "", r, nType);
            VlclTree exprTree = child.getChild(1);
            executeExpression(paramName, r, exprTree);            
            child = t.getChild(++nChild);
        }
    }

    /*
    * Executa la crida a un modul i crea un nou node amb el modul.
    */
    private void executeModuleDec(VlclTree t) {
        assert t.getType() == VlclLexer.MODULE;
        String moduleType = t.getChild(0).getText();
        List<SignalRange> modParams = Data.getModuleParams(moduleType);
        String modDecName = t.getChild(1).getText();
        Data.addVar(modDecName, modDecName, new SignalRange(), NodeType.MODULE);
        VlclTree params = t.getChild(2);
        assert params.getType() == VlclLexer.PARAMS;
        for(int i = 0; i < modParams.size(); ++i){
            VlclTree cParam = params.getChild(i);
            if(cParam == null)
                throw new RuntimeException(
                    "not enought parameters on a module declaration."
                );
            String pName;
            SignalRange sr = new SignalRange();
            if(cParam.getType() == VlclLexer.ARRAY_ACCESS) {
                pName = cParam.getChild(0).getText();                
                if(cParam.getChild(1).getType() == VlclLexer.PART_ARRAY_ACCESS) {
                    sr = getRange(cParam.getChild(1));
                }
                else {
                    int acc = cParam.getChild(1).getIntValue();
                    sr = new SignalRange(acc, acc);
                }
            }
            else pName = cParam.getText();
            Data.tryValidRange(pName, sr);
            Data.addVarOutput(modDecName, pName, sr);
        }
    }

//TODO
    private void executeFunctionDec(VlclTree t) {

    }

//TODO
    private void executeStatement(VlclTree t) {
        switch(t.getType()) {
            case VlclLexer.ASSIGNSIMBOL:
                String varName;
                SignalRange sr = new SignalRange();
                int nChild = 0;
                VlclTree child = t.getChild(nChild);
                if(child.getType() == VlclLexer.ARRAY_RANGE) {
                    sr = getRange(child);
                    child = t.getChild(++nChild);
                    varName = child.getText();
                }
                else if(child.getType() == VlclLexer.ARRAY_ACCESS) {
                    varName = child.getChild(0).getText();
                    if(child.getChild(1).getType() == VlclLexer.PART_ARRAY_ACCESS) {
                        sr = getRange(child.getChild(1));
                    }
                    else {
                        int acc = child.getChild(1).getIntValue();
                        sr = new SignalRange(acc, acc);
                    }
                }
                else varName = child.getText();
                Data.tryValidRange(varName, sr);
                executeExpression(varName, sr, t.getChild(++nChild));
                break;
        }
        /*
            TODO
                statement
                | ifelse_stmt
                | case_stmt
                | for_loop
        */
    }

    /*
    * Executa una expressio i assigna com a output varName (amb rang range).
    */
    private void executeExpression(String varName, SignalRange range, VlclTree exprTree) {
        if(exprTree.getType() == VlclLexer.NUM_CONST) {
            String num = exprTree.getChild(0).getText();
            if(exprTree.getChild(1) != null) num += exprTree.getChild(1).getText();
            Data.addVar("", num, new SignalRange(), NodeType.BOX);
        }
        else if(exprTree.getType() == VlclLexer.NUM) {
            String num = exprTree.getText();            
            Data.addVar("", num, new SignalRange(), NodeType.BOX);
        }
        else if(exprTree.getType() == VlclLexer.ID) {
            Data.addVarOutput(exprTree.getText(), varName, range);
        }
        else if(exprTree.getType() == VlclLexer.ARRAY_ACCESS) {
            String name = exprTree.getChild(0).getText();
            SignalRange sr = new SignalRange();
            VlclTree accChild = exprTree.getChild(1);
            if(accChild.getType() == VlclLexer.PART_ARRAY_ACCESS) {
                sr = getRange(accChild);
            }
            else {
                int r = accChild.getIntValue();
                sr = new SignalRange(r, r);
            }
            Data.tryValidRange(name, sr);
            Data.addVarInputOutput(name, varName, range, sr);
        }
        else if(exprTree.getText() == "+" && exprTree.getChildCount() == 1) {
             executeExpression(varName, range, exprTree.getChild(0));
        }
        else {
            String nText = "";
            NodeType nType = NodeType.BOX;
            SignalRange sr = new SignalRange();

            switch(exprTree.getText()) {
                case "-":
                    if(exprTree.getChildCount() == 1) nText = "NEG";
                    else nText = "SUBS";
                    break;
                case "+":
                    nText = "SUM";
                    break;
                case "*":
                    nText = "MUL";
                    break;
                case "/":
                    nText = "DIV";
                    break;
                case "%":
                    nText = "MOD";
                    break;
                case "~":
                    nType = NodeType.NOT;
                    break;
                case "&":
                    nType = NodeType.AND;
                    break;
                case "|":
                    nType = NodeType.OR;
                    break;
                case "^":
                    nType = NodeType.XOR;
                    break;
                case "~&":
                    nType = NodeType.NAND;
                    break;
                case "~|":
                    nType = NodeType.NOR;
                    break;
                case "~^":
                case "^~":
                    nType = NodeType.XNOR;
                    break;
                default:
                    nText = exprTree.getText();
            }
            String nodeName = Data.addVar("", nText, new SignalRange(), nType);
            int nChild = 0;
            VlclTree child = exprTree.getChild(nChild);
            while(child != null) {
                executeExpression(nodeName, sr, child);
                child = exprTree.getChild(++nChild);
            }
        }

        /*
        TODO:
            ALTRES
            // Operador condicional
            // Operador “? :”
            a = (b == c) ? a + b : a - c;

            // Operador concatenació
            // Operador “{ }” permet concatenar els operants per formar un vector.
            a = {a, b}; // El resultat tindrà mida bits d'a més bits de b
            a = { a[4:0], b[2:0] }; // El resultat tindra mida 8
            a = { 3{a} }; // Equivalent a { a, a, a }
            a = {b, 2{ c, d } }; // Equivalent a { b, c, d, c, d }
        */
    }

    /*
    * Retorna un rang definit per una expressio de rang a l'arbre.
    */
    private SignalRange getRange(VlclTree t) {
        assert t.getType() == VlclLexer.ARRAY_RANGE || t.getType() == VlclLexer.PART_ARRAY_ACCESS;
        int max, min;
        max = t.getChild(0).getIntValue();
        min = t.getChild(1).getIntValue();
        if(max < min || min < 0)
            throw new RuntimeException(
                "bad range declaration."
            );
        return new SignalRange(max, min);
    }

    /**
    * Capcelera document latex.
    */
    private String docHead() {
        return  "\\documentclass[tikz,border=10pt,12pt,x11names]{standalone}\n" +
                "\\usepackage{tikz}\n" +
                "\\usetikzlibrary{circuits.logic.US} % TiKZ Library for US Logic Circuits.\n" +
                "\\begin{document}\n";
    }

    /**
    * Footer document latex
    */
    private String docFooter() {
        return "\n\\end{document}";
    }

    /**
    * Capcelera modul en latex.
    */
    private String moduleHead(String modName, int posx, int posy) {
        posx -= 2;
        posy += 2;
        return "\n\t\\begin{tikzpicture}[circuit logic US,\n" +
                    "\t\t\t\t\t\ttiny circuit symbols,\n" +
                    "\t\t\t\t\t\tevery circuit symbol/.style={\n" +
                    "\t\t\t\t\t\tfill=white,draw}]\n" +
                    "\n\t\t\\node[draw] at (" + posx + "," + posy + ") {" + modName + "};\n";
    }

    /**
    * Footer module en latex.
    */
    private String moduleFooter() {
        return "\n\t\\end{tikzpicture}\n";
    }

}
