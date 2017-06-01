package interp;

import java.util.List;

public class PrintDot {

    private String dot;
    
    public PrintDot() {
        dot = "";
    }
    
    public String getDot() {
        return dot;
    }
    
    public void moduleHead() {
        dot += "digraph ";
        dot += " {\n";
    }

    public void newNode(String name, DataNode node) {
        dot += name + " -> {";
        List<SignalItem> outputs = node.getOutputs();
        for(int i = 0; i < outputs.size(); ++i) {
            dot += (outputs.get(i)).getName();
            dot += " ";
        }
        dot += "}\n";
    }
    
    public void moduleFooter() {
        dot += "}\n\n";
    }

}
