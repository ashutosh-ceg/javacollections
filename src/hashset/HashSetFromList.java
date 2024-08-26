package hashset;

import java.util.*;

public class HashSetFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        System.out.println("List elements " + list);
        // Creating HashSet from List
        HashSet<String> set = new HashSet<String>(list);
        // traversing HashSet element
        System.out.println("HashSet element after creating from list" + set);
        for (String string : set) {
            System.out.println(string);
        }

    }
}
