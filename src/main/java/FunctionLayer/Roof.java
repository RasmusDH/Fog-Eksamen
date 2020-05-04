package FunctionLayer;

public class Roof {

    private String kind;
    private int slope;

    public Roof(String kind, int slope) {
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

    @Override
    public String toString() {
        return "Roof type: " + kind +
                "\nSlope: " + slope;
    }
}

