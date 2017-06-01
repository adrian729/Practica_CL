package interp;

import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

public class ReadFile {

    private Map<String,Coords> nodes;

    public ReadFile() {
       nodes = new HashMap<String, Coords>();
    }

    public void getNodeCoordsFromTex(String texFile) {
        try {
            Scanner input = new Scanner(texFile);

            String line;

            while (input.hasNextLine()) {
                line = input.nextLine();
                if (line.length() > 10) {
                    if (line.substring(0,10).equals("  % Node: ")) {
                        String nodeName = line.substring(10,line.length());
                        Coords c = new Coords();
                        for (int i = 0; i < 4; ++i)
                            line = input.nextLine();
                        int i = 9;
                        while (line.charAt(i) != 'b') ++i;
                        c.setFirstCoord(Double.parseDouble(line.substring(9,i)));
                        i += 3;
                        int j = i;
                        while (line.charAt(i) != 'b') ++i;
                        c.setSecCoord(Double.parseDouble(line.substring(j,i)));
                        nodes.put(nodeName,c);
                    }
                }
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Coords getCoordsFromNode(String nodeName) {
        return nodes.get(nodeName);
    }

}
