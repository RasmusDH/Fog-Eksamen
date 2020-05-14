package FunctionLayer;

public class carportMaterial {

    String name;
    String unit;
    int id;
    int width;
    int size;
    int amount;
    String comment;

    public carportMaterial(String name, String unit, int id, int width, int size, int amount, String comment) {
        this.name = name;
        this.unit = unit;
        this.id = id;
        this.width = width;
        this.size = size;
        this.amount = amount;
        this.comment = comment;
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
