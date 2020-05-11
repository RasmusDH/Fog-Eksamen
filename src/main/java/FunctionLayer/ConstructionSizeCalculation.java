package FunctionLayer;

public class ConstructionSizeCalculation {

    public int roofSpaerLength (CarportConstruction carportConstruction) {

        int carportWidth = carportConstruction.getConstructionWidth()*10;
        int spaerLength;

        if(carportWidth<=3000) {
            spaerLength = 300;
        }
        else if(carportWidth<=3600) {
            spaerLength = 360;
        }
        else if(carportWidth<=4200) {
            spaerLength = 420;
        }
        else if(carportWidth<=4800) {
            spaerLength = 480;
        }
        else if(carportWidth<=5400) {
            spaerLength = 540;
        }
        else if(carportWidth<=6000) {
            spaerLength = 600;
        }
        else if(carportWidth<=6600) {
            spaerLength = 660;
        }
        else {
            spaerLength = 720;
        }
        return spaerLength;
    }

    public int roofSpaerAmount (CarportConstruction carportConstruction) {
        //todo return number of spaer that will be needed for the entire carport length
        //todo in ConstructionMaterialCalculation write method that returns two materials of beslag
        // - one for the left side and one for the right side with the number of spaer and material that is the beslag

        // Max 500 mm between each spaer
        int carportLength = carportConstruction.getCarportLength()*10;
        double nearSpaerAmount = carportLength/500.0 +1;
        int spaerAmount = (int) Math.round(nearSpaerAmount);
        return spaerAmount;
    }
}
