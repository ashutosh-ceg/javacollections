package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("ashutosm");
        ll.add("shiva");
        ll.add("ram");

        System.out.println("Printing elemnets of linkedlist ");
        Iterator<String> itr=ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
         
    }
}
