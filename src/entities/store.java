package entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class store {

    private static ArrayList<productclass> productclass = new ArrayList<>();

    public static void showerrormessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void dummyadd() {
        productclass.add(new productclass(1, "Lays", "Snacks", 10, 10.0, 20.0));
        productclass.add(new productclass(2, "Pepsi", "Beverages", 20, 12.5, 25.0));
        productclass.add(new productclass(3, "KitKat", "Confectionery", 15, 5.0, 10.0));
        productclass.add(new productclass(4, "Oreo", "Biscuits", 25, 8.0, 16.0));
        productclass.add(new productclass(5, "Tropicana", "Juices", 30, 18.0, 36.0));
        productclass.add(new productclass(6, "Nescafe", "Coffee", 40, 20.0, 40.0));
        productclass.add(new productclass(7, "Maggi", "Noodles", 50, 7.5, 15.0));
        productclass.add(new productclass(8, "Dairy Milk", "Chocolate", 60, 15.0, 30.0));
    }

    public static void addproduct(productclass p) {
        if (p != null) {
            productclass.add(p);
            JOptionPane.showMessageDialog(null, "Product Added successfully:)");
        } else {
            JOptionPane.showMessageDialog(null, "Object is Null");
        }

    }

    public static ArrayList<productclass> printall() {
        return productclass;
    }

    public static productclass serachProductByName(String name) {

        for (int i = 0; i < productclass.size(); i++) {
            if (productclass.get(i).getProductName().equalsIgnoreCase(name)) {
                return productclass.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Product Not Found");
        return null;
    }

    public static productclass serachProductById(int id) {

        for (int i = 0; i < productclass.size(); i++) {
            if (productclass.get(i).getProductId() == id) {
                return productclass.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Product Not Found");
        return null;
    }

    public static void delete(productclass obj) {
        productclass.remove(obj);
        store.showerrormessage("Delete SuccessFully!");
    }

    public static void updateByID(int id, productclass obj) {
        for (int i = 0; i < productclass.size(); i++) {
            if (productclass.get(i).getProductId() == id) {
                productclass.get(i).setProductName(obj.getProductName());
                productclass.get(i).setProductCatagory(obj.getProductCatagory());
                productclass.get(i).setProductStock(obj.getProductStock());
                productclass.get(i).setProductRetailPrice(obj.getProductRetailPrice());
                productclass.get(i).setWholeSalePrice(obj.getWholeSalePrice());
                store.showerrormessage("Product Updated");
            }
        }
    }

    public static void updateByName(String name, productclass obj) {
        for (int i = 0; i < productclass.size(); i++) {
            if (productclass.get(i).getProductName().equalsIgnoreCase(name)) {
                productclass.get(i).setProductId(obj.getProductId());
                productclass.get(i).setProductCatagory(obj.getProductCatagory());
                productclass.get(i).setProductStock(obj.getProductStock());
                productclass.get(i).setProductRetailPrice(obj.getProductRetailPrice());
                productclass.get(i).setWholeSalePrice(obj.getWholeSalePrice());
                store.showerrormessage("Product Updated");
            }
        }
    }

}
