package DBAccess;

import FunctionLayer.Material;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MaterialMapper {

    public static ArrayList<Material> getMaterial() {

        ArrayList<Material> materialList = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT * FROM materials";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {

                String name = rs.getString( "kind" );
                materialList.add(new Material(name));
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        return materialList;
    }

}