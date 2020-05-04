package FunctionLayer;

public class BillOfMaterials {

    private int materialId;
    private String type;
    private int length;
    private int amount;
    private String unit;

    public BillOfMaterials(int materialId, String type, int length, int amount, String unit) {
        this.materialId = materialId;
        this.type = type;
        this.length = length;
        this.amount = amount;
        this.unit = unit;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "BillOfMaterials: " +
                "\nMaterialID: " + materialId +
                "\nType: " + type +
                "\nLength" + length +
                "\nAmount " + amount +
                "\nUnit " + unit;
    }
}
