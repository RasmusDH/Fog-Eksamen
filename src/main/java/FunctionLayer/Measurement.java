package FunctionLayer;

public class Measurement {

    private int measurement;



    public Measurement(int measurement) {
        this.measurement = measurement;

    }
    public int getMeasurement() {
        return measurement;
    }

    public void setMeasurement(int length) {

        this.measurement = measurement;
    }

    @Override
    public String toString() {
        return measurement + " cm\n";
    }
}
