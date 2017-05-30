package interp;

import java.util.List;
import java.util.ArrayList;

public class DataNode {

    private NodeType nType; // tipus del node (WIRE, AND, etc..).
	private String text; // node amb text.
                         // (per pintar si cal, per exemple un ADDER o MUX, o un WIRE amb nom).
    private SignalRange range; // rang del node (nombre d'entrades del node).
    private List<SignalItem> outputs; // outputs del node i rang que va cap a l'output del node.

    public DataNode() {
    	this.nType = NodeType.VOID;
    	this.text = "";
        this.range = new SignalRange();
        this.outputs = new ArrayList<SignalItem>();
    }

    public DataNode(NodeType nType) {
    	this.nType = nType;
    	this.text = "";
        this.range = new SignalRange();
        this.outputs = new ArrayList<SignalItem>();
    }

    public String getText() {
        return text;
    }

    public NodeType getType() {
        return nType;
    }

    public SignalRange getRange() {
        assert nType == NodeType.WIRE || nType == NodeType.REG;
        return range;
    }

    public List<SignalItem> getOutputs() {
        return outputs;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(NodeType nType) {
        this.nType = nType;
    }

    public void setRange(SignalRange range) {
        assert nType == NodeType.WIRE || nType == NodeType.REG || nType == NodeType.PARAMETER;
        this.range = range;
        int r = range.max - range.min + 1;
    }

    public void setOutput(SignalItem oi) {
        outputs.add(oi);
    }

}