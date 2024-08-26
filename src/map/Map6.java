package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map6 {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101, "Vijay");
        map.put(102,"Rahul");

        System.out.println("Map comparinByValue in descending order");

        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out::println);
    }
}
