package entities;


import java.util.ArrayList;

public class Orderlist {

    public static ArrayList<Order> orderlist = new ArrayList<>();

    public static void addOrder(Order Obj) {
        if (Obj != null) {
            orderlist.add(Obj);
        } else {
            store.showerrormessage("Order Not Added!");
        }
    }

    public static Order searchOrder(int id) {
        for (int i = 0; i < orderlist.size(); i++) {
            if (id == orderlist.get(i).getOrderId()) {
                return orderlist.get(i);
            }
        }
        store.showerrormessage("Order Not Found");
        return null;
    }

 public static void deleteOrder(int id) {
        for (int i = 0; i < orderlist.size(); i++) {
            if (id == orderlist.get(i).getOrderId()) {
                orderlist.remove(orderlist.get(i));
                store.showerrormessage("Order Deleted!");
            }
        }
        store.showerrormessage("Order Not Found");
    }

 
 
 public static ArrayList<Order> printall() {
        return orderlist;
    }
 
 




}
