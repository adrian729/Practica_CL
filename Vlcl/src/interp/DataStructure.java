package interp;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Process;
import java.lang.Exception;
import java.io.PrintWriter;

public class DataStructure {

    private Map<String, List<SignalRange>> GlobalModules; // Moduls creats fins al moment (i accessibles).
    private Map<String, DataNode> Data; // Conjunt de nodes (dades).
    private int countNodes; // Numero de nodes a Data.
                            // Util per generar identificadors unics per al HashMap.

    private String actModule; // Modul actual.
    private double minPosX, maxPosY; // Posicions per calcular on possar el nom del modul.
    private List<String> params; // parametres del modul (ordenats com a la capçalera).
    private Set<String> unusedParams; // parametres sense inicialitzar del modul.
    private Map<String, SignalRange> inputs, outputs, inouts; // inputs outputs i inouts del modul actual.

    /**
    * Inicialitza l'estructura de dades.
    */
    public DataStructure() {
        GlobalModules = new HashMap<String, List<SignalRange>>();
        // Fer el reset inicialitza les dades buides.
        resetData(false);
    }

    /**
    * Reseteja les dades no Globals.
    */
    public void resetData(boolean addModule) {
        if(addModule) addActModToGlobal();
        countNodes = 0;
        minPosX = maxPosY = 0;
        Data = new HashMap<String, DataNode>();
        actModule = "";
        params = new ArrayList<String>();
        unusedParams = new HashSet<String>();
        inputs = new HashMap<String, SignalRange>();
        inouts = new HashMap<String, SignalRange>();
        outputs = new HashMap<String, SignalRange>();
    }

    /**
    * Comprova que els parametres declarats tinguin el tipus i rang correctes (i existeixin).
    */
    public void checkModParamTypes() {
        for(String iName : inputs.keySet()) {
            SignalRange iRange = inputs.get(iName);
            if(!Data.containsKey(iName))
                throw new RuntimeException("parametre " + iName + " sense usar.");
            DataNode node = Data.get(iName);
            SignalRange nRange = node.getRange();
            NodeType nType = node.getType();
            if(iRange.max != nRange.max || iRange.min != nRange.min || nType != NodeType.WIRE)
                throw new RuntimeException("parametre " + iName + " mal inicialitzat.");
        }
        for(String oName : outputs.keySet()) {
            SignalRange oRange = outputs.get(oName);
            if(!Data.containsKey(oName))
                throw new RuntimeException("parametre " + oName + " sense usar.");
            DataNode node = Data.get(oName);
            SignalRange nRange = node.getRange();
            NodeType nType = node.getType();
            if(oRange.max != nRange.max || oRange.min != nRange.min ||
                (nType != NodeType.WIRE && nType != NodeType.REG))
                throw new RuntimeException("parametre " + oName + " mal inicialitzat.");
        }
        for(String ioName : inouts.keySet()) {
            SignalRange ioRange = inouts.get(ioName);
            if(!Data.containsKey(ioName))
                throw new RuntimeException("parametre " + ioName + " sense usar.");
            DataNode node = Data.get(ioName);
            SignalRange nRange = node.getRange();
            NodeType nType = node.getType();
            if(ioRange.max != nRange.max || ioRange.min != nRange.min || nType != NodeType.WIRE)
                throw new RuntimeException("parametre " + ioName + " mal inicialitzat.");
        }
    }

    // Funcions control modul actual

    // Getters
    public String getActModName() {
        return actModule;
    }

    public double getMinPosX() {
        return minPosX;
    }

    public double getMaxPosY() {
        return maxPosY;
    }

    public Set<String> getActModUnusedParams() {
        return unusedParams;
    }

    public List<SignalRange> getModuleParams(String mName) {
        if(!GlobalModules.containsKey(mName))
            throw new RuntimeException("module does not exist: " + mName);
        return GlobalModules.get(mName);
    }

    // setters
    public void setActModName(String modName) {
        actModule = modName;
    }

    // adders
    public void addActModParam(String paramName) {
        if(params.contains(paramName))
            throw new RuntimeException("multiple parameters with the same name: " + paramName);
        params.add(paramName);
        unusedParams.add(paramName);
    }

    public void addActModInput(String iName, SignalRange iRange) {
        addSignalToActMod(iName, iRange, inputs);
    }

    public void addActModOutput(String oName, SignalRange oRange) {
        addSignalToActMod(oName, oRange, outputs);
    }

