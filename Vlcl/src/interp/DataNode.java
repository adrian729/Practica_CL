package interp;

import java.util.HashMap;


public class DataNode {

    private NodeType nType; // tipus del node (WIRE, AND, etc..).
	private String text; // node amb text.
                         // (per pintar si cal, per exemple un ADDER o MUX, o un WIRE amb nom).
    private SignalRange range; // rang del node (si es -1 -1 no es un node amb rang).

    public DataNode() {
    	this.nType = NodeType.VOID;
    	this.text = "";
        this.range = new SignalRange();
    }

    public DataNode(NodeType nType) {
    	this.nType = nType;
    	this.text = "";
        this.range = new SignalRange();
    }

    public String getText() {
        return text;
    }

    public NodeType getType () {
        return nType;
    }

    public SignalRange getRange() {
        assert nType == NodeType.WIRE || nType == NodeType.REG;
        return range;
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
    }

}