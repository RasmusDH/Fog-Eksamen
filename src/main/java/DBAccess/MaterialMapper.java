package DBAccess;

import FunctionLayer.Measurement;
import FunctionLayer.Roof;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.List;

public class MeasurementMapper {
    private String width = "width";
    private String lengthMeasure = "length";
    private String shedWitdh = "shed width";
    private String shedLength = "shed length";
    public static List<ArrayList> getMeasurements(String width, String lengthMeasure, String shedWitdh, String shedLength) {



        ArrayList<Measurement> measurementListWidth = new ArrayList<>();
        ArrayList<Measurement> measurementListLength = new ArrayList<>();
        ArrayList<Measurement> measurementListShedWidth = new ArrayList<>();
        ArrayList<Measurement> measurementListShedLength = new ArrayList<>();
        List<ArrayList> Measurements = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT measure FROM measurements " + "WHERE width=?";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {

                String name = rs.getString( "Navn" );
                int measurement = rs.getInt( "measure" );
                measurementListWidth.add(new Measurement(name, measurement));
            }
            String SQLLength = "SELECT measure FROM measurements " + "WHERE lengthMeasure=?";
            PreparedStatement psLength = Connector.connection().prepareStatement( SQLLength );
            ResultSet rsLength = psLength.executeQuery();
            while ( rsLength.next() ) {

                String name = rs.getString( "Navn" );
                int measurement = rs.getInt( "measure" );
                measurementListLength.add(new Measurement(name, measurement));
            }
            String SQLShedWitdh = "SELECT measure FROM measurements " + "WHERE shedWitdh=?";
            PreparedStatement psShedWitdh = Connector.connection().prepareStatement( SQLShedWitdh );
            ResultSet rsShedWitdh = psShedWitdh.executeQuery();
            while ( rsShedWitdh.next() ) {

                String name = rs.getString( "Navn" );
                int measurement = rs.getInt( "measure" );
                measurementListShedWidth.add(new Measurement(name, measurement));
            }
            String SQLShedLength = "SELECT measure FROM measurements " + "WHERE shedLength=?";
            PreparedStatement psShedLength = Connector.connection().prepareStatement( SQLShedLength );
            ResultSet rsShedLength = psShedLength.executeQuery();
            while ( rsShedLength.next() ) {

                String name = rs.getString( "Navn" );
                int measurement = rs.getInt( "measure" );
                measurementListShedLength.add(new Measurement(name, measurement));
            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        Measurements.add(measurementListLength, measurementListWidth, measurementListShedLength, measurementListShedWidth);
        return
    }


}