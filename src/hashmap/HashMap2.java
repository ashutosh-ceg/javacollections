package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        // No duplicate key 
        // HashMap does not allow insertion of duplicate key, if we will insert duplicate key value it will 
        //replace previous with it.
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1, "ashu");
        hm.put(2, "vijay");
        hm.put(3, "bhanu");
        hm.put(1, "ashutosh");
        System.out.println("Map result after inserting duplicate ");
        for(Map.Entry entry:hm.entrySet())
        System.out.println(entry.getKey()+" "+entry.getValue());

    }
}
