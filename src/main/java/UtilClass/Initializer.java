package UtilClass;



import DBAccess.MaterialMapper;
import DBAccess.UserMapper;
import FunctionLayer.*;
import sun.rmi.runtime.Log;

import java.util.List;


public class Initializer {

    private static List<Material> materialList = null;
    private static List<Measurement> measurementList = null;

    public static List<Material> getMaterialList() {
        if (materialList == null){
            try {
                materialList = LogicFacade.getMaterial();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return materialList;
    }

    public static List<Measurement> getMeasurementList() {
        if (measurementList == null){
            try {
                measurementList = LogicFacade.getMeasurements();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return measurementList;
    }
}