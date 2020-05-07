package PresentationLayer;

import DBAccess.MeasurementMapper;
import DBAccess.MaterialMapper;
import DBAccess.RoofMapper;
import FunctionLayer.*;
import UtilClass.Initializer;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomOrderWithShed extends Command {
    private String width = "width";
    private String lengthMeasure = "length";
    private String shedWidth = "shed width";
    private String shedLength = "shed length";
    //static OrderItem orderItem = null;
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();


        ArrayList<Material> materials = MaterialMapper.getMaterial();
        ArrayList<Measurement> measureWidth = MeasurementMapper.getMeasurementsWidth(width);
        ArrayList<Measurement> measureLength = MeasurementMapper.getMeasurementsLength(lengthMeasure);
        ArrayList<Measurement> measureShedWidth = MeasurementMapper.getMeasurementsShedWidth(shedWidth);
        ArrayList<Measurement> measureShedLength = MeasurementMapper.getMeasurementsShedLength(shedLength);
        System.out.println(measureShedWidth);
        System.out.println(measureWidth);
        System.out.println(materials);
        System.out.println(measureLength);
        System.out.println(measureShedLength);



        request.setAttribute("measureLengths", measureLength);
        request.setAttribute("measureWidths", measureWidth);
        request.setAttribute("measureShedLengths", measureShedLength);
        request.setAttribute("measureShedWidths", measureShedWidth);
        request.setAttribute("del 6", materials);
        request.setAttribute("materials", materials);

        // Vi får "kurv" fra login
        //Orderlist orderlist = (Orderlist) session.getAttribute("kurv");

        int carportLength = Integer.parseInt(request.getParameter("del 1"));
        int carportWidth = Integer.parseInt(request.getParameter("del 2"));
        int shedLength = Integer.parseInt(request.getParameter("del 3"));
        int shedWidth = Integer.parseInt(request.getParameter("del 4"));
        String carportMaterial = request.getParameter("del 5");
        String roofMaterial = request.getParameter("del 6");

        if (carportWidth <= shedWidth) {
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


            session.setAttribute("carportMaterialName", materials);


            //orderItem = new customerCustomOrder(getMaterial(materials));
            // tilføjer ordren til kurve listen:
            //orderlist.addOrderItem(orderItem);

            //System.out.println("finalprice after: " + finalPrice);

            request.setAttribute("status", "ok");
            //request.setAttribute("message",
              //      String.format("Bund: %s, Topping: %s, Antal: %d er nu lagt i kurven",
                //            bottom, topping, quantity));

           // request.setAttribute("orderItem", orderItem);
        }
        return "CustomOrderWithShed";
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
