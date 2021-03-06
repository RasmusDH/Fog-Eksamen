package FunctionLayer;

/**
 *
 */
public class ConstructionSizeCalculation {

    public int roofSpaerLength (CarportConstruction carportConstruction) {

        int carportWidth = carportConstruction.getCarportWidth()*10;
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

        // Max 500 mm between each spaer
        int carportLength = carportConstruction.getCarportLength()*10;
        double nearSpaerAmount = carportLength/500.0 +1;
        int spaerAmount = (int) Math.round(nearSpaerAmount);
        return spaerAmount;
    }


    public int pillarAmount (CarportConstruction carportConstruction) {

        int carportLength = carportConstruction.getCarportLength()*10;
        double nearPillarAmount = carportLength/2000.0 +1;
        int pillarAmount = (int) Math.round(nearPillarAmount)*2;
        return pillarAmount;
    }

    public int stropLength (CarportConstruction carportConstruction) {

        int carportLength = carportConstruction.getCarportLength()*10;
        double nearPillarAmount = carportLength/2000.0 +1;
        int pillarAmount = (int) Math.round(nearPillarAmount);
        int stropLength = carportLength/pillarAmount;
        return stropLength;

    }

    public int stropAmount (CarportConstruction carportConstruction) {

        int carportLength = carportConstruction.getCarportLength()*10;
        double nearPillarAmount = carportLength/2000.0 +1;
        int pillarAmount = (int) Math.round(nearPillarAmount);
        int stropAmount = (pillarAmount - 1) * 2;
        return stropAmount;
    }

}
