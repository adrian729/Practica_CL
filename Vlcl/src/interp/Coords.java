package interp;

public class Coords {

    private int first, second;

    public Coords() {
    	first = 0;
    	second = 0;
    }

    public void setFirstCoord(int coord) {
    	first = coord;
    }

    public void setSecCoord(int coord) {
    	second = coord;
    }
    
    public int getFirstCoord() {
        return first;
    }
    
    public int getSecCoord() {
        return second;
    }
}
