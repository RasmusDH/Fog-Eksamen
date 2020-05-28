package FunctionLayer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructionSizeCalculationTest {
    CarportConstruction carportConstruction = new CarportConstruction(400, 420);
    @Test
    public void roofSpaerLength() {

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
        int actual = 420;
        Assert.assertEquals(spaerLength, actual);
    }

    @Test
    public void roofSpaerAmount() {
        int carportLength = carportConstruction.getCarportLength()*10;
        double nearSpaerAmount = carportLength/500.0 +1;
        int spaerAmount = (int) Math.round(nearSpaerAmount);
        int actual = 9;

        Assert.assertEquals(spaerAmount, actual);

    }
}