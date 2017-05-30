import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        try {

            File file = new File(args[0]);

            Scanner input = new Scanner(file);

            String line;

            while (input.hasNextLine()) {
                line = input.nextLine();
                if (line.length() > 10) {
		  if (line.substring(0,10).equals("  % Node: ")) {
		    System.out.println(line.substring(10,line.length()));
		    for (int i = 0; i < 4; ++i)
		      line = input.nextLine();
		    int i = 9;
		    while (line.charAt(i) != 'b') ++i;
		    System.out.println(line.substring(9,i));
		    i += 3;
		    int j = i;
		    while (line.charAt(i) != 'b') ++i;
		    System.out.println(line.substring(j,i));
		  }
		}
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}