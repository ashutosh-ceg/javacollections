package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "amit");
        hm.put(2, "ashutosh");
        hm.put(3, "shashank");
        hm.put(4, "diwakar");

        // Traversing
        for (Map.Entry entry : hm.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

    }
}
