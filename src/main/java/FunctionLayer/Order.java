package FunctionLayer;

import java.util.Date;

public class Order {

    private int OrderId;
    private String name;
    private String email;
    private Date orderdate;
    private Date orderdelivery;
    private int length;
    private int width;
    private int roofId;

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getOrderdelivery() {
        return orderdelivery;
    }

    public void setOrderdelivery(Date orderdelivery) {
        this.orderdelivery = orderdelivery;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRoofId() {
        return roofId;
    }

    public void setRoofId(int roofId) {
        this.roofId = roofId;
    }

    public Order(int orderId, String name, String email, Date orderdate, Date orderdelivery, int length, int width, int roofId) {
        OrderId = orderId;
        this.name = name;
        this.email = email;
        this.orderdate = orderdate;
        this.orderdelivery = orderdelivery;
        this.length = length;
        this.width = width;
        this.roofId = roofId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "OrderId=" + OrderId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", orderdate=" + orderdate +
                ", orderdelivery=" + orderdelivery +
                ", length=" + length +
                ", width=" + width +
                ", roofId=" + roofId +
                '}';
    }
}
