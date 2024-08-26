package map;

import java.util.HashMap;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {
        // Java Map comparingByKey example

        Map<Integer,String> map= new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        System.out.println("Map comparingByKey example");
        // return a set view of mapppings contained in map
        map.entrySet()
        
        .stream()
        //Sorting according to provided comparator 
        .sorted(Map.Entry.comparingByKey())
        .forEach(System.out::println);
    }
}
