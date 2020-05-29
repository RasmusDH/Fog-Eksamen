package FunctionLayer;

/**
 * Vi laver et roof-objekt som vi kan bruge til at kalde på vores tag valgmuligheder i vores dropdown menu.
 */

public class Roof {

    private String kind;
    private int slope;
    private int roofId;

    public Roof(int roofId, String kind, int slope) {
        this.roofId = roofId;
        this.kind = kind;
        this.slope = slope;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getSlope() {
        return slope;
    }

    public void setSlope(int slope) {
        this.slope = slope;
    }

    public int getRoofId() {
        return roofId;
    }

    public void setRoofId(int roofId) {
        this.roofId = roofId;
    }

    @Override
    public String toString() {
        return "Roof Id: " + roofId
                +"\nRoof type: " + kind +
                "\nSlope: " + slope;
    }
}

