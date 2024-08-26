package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapAdd {
    public static void main(String[] args) {
        // different ways to insert elements.

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "anhul");
        hm.put(2, "kaner");
        hm.put(3, "genda");
        hm.put(4, "gulab");
        // traversing
        for (Map.Entry entry : hm.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        System.out.println("After using putIfAbsent");
        hm.putIfAbsent(5, "Ratrani");
        System.out.println(hm);
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(6, "madar");
        hashMap.putAll(hm);
        System.out.println("After using putAll method");
        // Traversing
        for (Map.Entry entry : hashMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
