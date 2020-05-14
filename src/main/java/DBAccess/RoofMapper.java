package DBAccess;

import FunctionLayer.Material;
import FunctionLayer.Roof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoofMapper {

    public static ArrayList<Roof> getRoof() {

        ArrayList<Roof> roofList = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT * FROM roof";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {

                String kind = rs.getString( "Kind" );
                int slope = rs.getInt( "slope" );
                int roofId = rs.getInt ("roofId");
                roofList.add(new Roof(roofId, kind, slope));
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        return roofList;
    }

}