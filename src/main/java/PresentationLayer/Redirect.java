package PresentationLayer;

import UtilClass.Initializer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Redirect extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) {

        String destination = request.getParameter("destination");

        if(destination.equals("customWithShed")) {
         //   request.setAttribute("materials", Initializer.initMaterialList());
        }

        return destination;
    }


}
