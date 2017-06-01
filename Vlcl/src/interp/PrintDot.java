package interp;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class PrintDot {

    private String dot;
    
    public PrintDot() {
        dot = "";
    }

    public String printNode(String name, DataNode node) {
        dot += "name -> {";
        List<SignalItem> outputs = node.getOutputs();
        for(int i = 0; i < ouputs.size(); ++i) {
            dot += outputs[i].getName();
        }
        dot += "}\n";
    }

}
