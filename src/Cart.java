//schema: take resuts from getItem function put it in a "shopping cart" then visualize this in a gui (later)
import java.util.HashMap;
import java.util.Iterator;

public class Cart implements dbconn {

HashMap<String, Double> shoppingCart= new HashMap<>();
Iterator iterator = shoppingCart.entrySet().iterator();

    public int cartTotal(HashMap<String, Double> shoppingCart){ //O(n) where n is # of values in the map
    int total =0;
    for(double i : shoppingCart.values()){
         total += shoppingCart.get(i);
     }
    return total;
    }

    public void cartContents(HashMap<String, Double> shoppingCart, Iterator iterator){ //O(?)

        while(iterator.hasNext()){
            System.out.println("cart contains" + iterator);
        }
    }
    public void addToMap(HashMap<String, Double> shoppingCart){

    }
}
