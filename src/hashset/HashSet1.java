package hashset;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("abc");
        set1.add("def");
        set1.add("ghi");
        // Getting value from Hashset
        System.out.println("Printing the element of HashSet");
        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
