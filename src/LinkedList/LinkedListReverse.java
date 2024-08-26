package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<String>();
        ll.add("abc");
        ll.add("def");
        ll.add("ghi");
        ll.add("jkl");
        System.out.println("LinkedList element "+ll);

        // Reverse LinkedList element
        System.out.println("Printing elemnt in descending order");

        Iterator<String> itr=ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
