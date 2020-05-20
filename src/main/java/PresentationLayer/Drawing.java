package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Svg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Drawing extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        Svg svg = new Svg(800, 600, "0,0,800,600",0,0);
        Svg svgInnerDrawing = new Svg(900,800,"0,0,900,800",0,0);
        svg.addRect(x, 0, 600, 780);

        // Spær

        int antalSpaer = 6;
        int afstandMellemSpaer = 154;

        for (int x = 0; x < antalSpaer; x += afstandMellemSpaer ) {
            svg.addRect(x, 35, 4, 500);
        }

        request.setAttribute("svgdrawing", svg.toString());
        return "drawing";
    }
}