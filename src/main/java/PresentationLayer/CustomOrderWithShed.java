package PresentationLayer;

import FunctionLayer.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class CustomOrderWithShed extends Command {
    private String width = "width";
    private String lengthMeasure = "length";
    private String shedWidth = "shed width";
    private String shedLength = "shed length";
    static CarportConstruction carportConstruction = null;
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();


        ArrayList<String> measureWidth = new ArrayList<>();
        measureWidth.add("270");
        measureWidth.add("300");
        measureWidth.add("330");

        ArrayList<String> measureLength = new ArrayList<>();
        measureLength.add("300");
        measureLength.add("330");
        measureLength.add("360");

        request.setAttribute("measureLengths", measureLength);
        request.setAttribute("measureWidths", measureWidth);
        //request.setAttribute("measureShedLengths", measureShedLength);
        //request.setAttribute("measureShedWidths", measureShedWidth);
        //request.setAttribute("del 6", materials);
        //request.setAttribute("materials", materials);

        // Vi får "kurv" fra login
        //Orderlist orderlist = (Orderlist) session.getAttribute("kurv");

        int carportLength = Integer.parseInt(request.getParameter("del 1"));
        int carportWidth = Integer.parseInt(request.getParameter("del 2"));
        //int shedLength = Integer.parseInt(request.getParameter("del 3"));
        //int shedWidth = Integer.parseInt(request.getParameter("del 4"));
        //String carportMaterial = request.getParameter("del 5");
        //String roofMaterial = request.getParameter("del 6");

        /*if (carportWidth <= shedWidth) {
            request.setAttribute("status", "error");
            request.setAttribute("message",
                    String.format("Skur bredden er for stor!",
                            shedWidth));
        }

        else if (carportLength <= shedLength) {
            request.setAttribute("status", "error");
            request.setAttribute("message",
                    String.format("Skur bredden er for stor!",
                            shedWidth));
        }

        else if (carportMaterial == null) {
            request.setAttribute("status", "error");
            request.setAttribute("message",
                    String.format("Du mangler at vælge materiale!",
                            carportMaterial));
        } else {
            //int quantity = Integer.parseInt(antal);

*/
        if (carportLength == 0) {
            request.setAttribute("status", "error");
            request.setAttribute("message",
                    String.format("Du mangler at vælge et mål!",
                            carportLength));
        }
            //session.setAttribute("carportMaterialName", materials);
            session.setAttribute("carportLength", carportLength);
            session.setAttribute("carportWidth", carportWidth);

            carportConstruction = new CarportConstruction(carportLength, carportWidth);
            //orderItem = new customerCustomOrder(getMaterial(materials));
            // tilføjer ordren til kurve listen:
            //orderlist.addOrderItem(orderItem);

            //System.out.println("finalprice after: " + finalPrice);

            request.setAttribute("status", "ok");
            //request.setAttribute("message",
              //      String.format("Bund: %s, Topping: %s, Antal: %d er nu lagt i kurven",
                //            bottom, topping, quantity));

           // request.setAttribute("orderItem", orderItem);

        return "customOrderWithShed";
    }



    public static Material getMaterial(ArrayList<Material> materials) {
        for (Material t: materials) {
            if(materials.contains(t.getName())) {
                Material mat = new Material(t.getName());
                return mat;
            }
        }
        return null;
    }


}
