import java.util.HashMap;

public class Backend {
    HashMap<String, Integer> Stock = new HashMap<>();

    public void Add (HashMap<String, Integer> Stock, String key, int val )
    {
      if( Stock.containsKey(key)){
          System.out.println("This item already exists");
          ModifyItem(Stock, key);
      }else {
          Stock.put(key, val);
      }
    }
    public void ModifyItem(HashMap<String, Integer> Stock, String key )
    {

    }
    public void Remove(HashMap<String, Integer> Stock)
    {

    }
    public static int search(HashMap<String, Integer> Stock, String key )
    {

        if(!Stock.containsKey(key)){

        }else{

        }

        return 0;
    }

}
