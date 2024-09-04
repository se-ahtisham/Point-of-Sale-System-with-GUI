package entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class store {

    private static ArrayList<productclass> productclass = new ArrayList<>();
    private static ArrayList<userclass> userclass = new ArrayList<>();

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

    public static void dummyadduser() {
        userclass.add(new userclass("John Doe", "user1@gmail.com", "password123", "What is your pet's name?", "Fluffy"));
        userclass.add(new userclass("Jane Smith", "user2@gmail.com", "securePass456", "What is your favorite color?", "Blue"));
        userclass.add(new userclass("Robert Brown", "user3@gmail.com", "pass789", "What is your mother's maiden name?", "Smith"));
        userclass.add(new userclass("Emily White", "user4@gmail.com", "mySecret321", "What was your first car?", "Honda"));
        userclass.add(new userclass("Michael Green", "user5@gmail.com", "superPassword", "What is your favorite food?", "Pizza"));
        userclass.add(new userclass("Olivia Black", "user6@gmail.com", "topSecret007", "What is the name of your first pet?", "Buddy"));
        userclass.add(new userclass("William Blue", "user7@gmail.com", "hiddenPass987", "What city were you born in?", "New York"));
        userclass.add(new userclass("Sophia Yellow", "user8@gmail.com", "unlockMe246", "What was the name of your first school?", "Sunrise Academy"));
    }

    public static ArrayList<productclass> printall() {
        return productclass;
    }

    public static ArrayList<userclass> printalluser() {
        return userclass;
    }

    public static void addproduct(productclass p) {
        if (p != null) {
            productclass.add(p);
            JOptionPane.showMessageDialog(null, "Product Added successfully:)");
        } else {
            JOptionPane.showMessageDialog(null, "Object is Null");
        }

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

    public static boolean serachstock(String name, int stock) {
        for (int i = 0; i < productclass.size(); i++) {
            if (productclass.get(i).getProductName().equalsIgnoreCase(name)
                    && stock <= productclass.get(i).getProductStock()) {
                return true;
            }
        }
        return false;
    }

    public static int returnid(String name, int stock) {
        for (int i = 0; i < productclass.size(); i++) {
            if (productclass.get(i).getProductName().equalsIgnoreCase(name)
                    && stock <= productclass.get(i).getProductStock()) {
                return productclass.get(i).getProductId();
            }
        }
        return -1;
    }

    public static void updateStock(int id, int newQuantity) {
        for (int i = 0; i < productclass.size(); i++) {
            if (id == productclass.get(i).getProductId()) {
                int oldQuantity = productclass.get(i).getProductStock();
                int finalQuantity = oldQuantity - newQuantity;
                productclass.get(i).setProductStock(finalQuantity);
            }

        }

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

    public static userclass serachUserByemail(String id) {

        for (int i = 0; i < userclass.size(); i++) {
            if (userclass.get(i).getUserEmail().equals(id)) {
                return userclass.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "User Not Found");
        return null;
    }

    public static void Updateuserfortabel(String email, String name, String question, String password, String answer) {
        for (int i = 0; i < userclass.size(); i++) {
            if (userclass.get(i).getUserEmail().equals(email)) {
                userclass.get(i).setUserName(name);
                userclass.get(i).setUserQuestion(question);
                userclass.get(i).setUserPassword(password);
                userclass.get(i).setUserAnswer(answer);
            }
        }

    }

    public static int returnprice(int id) {
        for (int i = 0; i < productclass.size(); i++) {
            if (id == productclass.get(i).getProductId()) {
                return (int) productclass.get(i).getProductRetailPrice();
            }
        }
        return -1;
    }

    public static String returnCatagory(int id) {
        for (int i = 0; i < productclass.size(); i++) {
            if (id == productclass.get(i).getProductId()) {
                return productclass.get(i).getProductCatagory();
            }
        }
        return null;
    }

    public static boolean serachstockbyid(int id, int stock) {
        for (int i = 0; i < productclass.size(); i++) {
            if (productclass.get(i).getProductId() == id
                    && stock <= productclass.get(i).getProductStock()) {
                return true;
            }
        }
        return false;
    }

    public static String returnproductname(int id) {
        for (int i = 0; i < productclass.size(); i++) {
            if (productclass.get(i).getProductId() == id) {
                return productclass.get(i).getProductName();
            }
        }
        return null;
    }

    public static void delete(productclass obj) {
        productclass.remove(obj);
        store.showerrormessage("Delete SuccessFully!");
    }

   

    // ----- For users:
    public static boolean adduser(userclass user) {
        if (user != null) {
            userclass.add(user);
            return true;
        }
        return false;
    }

    public static int searchuser(String email, String pass) {
        for (int i = 0; i < userclass.size(); i++) {
            if (email.equals(userclass.get(i).getUserEmail()) && pass.equals(userclass.get(i).getUserPassword())) {
                return 1; //means found;
            } else if (!email.equals(userclass.get(i).getUserEmail()) && pass.equals(userclass.get(i).getUserPassword())) {
                return 2; // Means only found password
            } else if (email.equals(userclass.get(i).getUserEmail()) && !pass.equals(userclass.get(i).getUserPassword())) {
                return 3; // Means only found email
            }
        }
        return -1;
    }

    public static boolean checkuseremail(String email) {
        for (int i = 0; i < userclass.size(); i++) {
            if (email.equals(userclass.get(i).getUserEmail())) {
                return true; //means found;
            }
        }
        return false;
    }

    public static String forgetpassworduser(String email, String question, String answer) {

        for (int i = 0; i < userclass.size(); i++) {
            if ((email.equals(userclass.get(i).getUserEmail()))
                    && (question.equals(userclass.get(i).getUserQuestion()))
                    && (answer.equals(userclass.get(i).getUserAnswer()))) {
                System.out.println(userclass.get(i).getUserPassword());
                return userclass.get(i).getUserPassword(); //means found // return pssword, 
            }
        }
        return "Not correct user";
    }
    
     public static void updateUser(String email, userclass obj) {
        for (int i = 0; i < userclass.size(); i++) {
            if (userclass.get(i).getUserEmail().equals(email)) {
                userclass.get(i).setUserName(obj.getUserName());
                userclass.get(i).setUserQuestion(obj.getUserQuestion());
                userclass.get(i).setUserPassword(obj.getUserPassword());
                userclass.get(i).setUserAnswer(obj.getUserAnswer());
                store.showerrormessage("User Updated");
            }
        }
    }
    
     public static void deleteuser(userclass obj) {
        userclass.remove(obj);
        store.showerrormessage("Delete SuccessFully!");
    }
    
    
    
    
    
}
