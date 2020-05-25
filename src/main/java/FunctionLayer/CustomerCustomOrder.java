package FunctionLayer;

import java.time.LocalDate;
import java.util.Date;

public class CustomerCustomOrder {




    private int orderID;
    private String name;
    private String email;
    private LocalDate orderDate;
    private Date orderDelivery;
    private CarportConstruction carportConstruction;
    private int roodId;


    public CustomerCustomOrder(int orderID, String name, String email, LocalDate orderDate, Date orderDelivery, CarportConstruction carportConstruction, int roodId) {
        this.orderID = orderID;
        this.name = name;
        this.email = email;
        this.orderDate = orderDate;
        this.orderDelivery = orderDelivery;
        this.carportConstruction = carportConstruction;
        this.roodId = roodId;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
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

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(Date orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public CarportConstruction getCarportConstruction() {
        return carportConstruction;
    }

    public void setCarportConstruction(CarportConstruction carportConstruction) {
        this.carportConstruction = carportConstruction;
    }

    public int getRoodId() {
        return roodId;
    }

    public void setRoodId(int roodId) {
        this.roodId = roodId;
    }

    @Override
    public String toString() {
        return "Navn: " + name + ", email: " + email + ", order date: " + orderDate + ", order delivery: " + orderDelivery + ", lenght: " + carportConstruction.getCarportLength() + ", width: " + carportConstruction.getCarportWidth() + ", roof: " + roodId;
    }


}
