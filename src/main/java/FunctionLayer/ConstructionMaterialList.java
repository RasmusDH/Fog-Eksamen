package FunctionLayer;

public class ConstructionMaterialList {
    private int materialId;
    private String type;
    private int length;
    private String unit;
    private int width;
    private double thickness;

    public ConstructionMaterialList(int materialId, String type, int length, String unit, int width, double thickness) {
        this.materialId = materialId;
        this.type = type;
        this.length = length;
        this.unit = unit;
        this.width = width;
        this.thickness = thickness;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
}
