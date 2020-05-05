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

    public static ArrayList<Measurement> getMeasurementsWidth(String width) {


        ArrayList<Measurement> measurementListWidth = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT measure FROM measurements " + "WHERE Navn=?";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ps.setString(1, width);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                int measurement = rs.getInt( "measure" );
                measurementListWidth.add(new Measurement(measurement));
            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }

        return measurementListWidth;
    }

    public static ArrayList<Measurement> getMeasurementsLength(String Legnth) {


        ArrayList<Measurement> measurementListLength = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT measure FROM measurements " + "WHERE Navn=?";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ps.setString(1, Legnth);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {

                int measurement = rs.getInt( "measure" );
                measurementListLength.add(new Measurement(measurement));
            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        return measurementListLength;
    }

    public static ArrayList<Measurement> getMeasurementsShedWidth(String shedWitdh) {




        ArrayList<Measurement> measurementListShedWidth = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT measure FROM measurements " + "WHERE Navn=?";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ps.setString(1, shedWitdh);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                int measurement = rs.getInt( "measure" );
                measurementListShedWidth.add(new Measurement(measurement));
            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        return measurementListShedWidth;
    }

    public static ArrayList<Measurement> getMeasurementsShedLength(String shedLength) {
        ArrayList<Measurement> measurementListShedLength = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT measure FROM measurements " + "WHERE Navn=?";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ps.setString(1, shedLength);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                int measurement = rs.getInt( "measure" );
                measurementListShedLength.add(new Measurement(measurement));
            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        return measurementListShedLength;
    }



}