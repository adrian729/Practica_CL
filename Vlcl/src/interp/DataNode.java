package interp;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class DataNode {

    private NodeType nType; // tipus del node (WIRE, AND, etc..).
	private String text; // node amb text.
                         // (per pintar si cal, per exemple un ADDER o MUX, o un WIRE amb nom).
    private SignalRange range; // rang del node (rang d'entrada / sortida disponible).
    private List<SignalItem> outputs; // outputs del node i rang que va cap a l'output del node.
    private Map<Integer, SignalRange> inputs; // donat un output, el rang del node que va a aquell output.

    private int usedInputs;

    public DataNode() {
    	this.nType = NodeType.VOID;
    	this.text = "";
        this.range = new SignalRange();
        this.outputs = new ArrayList<SignalItem>();
        this.inputs = new HashMap<Integer, SignalRange>();
        this.usedInputs = 1;
    }

    public DataNode(NodeType nType) {
    	this.nType = nType;
    	this.text = "";
        this.range = new SignalRange();
        this.outputs = new ArrayList<SignalItem>();
        this.inputs = new HashMap<Integer, SignalRange>();
        this.usedInputs = 1;
    }

    public String getText() {
        return text;
    }

    public NodeType getType() {
        return nType;
    }

    public SignalRange getRange() {
        return range;
    }

    public List<SignalItem> getOutputs() {
        return outputs;
    }

    public Map<Integer, SignalRange> getInputsRange() {
        return inputs;
    }

    public int getUsedInputs() {
        return usedInputs;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(NodeType nType) {
        this.nType = nType;
    }

    public void setRange(SignalRange range) {
        this.range = range;
        int r = range.max - range.min + 1;
    }

    public void setOutput(SignalItem oi) {
        outputs.add(oi);
    }

    public void setRangeOutput(SignalItem oi, SignalRange sr) {
        int pos = outputs.size();
        outputs.add(oi);
        inputs.put(pos, sr);
    }

    public void addUsedInput() {
        usedInputs += 1;
    }

}