package interp;

public class Coords {

    private Double first, second;

    public Coords() {
    	first = 0.;
    	second = 0.;
    }

    public void setFirstCoord(Double coord) {
    	first = coord;
    }

    public void setSecCoord(Double coord) {
    	second = coord;
    }
    
    public Double getFirstCoord() {
        return first;
    }
    
    public Double getSecCoord() {
        return second;
    }
}
