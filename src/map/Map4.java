package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map4 {
    public static void main(String[] args) {
        // Java Map comapringByKey Descending order
        Map<Integer,String> map= new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        System.out.println("Getting element in descending order");
         map.entrySet()
         .stream()
         .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
         .forEach(System.out::println); 
    }
}
