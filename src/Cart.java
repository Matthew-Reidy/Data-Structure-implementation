//schema: take resuts from getItem function put it in a "shopping cart" hashmap then visualize this in a gui (later)
import java.util.HashMap;


public class Cart  {

    private HashMap<String, Double> shoppingCart= new HashMap();


   public void addToMap(productObj currentproduct){

       shoppingCart.put(currentproduct.getProduct(), currentproduct.getPrice());
       printProductsandTotal();
   }
   public void deleteFromMap(){

   }

    public void printProductsandTotal(){

        for(double i: shoppingCart.values()){ //double for loops are temporary
            for(String j: shoppingCart.keySet()){
                System.out.println( "  " + j + " ---- " + i);
            }
        }
        System.out.println("+=====================+");
        System.out.println("  Your total is " + cartTotal() );

    }

    public double cartTotal(){ //O(n) where n is # of values in the map
        double total = 0.0;
        for(double i : shoppingCart.values()){
            total += i;
        }
        return total;
    }

}
