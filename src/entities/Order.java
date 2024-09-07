package entities;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private Long customerId;
    private String customerName;
    private String customerPhonenumber;
    private String customerAddress;

    private ArrayList<orderproducts> orderproducts = new ArrayList<>();
    //for tabel
    private static ArrayList<orderproducts> orderstaticproducts = new ArrayList<>();

    public Order() {
    }

    public Order(int orderId, Long customerId, String customerName, String customerPhonenumber, String customerAddress, ArrayList<orderproducts> orderproducts) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhonenumber = customerPhonenumber;
        this.customerAddress = customerAddress;
        this.orderproducts = orderproducts != null ? orderproducts : new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhonenumber() {
        return customerPhonenumber;
    }

    public void setCustomerPhonenumber(String customerPhonenumber) {
        this.customerPhonenumber = customerPhonenumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public ArrayList<orderproducts> getOrderproducts() {
        return orderproducts;
    }

    public static ArrayList<orderproducts> getstaticOrderproducts() {
        return orderstaticproducts;
    }

    public void addOrder(orderproducts products) {
        if (products != null) {
            orderproducts.add(products);
        } else {
            System.out.println("Cannot add the products.");
        }
    }

    public static void addstaticOrder(orderproducts products) {
        if (products != null) {
            orderstaticproducts.add(products);
        } else {
            System.out.println("Cannot add the products.");
        }
    }

}
