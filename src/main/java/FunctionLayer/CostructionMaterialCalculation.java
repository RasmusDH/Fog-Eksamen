package FunctionLayer;

import java.util.ArrayList;

public class CostructionMaterialCalculation {

    ConstructionSizeCalculation constructionSizeCalculation = new ConstructionSizeCalculation();
    private static ArrayList<CarportMaterial> woodMaterials = new ArrayList<>();


    public ArrayList woodMaterialCalculator(CarportConstruction carportConstruction) throws LoginSampleException {
        try {


            //Spaer
            int amount = constructionSizeCalculation.roofSpaerAmount(carportConstruction);
            int size = constructionSizeCalculation.roofSpaerLength(carportConstruction);
            CarportMaterial spær = null;
            for (int i = 0; i < amount; i++) {
                spær.setName("SPÆRTRE UBEHANDLET");
                spær = LogicFacade.getMaterialBySizeAndName(size, spær.getName());
                spær.setName("SPÆRTRÆ UBEHANDLET" + spær.getThickness() + "x" + spær.getWidth());
                spær.setSize(size);
                spær.setAmount(amount);
                spær.setComment("Spær skal monteres på rem");
                woodMaterials.add(spær);

            }


            //stolper
            amount = constructionSizeCalculation.pillarAmount(carportConstruction);
            size = 300;
            CarportMaterial stolper = null;
            for (int i = 0; i < amount; i++) {
                stolper.setName("STOLPETRÆ");
                stolper = LogicFacade.getPillarMaterial(stolper.getName());
                stolper.setName("STOLPETRÆ" + stolper.getThickness() + "x" + stolper.getWidth());
                stolper.setAmount(amount);
                stolper.setComment("Stolper skal graves 90 cm ned i jorden");
                woodMaterials.add(stolper);

            }

            //rem
            amount = constructionSizeCalculation.stropAmount(carportConstruction);
            size = constructionSizeCalculation.stropLength(carportConstruction);
            CarportMaterial rem = null;
            for (int i = 0; i < amount; i++) {
                rem.setName("REMTRÆ");
                rem = LogicFacade.getStropMaterialByNameAndSize(rem.getName(), size);
                rem.setName("REMTRÆ" + rem.getThickness() + "x" + rem.getWidth());
                rem.setAmount(amount);
                rem.setComment("Rem montores ovenpå stolperne");
                woodMaterials.add(rem);
            }


            return woodMaterials;
        }
    catch ( LoginSampleException ex ) {
        throw new LoginSampleException(ex.getMessage());
    }
    }
    public ArrayList<CarportMaterial> getOrderlist() {
        return woodMaterials;
    }
    public void emptyKurv() {
        woodMaterials.clear();

    }
}


