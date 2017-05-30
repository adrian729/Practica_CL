package interp;

import java.utils.List;
import java.utils.ArrayList;

public class Module {

	private List<SignalItem> signals;

    public Module() {
    	signals = new ArrayList<SignalItem>();
    }

    public List<SignalItem> getSignals() {
    	return signals;
    }

    public void setSignal(SignalItem si) {
    	signals.add(si);
    }
}