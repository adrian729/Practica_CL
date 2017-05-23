package interp;

public class SignalRange {
    public int max, min;

    public SignalRange() {
    	this.max = 0;
    	this.min = 0;
    }

    public SignalRange(int max, int min) {
    	this.max = max;
    	this.min = min;
    }

    public SignalRange(SignalRange sr) {
    	this.max = sr.max;
    	this.min = sr.min;
    }
}