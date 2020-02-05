package MiniProject;
import java.util.Scanner;

public class AListDriver {

    public static void main(String[] args) {
        
    		Scanner userinput = new Scanner (System.in);
    		System.out.println("Welcome to the market stocking program!");
    		
    		System.out.println("How many item(s) do you want to enter? ");
    		int i = userinput.nextInt();
    		
    		
  
        // create a list
        AList<String> list = new AList<String>(i);
        AList<Integer> listquanity = new AList<Integer>();
        
        
        // append three elements
        for (int x=1; x<=i ; x++) {
			System.out.println("what is the #" + x + " item? ");
			String y = userinput.next();
			list.append(y);
		}
        
        list.show();
        System.out.println();
        
        for (int x=1; x<=i ; x++) {
			System.out.println("what is the quantity of the #" + x + " item? ");
			int y = userinput.nextInt();
			listquanity.append(y);
		}
        
        listquanity.show();
        System.out.println();
        
        
   		String answer = "";
       do{

           System.out.println("Do you want to remove any of the items? ");
           answer = userinput.next();
    	   		if (answer.equals("yes")) {
    	   			System.out.println("What is the position of the item you want to remove? ");
    	   			int number = userinput.nextInt();
    	   			list.moveToPos(number - 1);
    	   			listquanity.moveToPos(number - 1 );
    	   			
    	   			list.remove();
    	   			listquanity.remove();
    	   			list.showAll();
    	   			listquanity.showAll();
    	   			
    	   		} else 
    	   		{
    	   			System.out.println("You did not want to remove anything! ");
    	   		}
    	   		
       } while (answer.equals("yes"));
       
       //Do the search method here after remove//
       System.out.println("What item do you want to search?");
       String k = userinput.next();
       System.out.println(k +" exist?: " + list.find(k));
       
    }
}
