package UtilClass;



import DBAccess.MaterialMapper;
import DBAccess.UserMapper;
import FunctionLayer.*;

import java.util.List;


public class Initializer {

    private static List<Material> materialList;

    public static void initMaterials() {
        if (materialList == null){
            materialList = MaterialMapper.getMaterial();
        }
    }

    public static List<Material> getMaterialList(){

        return materialList;
    }

}