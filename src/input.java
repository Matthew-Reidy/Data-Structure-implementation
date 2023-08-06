import java.util.Scanner;

public class input {

public int menuSelect;
public String ProductName;

  public void userInput( ){

     System.out.println("Action Menu:");
     System.out.println("1. Get Item\n2. Remove Item\n3. Enter admin console\n4. Terminate program");

     Scanner inSc = new Scanner(System.in);
     System.out.println("enter your menu selection:");
     menuSelect = inSc.nextInt();
     System.out.println("enter product");
     ProductName = inSc.next();

     Frontend inputs = new Frontend(menuSelect, ProductName);
     inputs.Menu();


    }

}
