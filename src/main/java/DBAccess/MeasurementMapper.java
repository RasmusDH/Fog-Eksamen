package DBAccess;

import FunctionLayer.Measurement;
import FunctionLayer.Roof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MeasurementMapper {

    public static ArrayList<Measurement> getMeasurements() {

        ArrayList<Measurement> measurementList = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT * FROM measurements";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {

                String name = rs.getString( "Navn" );
                int measurement = rs.getInt( "measure" );
                measurementList.add(new Measurement(name, measurement));
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        return measurementList;
    }


}