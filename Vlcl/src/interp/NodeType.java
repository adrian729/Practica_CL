package interp;

public enum NodeType {
	VOID, MODULE, WIRE, REG, AND, OR, NOT, XOR, NAND, NOR, XNOR, BOX, PARAMETER;
	// A BOX can represent a number, an ADDER, MUX, etc..
}