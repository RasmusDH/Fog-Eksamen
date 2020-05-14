package DBAccess;

import FunctionLayer.Order;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class OrderMapper {
    public static ArrayList<Order> getOrders() {

        ArrayList<Order> orderList = new ArrayList<>();

        try {
            Connector.connection();
            String SQL = "SELECT * FROM orders";
            PreparedStatement ps = Connector.connection().prepareStatement( SQL );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {

                int orderId = rs.getInt( "orderId" );
                String name = rs.getString( "name" );
                String email = rs.getString("email");
                Date orderdate = rs.getDate("orderdate");
                Date orderdelivery = rs.getDate("orderdelivery");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int roofId = rs.getInt("roofId");
                orderList.add(new Order(orderId, name, email, orderdate, orderdelivery, length, width, roofId));
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            System.out.println(ex.getMessage());
        }
        return orderList;
    }
}
