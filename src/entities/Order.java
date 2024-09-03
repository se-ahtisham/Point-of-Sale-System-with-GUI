package entities;

import java.util.ArrayList;

public class Order {

    private static int orderId;
    private static Long customerId;
    private static String customerName;
    private static String customerPhonenumber;
    private static String customerAddress;

    private static ArrayList<orderproducts> orderproducts = new ArrayList<>();

    public Order() {
    }

    public static int getOrderId() {
        return orderId;
    }

    public static void setOrderId(int orderId) {
        Order.orderId = orderId;
    }

    public static Long getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(Long customerId) {
        Order.customerId = customerId;
    }

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName(String customerName) {
        Order.customerName = customerName;
    }

    public static String getCustomerPhonenumber() {
        return customerPhonenumber;
    }

    public static void setCustomerPhonenumber(String customerPhonenumber) {
        Order.customerPhonenumber = customerPhonenumber;
    }

    public static String getCustomerAddress() {
        return customerAddress;
    }

    public static void setCustomerAddress(String customerAddress) {
        Order.customerAddress = customerAddress;
    }

    public static ArrayList<orderproducts> getOrderproducts() {
        return orderproducts;
    }

    // Default constructor
    public static void setOrderproducts(ArrayList<orderproducts> orderproducts) {
        Order.orderproducts = orderproducts;
    }

    // Method to add a product to the order
    public void addOrder(orderproducts products) {
        if (products != null) {
            orderproducts.add(products);
        } else {
            System.out.println("Cannot add the products.");
        }
    }

    // Method to get all products in the order
    public static ArrayList<orderproducts> getAllOrders() {
        return orderproducts;
    }

}
