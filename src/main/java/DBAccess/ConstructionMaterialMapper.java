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
        public static ConstructionMaterialList getMaterialBySize(String size) {


            try {
                Connector.connection();
                String SQL = "SELECT * FROM constructionmaterials" + "WHERE length=?";
                PreparedStatement ps = Connector.connection().prepareStatement( SQL );
                ps.setString(1, size);
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

        }


    }