    public void addActModInout(String ioName, SignalRange ioRange) {
        addSignalToActMod(ioName, ioRange, inouts);
    }

    public void addSignalToActMod(String sName, SignalRange sRange, 
        Map<String, SignalRange> ssMap)
    {
        if(!unusedParams.contains(sName))
            throw new RuntimeException(
                "the signal is not a parameter or has been declared already: " + sName
            );
        unusedParams.remove(sName);
        ssMap.put(sName, sRange);
    }

    public String addVar(String varName, String varText, SignalRange varRange, NodeType nType) {
        if(varName == "") varName = nextNodeName();
        if(Data.containsKey(varName))
            throw new RuntimeException(
                "multiple definition of variable: " + varName
            );
        DataNode node = new DataNode(nType);
        node.setText(varText);
        node.setRange(new SignalRange(varRange));
        addNode(varName, node);

        return varName;
    }

    public void addNode(String nodeName, DataNode node) {
        Data.put(nodeName, node);
        ++countNodes;
    }

    public void addVarOutput(String varName, String outName, SignalRange outRange) {
        if(!Data.containsKey(varName)) {
            tryInitSignal(varName);
            throw new RuntimeException(
                "the variable does not exists, can't have an output: " + varName
            );
        }
        if(!Data.containsKey(outName)) {
            tryInitSignal(varName);
            throw new RuntimeException(
                "the variable does not exists, can't be an output: " + outName
            );
        }
        DataNode n = Data.get(varName);
        n.setOutput(new SignalItem(outRange, outName));
        Data.put(varName, n);
    }

    public void addVarInputOutput(String varName, 
        String outName, SignalRange outRange, SignalRange inRange) {
        if(!Data.containsKey(varName)) {
            tryInitSignal(varName);
            throw new RuntimeException(
                "the variable does not exists, can't have an output: " + varName
            );
        }
        if(!Data.containsKey(outName)) {
            tryInitSignal(varName);
            throw new RuntimeException(
                "the variable does not exists, can't be an output: " + outName
            );
        }
        DataNode n = Data.get(varName);
        n.setRangeOutput(new SignalItem(outRange, outName), inRange);
        Data.put(varName, n);
    }

    private void addActModToGlobal() {
        List<SignalRange> actModParams = new ArrayList<SignalRange>();
        for(String pName : params) {
            SignalRange pRange;
            if(inputs.containsKey(pName)) {
                pRange = inputs.get(pName);
            }
            else if(outputs.containsKey(pName)) {                
                pRange = outputs.get(pName);
            }
            else if(inouts.containsKey(pName)) {
                pRange = inouts.get(pName);
            }
            else throw new RuntimeException(
                "bad module parameters."
            );
            actModParams.add(new SignalRange(pRange));
        }
        GlobalModules.put(actModule, actModParams);
    }

    public void tryValidRange(String name, SignalRange sr) {
        if(!Data.containsKey(name)) {
            tryInitSignal(name);
            throw new RuntimeException(
                "the variable does not exists so the range is not valid: " + name
            );
        }
        SignalRange nRange = Data.get(name).getRange();
        if(sr.max < sr.min || sr.max > nRange.max || sr.min < nRange.min)
            throw new RuntimeException(
                "not a valid range on array access: " + sr.max + " " + sr.min + " with " + nRange.max + " " + nRange.min
            );
    }

    private void tryInitSignal(String varName) {
        for(String iName : inputs.keySet()) {
            if(iName == varName) {
                SignalRange sr = inputs.get(iName);
                System.out.println(addVar(varName, varName, sr, NodeType.WIRE));
                return;
            }
        }
        for(String oName : outputs.keySet()) {
            if(oName == varName) {
                SignalRange sr = outputs.get(oName);
                System.out.println(addVar(varName, varName, sr, NodeType.WIRE));
                return;
            }
        }
        for(String ioName : inouts.keySet()) {
            if(ioName == varName) {
                SignalRange sr = inouts.get(ioName);
                System.out.println(addVar(varName, varName, sr, NodeType.WIRE));
                return;
            }
        }
    }

    //Exists
    public boolean existsVar(String vName) {
        return Data.containsKey(vName);
    }

    /*
    * Per poder afegir als nodes variables generiques, o quasevol variable que volguem guardar.
    * (Una & usada com a operador, per exemple, que generara un node).
    */
    private String nextNodeName() {
        assert countNodes >= 0;
        return "nodeº" + countNodes;
    }


    //Files

