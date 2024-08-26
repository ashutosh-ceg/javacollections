package LinkedList.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingProgram {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("def");
        list.add("ghi");
        list.add("abc");
        System.out.println("List element ");
        for (String e : list) {
            System.out.println(e);
        }
        // Sorting list element
        Collections.sort(list);
        System.out.println("List element after sorting ");
        for (String e : list) {
            System.out.println(e);
        }
    }
}
