package DBAccess;

import FunctionLayer.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConstructionMaterialMapper {

        public static ArrayList<ConstructionMaterialList> ConstructionMaterialList() {

            ArrayList<ConstructionMaterialList> constructionMaterialList = new ArrayList<>();

            try {
                Connector.connection();
                String SQL = "SELECT * FROM constructionmaterials";
                PreparedStatement ps = Connector.connection().prepareStatement( SQL );
                ResultSet rs = ps.executeQuery();
                while ( rs.next() ) {

                    int materialId = rs.getInt("materialId");
                    String type = rs.getString( "type" );
                    int length = rs.getInt("length");
                    String unit = rs.getString("unit");
                    int width = rs.getInt("width");
                    double thickness = rs.getDouble("thickness");
                    constructionMaterialList.add(new ConstructionMaterialList(materialId, type, length, unit, width, thickness));
                }
            } catch ( ClassNotFoundException | SQLException ex ) {
                System.out.println(ex.getMessage());
            }
            return constructionMaterialList;
        }
        public static CarportMaterial getMaterialBySize(int size, String name) throws LoginSampleException {
            try {
                Connector.connection();
                String SQL = "SELECT * FROM constructionmaterials" + "WHERE length=? AND type=?";
                PreparedStatement ps = Connector.connection().prepareStatement(SQL);
                ps.setInt(1, size);
                ps.setString(2, name);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt("materialId");
                    String unit = rs.getString("unit");
                    int width = rs.getInt("width");
                    double thickness = rs.getDouble("thickness");
                    String comment = null;
                    int amount = 0;
                    int orderId = 0;
                    CarportMaterial carportMaterial = new CarportMaterial(orderId, name, unit, id, width, thickness, size, amount, comment);
                    return carportMaterial;
                }
                else {
                    throw new LoginSampleException("kunne ikke finde materiale");
                }

            } catch (ClassNotFoundException | SQLException ex) {
                throw new LoginSampleException(ex.getMessage());
            }

        }
    public static CarportMaterial getMaterialByName(String name) throws LoginSampleException {
        try {
            Connector con = new Connector();
            String SQL = "SELECT * FROM constructionmaterials "
                    + "WHERE type=?";
            PreparedStatement ps = Connector.connection().prepareStatement(SQL);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("materialId");
                String unit = rs.getString("unit");
                int width = rs.getInt("width");
                double thickness = rs.getDouble("thickness");
                String comment = null;
                int amount = 0;
                int orderId = 0;
                int size = rs.getInt("length");
                CarportMaterial carportMaterial = new CarportMaterial(orderId, name, unit, id, width, thickness, size, amount, comment);
                return carportMaterial;
            } else {
                throw new LoginSampleException("Kunne ikke finde materialet.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

        }
