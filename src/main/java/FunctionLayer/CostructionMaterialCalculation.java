package FunctionLayer;

import java.util.ArrayList;

public class CostructionMaterialCalculation {

    ConstructionSizeCalculation constructionSizeCalculation = new ConstructionSizeCalculation();

    //skal måske sættes i egen metode?
    public ArrayList woodMaterialCalculator() {
        ArrayList<carportMaterial> woodMaterials = new ArrayList<>();

        //Spaer
        int amount = constructionSizeCalculation.roofSpaerAmount(carportConstruction);
        int size = constructionSizeCalculation.roofSpaerLength(carportConstruction);
        carportMaterial spær = null;
        for (int i = 0; i < amount; i++) {
            spær = LogicFacade.getMaterialBySize(size);
            spær.setName("SPÆRTRE");
            spær.setUnit(LogicFacade.getUnitByName(spær.getName()));
            spær.setWidth(LogicFacade.getWidthById(spær.getId(), spær.getName()));
            spær.setThickness(LogicFacade.getThicknessByID(spær.getId()));
            spær.setName("SPÆRTRÆ" + spær.getThickness() + "x" + spær.getWidth());
            spær.setSize(size);
            spær.setAmount(amount);

            spær.setComment("Spær skal monteres på remme");
            woodMaterials.add(spær);

        }

/*
   //stolper
    int amount = constructionSizeCalculation.pillarAmount(carportConstruction);
    carportMaterial stolper = null;
    for (int i = 0; i < amount; i++) {
        stolper = LogicFacade.getPillarMaterial;
        stolper.setName("STOLPETRÆ");
        stolper.setUnit(LogicFacade.getUnitByName(stolper.getName()));
            stolper.setLength(LogicFacade.getLengthById(stolper.getId(), stolper.getName()));
            stolper.setThickness(LogicFacade.getThicknessById(stolper.getId()));
            stolper.setName("STOLPETRÆ" + stolper.getThickness() + "x" + stolper.getLength());
        stolper.setAmount(amount);

        stolper.setComment("Stolper skal graves 90 cm ned i jorden");
        woodMaterials.add(stolper);

    }

    //rem
    int amount = constructionSizeCalculation.stropAmount(carportConstruction);
    int size = constructionSizeCalculation.stropLength(carportConstruction);
    carportMaterial rem = null;
    for (int i = 0; i < amount; i++) {
        rem = LogicFacade.getStropMaterial;
        rem.setName("REMTRÆ");
        rem.setUnit(LogicFacade.getUnitByName(rem.getName()));
            rem.setWidth(LogicFacade.getWidthById(rem.getId(), rem.getName()));
            rem.setThickness(LogicFacade.getThicknessById(rem.getId()));
            rem.setName("REMTRÆ" + rem.getThickness() + "x" + rem.getLength());
        rem.setAmount(amount);

        rem.setComment("Rem montores ovenpå stolperne");
        woodMaterials.add(rem);
    }
*/
    return woodMaterials;
    }
}


