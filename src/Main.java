
public class Main {

    public static void main(String[] args)  {
       dbconn.dbconnection(dbconn.url, dbconn.username, dbconn.password, dbconn.conn); //starts DB connection
       input obj = new input();
       obj.userInput();
    }
}
