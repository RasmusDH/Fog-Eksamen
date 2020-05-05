package FunctionLayer;

public class Material {

    private String name;

    public Material(String name) {

        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String material) {
        this.name = name;
    }

    @Override
    public String toString() {

        return name + "\n";
    }


}

