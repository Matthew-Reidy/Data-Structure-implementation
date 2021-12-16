
public class Frontend extends input {

private String Productname;
private int selection;

    public Frontend(int selection, String Productname){   //constructor for menu option and key value pair
       this.selection=  selection;                        //constructor instantiates our private variables
       this.Productname = Productname;
    }

    public void setSelection(int selection) { //set new attribute to "selection" if needed
        this.selection = selection;
    }
    public void setProductname(String Productname){ //set new attribute to "Productname" if needed
        this.Productname = Productname;
    }

    public void Menu(){

        switch (this.selection){
            case 1: //add
            System.out.println("enter the product you want to add to queue");
            dbconn.getItem(dbconn.conn, this.Productname);
            case 2: //remove
            dbconn.updateColumn(dbconn.conn);
            case 3:// Admin console- goes to add items to the table or to remove products from the table
            System.out.println("Entering console sign in...");
            case 4:// End application
            System.out.println("Exiting application...");
            System.exit(0);
        }
    }

}
