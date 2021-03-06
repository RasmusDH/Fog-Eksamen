package FunctionLayer;

public class CarportMaterial {

    int orderId;
    String name;
    String unit;
    int id;
    int width;
    double thickness;
    int size;
    int amount;
    String comment;

    public CarportMaterial(int orderId, String name, String unit, int id, int width, double thickness, int size, int amount, String comment) {
        this.orderId = orderId;
        this.name = name;
        this.unit = unit;
        this.id = id;
        this.width = width;
        this.thickness = thickness;
        this.size = size;
        this.amount = amount;
        this.comment = comment;
    }
    public CarportMaterial(String name, int size, int id) {
        this.name = name;
        this.size = size;
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
