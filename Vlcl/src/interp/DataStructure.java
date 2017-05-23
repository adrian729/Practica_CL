package interp;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class DataStructure {

    private Set<String> GlobalModules; // Moduls creats fins al moment (i accessibles).
    private Map<String, DataNode> Data; // Conjunt de nodes (dades).
    private int countNodes; // Numero de nodes a Data.
                            // Util per generar identificadors unics per al HashMap.

    private String actModule; // Modul actual.
    private int minPosX, maxPosY; // Posicions per calcular on possar el nom del modul.
    private List<String> params; // parametres del modul (ordenats com a la capçalera).
    private Set<String> paramsUsed; // parametres sense inicialitzar del modul.
    private Map<String, SignalRange> inputs, outputs, inouts; // inputs outputs i inouts del modul actual.

    /**
    * Inicialitza l'estructura de dades.
    */
    public DataStructure() {
        GlobalModules = new HashSet<String>();
        Data = new HashMap<String, DataNode>();
        countNodes = minPosX = maxPosY = 0;
        actModule = "";
        params = new ArrayList<String>();
        paramsUsed = new HashSet<String>();
        inputs = new HashMap<String, SignalRange>();
        inouts = new HashMap<String, SignalRange>();
        outputs = new HashMap<String, SignalRange>();
    }

    /**
    * Reseteja les dades mantenint les dades globals a GlobalModules i Data.
    */
    public void resetData() {
        countNodes = minPosX = maxPosY = 0;
        // Keep global vars
        Map<String, DataNode> tmpData = new HashMap<String, DataNode>();
        if(GlobalModules.size() > 0) {
            countNodes = GlobalModules.size();
            for(String key : GlobalModules) {
                tmpData.put(key, Data.get(key));
            }            
        }
        Data = new HashMap<String, DataNode>(tmpData);
        actModule = "";
        params = new ArrayList<String>();
        paramsUsed = new HashSet<String>();
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

    public Set<String> getActModParamsUsed() {
        return paramsUsed;
    }

    // setters
    public void setActModName(String modName) {
        actModule = modName;
    }

    // adders
    public void addActModParam(String paramName) {
        if(params.contains(paramName))
            throw new RuntimeException("multiple parameters with the same name.");
        params.add(paramName);
        paramsUsed.add(paramName);
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
        if(!paramsUsed.contains(sName))
            throw new RuntimeException(
                "the signal is not a parameter or has been declared already."
            );
        paramsUsed.remove(sName);
        ssMap.put(sName, sRange);
    }

    public void addVar(String varName, String varText, SignalRange varRange, NodeType nType) {
        if(Data.containsKey(varName))
            throw new RuntimeException(
                "multiple definition of variable."
            );
        DataNode node = new DataNode(nType);
        node.setText(varText);
        node.setRange(new SignalRange(varRange));
        addNode(varName, node);
    }

    public void addNode(String nodeName, DataNode node) {
        Data.put(nodeName, node);
        ++countNodes;
    }

    private void addActModToGlobal() {
        /*TODO:
            -> crear un node amb:
                -> nom del modul
                -> tipus MODULE
                -> entrades i sortides (mida, tipus (WIRE, REG) i si son input/output/inout)
        */
    }



    //Exists
    public boolean existsWire(String wName) {
        return Data.containsKey(wName);
    }


    // Definicio nomenclatures per als nodes.
    /*
    * Per distingir els moduls d'altres variables
    * (ja que podem crear variables que s'anomenin com un modul ja existent
    * i no ha de donar problemes)
    */
    private static final String modNameTail = "\\\\MOD";
    private static final String convertToModName(String name) {
        return name + modNameTail;
    }

    /*
    * Per poder afegir als nodes variables generiques, o quasevol variable que volguem guardar.
    * (Una & usada com a operador, per exemple, que generara un node).
    */
    private String nextNodeTail() {
        assert countNodes >= 0;
        return "\\\\" + countNodes;
    }

}