    private String printModuleDot() {
        PrintDot dot = new PrintDot();
        dot.moduleHead();
        for(Map.Entry<String, DataNode> node : Data.entrySet()) {
            dot.newNode(node.getKey(),node.getValue());
        }
        dot.moduleFooter();
        return dot.getDot();
    }

    /**
    * Converteix el dot a format tex
    */
    private String dot2tex(String dot) {
        String tex = "";
        try {            
            PrintWriter writer = new PrintWriter("graph.dot", "UTF-8");
            writer.print(dot);
            writer.close();
            String command ="dot2tex graph.dot";
            Runtime run = Runtime.getRuntime();
            Process cmdProc = run.exec(new String[]{"/bin/sh", "-c", command});
            cmdProc.waitFor();
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(cmdProc.getInputStream())
            );
            String line;
            while((line = reader.readLine()) != null) {
                tex += line + "\n";
            }
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println("Runtime error: " + e.getMessage());
            else System.err.println(e);
            System.exit(1);
        }
        return tex;
    }
    
    private String setDraw(NodeType t) {
        String draw;
        switch (t) {
            case AND:
                draw = "and gate";
                break;
            case OR:
                draw = "or gate";
                break;
            case NOT:
                draw = "not gate";
                break;
            case XOR:
                draw = "xor gate";
                break;
            case NAND:
                draw = "nand gate";
                break;
            case NOR:
                draw = "nor gate";
                break;
            case XNOR:
                draw = "xnor gate";
                break;
            default:
                draw = "draw";
        }
        return draw;
    }

    private String setDir(NodeType t) {
        String dir;
        switch (t) {
            case AND:
            case OR:
            case NOT:
            case XOR:
            case NAND:
            case NOR:
            case XNOR:
                dir = "output";
                break;
            default:
                dir = "east";
        }
        return dir;
    }
    
    public String printModuleTex() {
        String res1, res2;
        res1 = res2 = "\n"; //res1 nodes, res2 draws
        ReadFile rf = new ReadFile();
        rf.getNodeCoordsFromTex(dot2tex(printModuleDot()));
        Map<String, Integer> num_inps_node = new HashMap<String, Integer>();
        for(Map.Entry<String, DataNode> node : Data.entrySet()) {
            DataNode n = node.getValue();            
            List<SignalItem> outs = n.getOutputs();
            for(SignalItem sItem : outs) {
                int num = 0;
                if(num_inps_node.containsKey(sItem.name)) num = num_inps_node.get(sItem.name);
                ++num;
                num_inps_node.put(sItem.name, num);
            }
        }
        Map<String, String> drawType = new HashMap<String, String>();
        for(Map.Entry<String, DataNode> node : Data.entrySet()) {
            DataNode n = node.getValue();
            String nodeName = node.getKey();
            Coords pos = rf.getCoordsFromNode(nodeName);
            if(pos.getFirstCoord() < minPosX) minPosX = pos.getFirstCoord();
            if(pos.getSecCoord() > maxPosY) maxPosY = pos.getSecCoord();
            String text = n.getText();
            String draw = setDraw(n.getType());
            drawType.put(nodeName, draw);
            String inps = "";
            int numInps = 0;
            if(num_inps_node.containsKey(nodeName)) numInps = num_inps_node.get(nodeName);
            if(numInps > 0) {
                if(numInps < 2 && draw != "draw") numInps = 2;
                inps = ", inputs={";
                for(int i = 0; i < numInps; ++i) {
                    inps += "n";
                }
                inps += "}";
            }
            res1 +=  "\t\t\\node[" + draw + inps + "] (" + nodeName + ") at (" + pos.getFirstCoord() + "bp," + pos.getSecCoord() + "bp) {" + text + "};\n";
        }
        for(Map.Entry<String, DataNode> node : Data.entrySet()) {
            DataNode n = node.getValue();
            String dir = setDir(n.getType());
            String nodeName = node.getKey();
            List<SignalItem> outs = n.getOutputs();
            for(SignalItem sItem : outs) {
                String outName = sItem.name;
                DataNode outNode = Data.get(outName);
                int numInp = outNode.getUsedInputs();
                outNode.addUsedInput();
                Data.put(outName, outNode);
                res2 += "\t\t\\draw (" + nodeName + "." + dir + ") -- ++(right:3mm) |- (" + outName;
                String draw = "draw";
                if(drawType.containsKey(outName)) draw = drawType.get(outName);
                if (draw != "draw") res2 += ".input " + numInp;
                res2 += ");\n";
            }
        }
        return res1 + res2;
    }

}
