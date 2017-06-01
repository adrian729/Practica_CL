package interp;

import java.util.List;

public class PrintDot {

    private String dot;
    private int num;
    
    public PrintDot() {
        dot = "";
        num = 1;
    }
    
    public String getDot() {
        return dot;
    }
    
    public void moduleHead() {
        dot += "digraph ";
        dot += num;
        ++num;
        dot += " {\n"
    }

    public void newNode(String name, DataNode node) {
        dot += name + " -> {";
        List<SignalItem> outputs = node.getOutputs();
        for(int i = 0; i < ouputs.size(); ++i) {
            dot += outputs[i].getName();
            dot += " ";
        }
        dot += "}\n";
    }
    
    public void moduleFooter() {
        dot += "}\n\n";
    }

}
