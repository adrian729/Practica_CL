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
        if(Data.getActModParamsUsed().size() > 0)
            throw new RuntimeException("alguna senyal del modul no ha estat declarada.");
        Data.checkModParamTypes();
        int posx, posy;
        posx = Data.getMinPosX();
        posy = Data.getMaxPosY();
        outStr += moduleHead(modName, posx, posy);

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
            //TODO: mirar si es pot unificar amb les demes assignacions
            VlclTree exprTree = child.getChild(1);
            executeAssignDec(varName, exprTree);
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
            executeAssignDec(paramName, exprTree);            
            child = t.getChild(++nChild);
        }
    }

    /*
    * Executa la crida a un modul i crea un nou node amb el modul.
    */
    private void executeModuleDec(VlclTree t) {
        //TODO
    }

//TODO
    private void executeFunctionDec(VlclTree t) {}

//TODO
    private void executeStatement(VlclTree t) {}

//TODO
    private void executeExpression(VlclTree t) {}


//TODO
    /*
    * Assigna el resultat de l'expressio definida a exprTree a la variable amb nom varName.
    */
    private void executeAssignDec(String varName, VlclTree exprTree) {}

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
        return "\\documentclass[tikz,border=10pt,12pt,x11names]{standalone}\n" +
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
