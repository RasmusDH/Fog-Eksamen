package FunctionLayer;

public class Measurement {

    private String name;
    private int measurement;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getMeasurement() {
        return measurement;
    }

    public void setMeasurement(int measurement) {
        this.measurement = measurement;
    }

    public Measurement(String name, int measurement) {
        this.name = name;
        this.measurement = measurement;

    }

    @Override
    public String toString() {
        return "Measurements: \n" +
                "Name: " + name +
                "\n length: " + measurement;
    }
}
