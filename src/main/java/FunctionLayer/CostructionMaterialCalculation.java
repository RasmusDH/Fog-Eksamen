package FunctionLayer;

public class CostructionMaterialCalculation {

    ConstructionSizeCalculation constructionSizeCalculation = new ConstructionSizeCalculation();

    //skal måske sættes i egen metode?

    //Spaer
    int amount = constructionSizeCalculation.roofSpaerAmount(carportConstruction);
    int size = constructionSizeCalculation.roofSpaerLength(carportConstruction);
    carportMaterial spær = null;
    for (int i = 0; i < amount; i++) {
        spær = LogicFacade.getMaterialBySize(size);
        spær.setName("SPÆRTRE UBEHANDLET");
        spær.setUnit(LogicFacade.getUnitByName(spær.getName()));
            spær.setWidth(LogicFacade.getWidthById(spær.getId(), spær.getName()));
            spær.setThickness(LogicFacade.getThicknessByID(spær.getId()));
            spær.setName("SPÆRTRÆ UBEHANDLET" + spær.getThickness() + "x" + spær.getWidth());
        spær.setSize(size);
        spær..setAmount(amount);

        spær.setComment("Spær skal monteres på remme");
        woodMaterials.add(spær);

    }
}
