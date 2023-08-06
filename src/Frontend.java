
public class Frontend extends input {

public String Productname;
public int selection;
    dbconn dbconn = new dbconn();

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
            dbconn.getItem(this.Productname);

            case 2: //remove from cart
            //dbconn.updateRecord();
            case 3:// Admin console- goes to add items to the table or to remove products from the table
            System.out.println("Entering console sign in...");
            case 4:// End application
            System.out.println("Exiting application...");
            System.exit(0);



        }
    }

}
