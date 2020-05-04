package DBAccess;

import FunctionLayer.BillOfMaterials;
import FunctionLayer.Material;
import FunctionLayer.Roof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BillOfMaterialsMapper {

    public static ArrayList<BillOfMaterials> BillOfMaterials() {

        ArrayList<BillOfMaterials> BillOfMaterials = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT * FROM BillOfMaterials";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {

                int materialId = rs.getInt("materialId");
                String type = rs.getString( "type" );
                int length = rs.getInt("length");
                int amount = rs.getInt("amount");
                String unit = rs.getString("unit");
                BillOfMaterials.add(new BillOfMaterials(materialId, type, length, amount, unit));
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        return BillOfMaterials;
    }

}