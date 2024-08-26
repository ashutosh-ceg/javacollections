package map;

import java.util.HashMap;
import java.util.Map;

public class Map5 {
    public static void main(String[] args) {
        // Map comparingByValue
        Map<Integer,String> map= new HashMap<Integer,String>();
        map.put(101,"Amit");
        map.put(102, "Vijay");
        map.put(103, "Rahul");

        System.out.println("Map comparingByValue");
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .forEach(System.out::println);

    }
}
