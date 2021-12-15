import java.sql.*;
public interface dbconn {
    String username = "root";
    String password = "root5606!@65xzt";
    String url = "jdbc:mysql://127.0.0.1:3306/store";
    Connection conn = null;
    static Connection dbconnection(String url, String username, String password, Connection conn) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("db connected!");
        }
        catch (Exception e){
            System.out.println("something happened!- DB did not connect!");
            e.printStackTrace();
        }

        return conn;
    }
    static void getItem(Connection conn, String Productname) { //select item and put in cart
        String Query = "select productName, price from stock where productName = '"+ Productname +"' "  ;
        try(Statement stmt = conn.createStatement()){
             ResultSet res = stmt.executeQuery(Query);
            while(res.next()){

            }
        }catch(SQLException error){
            System.out.println("there was a problem!");
            error.printStackTrace();
        }
    }
    static void updateColumn(Connection conn){
        String uQuery= "alter ";
        ResultSet UpdateRes;
        try(Statement update = conn.createStatement()){
             UpdateRes = update.executeQuery(uQuery);
             if(UpdateRes.rowUpdated()){
                 System.out.println("Your changes have been made!");
             }
        }catch(Exception error){
            System.out.println("there was a problem!");
            error.printStackTrace();
        }

    }



}