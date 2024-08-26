package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        
        // Creating map using old style
        
        Map map =new HashMap();
        map.put(100, "Amit");
        map.put(101,"Vijay" );
        map.put(102,"Rahul");

        Set set=map.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()) {
            //Map.Entry map1=(Map.Entry).iterator.next();

        }
         
    }
}
