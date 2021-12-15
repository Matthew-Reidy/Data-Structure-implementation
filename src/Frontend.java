
public class Frontend extends input {
input input = new input();
private String Productname = input.ProductName;
private int selection = input.menuSelect;

    public Frontend(int selection, String Productname){   //constructor for menu option and key value pair
       this.selection=  selection;                        //constructor instantiates our private variables
       this.Productname = Productname;
    }

    public void setSelection(int selection) { //set new attribute to "selection" if nescessary
        this.selection = selection;
    }
    public void setProductname(String Productname){ //set new attribute to "Productname" if nescessary
        this.Productname = Productname;
    }

    public void Menu(){

        switch (this.selection){
            case 1: //add
            System.out.println("enter the product you want to add to queue");
            dbconn.getItem(dbconn.conn, this.Productname);
            case 2: //remove
            dbconn.updateColumn(dbconn.conn);
            case 3:// Admin console
            System.out.println("Entering console sign in...");
            case 4:// End application
            System.out.println("Exiting application...");
            System.exit(0);
        }
    }

}
