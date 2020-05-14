package FunctionLayer;

import java.util.ArrayList;

public class Material {

    private String name;
    private ArrayList<Integer> measurements = new ArrayList<Integer>();

    public Material(String name) {

        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return name + "\n";
    }




}

