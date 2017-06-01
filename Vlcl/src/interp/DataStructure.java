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
    private int minPosX, maxPosY; // Posicions per calcular on possar el nom del modul.
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
        countNodes = minPosX = maxPosY = 0;
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

    public int getMinPosX() {
        return minPosX;
    }

    public int getMaxPosY() {
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
        if(!Data.containsKey(outName))
            throw new RuntimeException(
                "the variable does not exists, can't be an output: " + outName
            );
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
        if(!Data.containsKey(name))
            throw new RuntimeException(
                "the variable does not exists so the range is not valid: " + name
            );
        SignalRange nRange = Data.get(name).getRange();
        if(sr.max < sr.min || sr.max > nRange.max || sr.min < nRange.min)
            throw new RuntimeException(
                "not a valid range on array access: " + sr.max + " " + sr.min + " with " + nRange.max + " " + nRange.min
            );
    }

    private tryInitSignal(String varName) {}

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
    
    public String printModuleTex() {
        String res = "\n";
        ReadFile rf = new ReadFile();
        rf.getNodeCoordsFromTex(dot2tex(printModuleDot()));
        for(Map.Entry<String, DataNode> node : Data.entrySet()) {
            Coords pos = rf.getCoordsFromNode(node.getKey());
            String text = node.getValue().getText();
            String draw = setDraw(node.getValue().getType());
            res +=  "\t\t\\node[" + draw + "] at (" + pos.getFirstCoord() + "bp," + pos.getSecCoord() + "bp) {" + text + "};\n";
        }
        return res;
    }

}
