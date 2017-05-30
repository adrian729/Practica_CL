package interp;

public class SignalItem {
    public SignalRange range;
    public String name;
    public Boolean isReg;

    public SignalItem(SignalRange range, String name, Boolean isReg) {
    	this.range = range;
        this.name = name;
        this.isReg = isReg;
    }
}