
import java.sql.*;
public class dbconn {
    private final String username = "username";
    private final String password = "root5606!@65xzt";
    private final String url = "jdbc:mysql://127.0.0.1:3306/store";
    Connection conn = null;
    Cart cart = new Cart();

    public Connection dbconnection() {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);


        }
        catch (Exception e){
            System.out.println("something happened!- DB did not connect!");
            e.printStackTrace();
        }
        return conn;
    }

    public void getItem(String Productname) { //select item and put in cart
        dbconnection(); //starts DB connection
        String Query = "select productName, price from stock where productName = ?";

        try{

             PreparedStatement stmt = conn.prepareStatement(Query);
             stmt.setString(1, Productname);
             ResultSet res = stmt.executeQuery();
            while(res.next()){
                String product = res.getString("ProductName");
                double price = res.getDouble("price");
                productObj currentproduct = new productObj();
                currentproduct.setPrice(  price);
                currentproduct.setProduct( product);
                cart.addToMap(currentproduct);
            }

        }catch(SQLException error) {
            System.out.println("there was a problem in getItem function");
            error.printStackTrace();
        }

    }

    public void updateRecord(){
        String updateQuery= "alter ";

        try(Statement update = conn.createStatement()){
             ResultSet UpdateRes = update.executeQuery(updateQuery);
             if(UpdateRes.rowUpdated()){
                 System.out.println("Your changes have been made!");
             }
        }catch(Exception error) {
            System.out.println("there was a problem in updateRecord function");
            error.printStackTrace();
        }

    }



}