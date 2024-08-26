package hashmap;

import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Amit");
        hm.put(2, "Vijay");
        hm.put(3, "Rahul");
        hm.put(4, "Gaurav");
        System.out.println("Initial list of element " + hm);
        hm.remove(2); // Key based removal
        System.out.println("Updated map element after removing 2nd element " + hm);
        hm.remove(3);
        System.out.println("Updated list after removing 3rd element "+hm);
        hm.put(2, "Surya");
        System.out.println("After inserting 2nd element "+hm);
        hm.remove(1, "Amit");
        System.out.println("After removing 1st element as key value pair "+hm);


    }
}
