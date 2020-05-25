package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class CustomWithout extends Command {
    static CarportConstruction carportConstruction = null;
    static CustomerCustomOrder customerCustomOrder = null;
    static CostructionMaterialCalculation costructionMaterialCalculation;
    private int roofId = 1;
    private Date orderDelivery = null;

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        HttpSession session = request.getSession();

        // Vi får "kurv" fra login
        //Orderlist orderlist = (Orderlist) session.getAttribute("kurv");

        int carportLength = Integer.parseInt(request.getParameter("length"));
        int carportWidth = Integer.parseInt(request.getParameter("width"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");


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
            session.setAttribute("carportLength", carportLength);
            session.setAttribute("carportWidth", carportWidth);


            LocalDate orderDate = LocalDate.now();
            int orderId = 2;

            carportConstruction = new CarportConstruction(carportLength, carportWidth);

            customerCustomOrder = new CustomerCustomOrder(orderId, name, email, orderDate, orderDelivery, carportConstruction, roofId);
            OrderMapper.insertOrder(customerCustomOrder);


            costructionMaterialCalculation = new CostructionMaterialCalculation();
            ArrayList<CarportMaterial> woodMaterials = costructionMaterialCalculation.woodMaterialCalculator(carportConstruction);
            OrderMapper.insertOrderDetails(woodMaterials, customerCustomOrder);

            request.setAttribute("woodMaterials", woodMaterials);



            request.setAttribute("status", "ok");
        costructionMaterialCalculation.emptyKurv();

        return "customWithout";
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
