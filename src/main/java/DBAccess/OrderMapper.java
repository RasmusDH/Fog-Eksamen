package DBAccess;

import FunctionLayer.CarportMaterial;
import FunctionLayer.CustomerCustomOrder;
import FunctionLayer.Order;
import FunctionLayer.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public static void insertOrder(CustomerCustomOrder customerCustomOrder) {

        long millis=System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        try {
            Connector.connection();
            String SQL = "INSERT INTO orders (name, email, orderdate, orderdelivery, length, width, roofid) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = Connector.connection().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(2, customerCustomOrder.getName());
            ps.setDate(3, date);
            ps.setDate(4, (java.sql.Date) customerCustomOrder.getOrderDelivery());
            ps.setInt(5, customerCustomOrder.getCarportConstruction().carportLength);
            ps.setInt(6, customerCustomOrder.getCarportConstruction().carportWidth);
            ps.setInt(7, customerCustomOrder.getRoodId());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            customerCustomOrder.setOrderID(id);
        } catch (SQLException | ClassNotFoundException ex) {
            try {
                throw new SQLException(ex.getMessage());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertOrderDetails(ArrayList<CarportMaterial> woodMaterials, CustomerCustomOrder order) {

        long millis=System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);

        try {
            Connector con = new Connector();
            String SQL = "INSERT INTO billofmaterials (materialid, orderid, type, length, amount, unit) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = null;
            for (CarportMaterial carportMaterial: woodMaterials) {
                ps = Connector.connection().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(2, carportMaterial.getId());
                ps.setInt(3, order.getOrderID());
                ps.setString(4, carportMaterial.getName());
                ps.setInt(5, carportMaterial.getSize());
                ps.setInt(6, carportMaterial.getAmount());
                ps.setString(7, carportMaterial.getUnit());

                ps.executeUpdate();


            }
        } catch (SQLException | ClassNotFoundException ex) {
            try {
                throw new SQLException(ex.getMessage());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
