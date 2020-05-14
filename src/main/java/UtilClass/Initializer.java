package UtilClass;



import DBAccess.RoofMapper;
import FunctionLayer.*;

import java.util.List;


public class Initializer {

    private static String width = "width";
    private static String lengthMeasure = "length";
    private static String shedWitdh = "shed width";
    private static String shedLength = "shed length";
    private static List<Material> materialList;
    private static List<Measurement> measurementLength;
    private static List<Measurement> measurementWidth;
    private static List<Measurement> measurementShedLength;
    private static List<Measurement> measurementShedWidth;
    private static List<Roof> roofList;

/*
    public static List<Material> initMaterialList() {
        if (materialList == null){
            try {
                materialList = MaterialMapper.getMaterial();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return materialList;
    }
    public static void initMeasurements() {
        if (measurementLength == null){
            measurementLength = MeasurementMapper.getMeasurementsLength(lengthMeasure);
        }
        if (measurementWidth == null){
            measurementWidth = MeasurementMapper.getMeasurementsWidth(width);
        }
        if (measurementShedLength == null){
            measurementShedLength = MeasurementMapper.getMeasurementsShedLength(shedLength);
        }
        if (measurementShedWidth == null){
            measurementShedWidth = MeasurementMapper.getMeasurementsShedWidth(shedWitdh);
        }
    }

    public static List<Roof> initRoofList() {
        if (roofList == null){
            try {
                roofList = RoofMapper.getRoof();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return roofList;
    }

    public static List<Measurement> getMeasurementWidth(){
        return measurementWidth;
    }
    public static List<Measurement> getMeasurementLength(){
        return measurementLength;
    }
    public static List<Measurement> getMeasurementShedWidth(){
        return measurementShedWidth;
    }
    public static List<Measurement> getMeasurementShedLength(){
        return measurementShedLength;
    }
*/
}