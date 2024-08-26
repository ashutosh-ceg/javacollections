package LinkedList;

import java.util.LinkedList;

public class LinkedListRemoveMethods {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("abc");
        ll.add("def");
        ll.add("ghi");

        ll.remove(); // It remove first element of linkedlist
        System.out.println("After callig remove method " + ll);

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("jkl");
        ll2.add("mno");
        ll2.add("pqr");
        ll.addAll(ll2);
        System.out.println("After adding ll2 into first list "+ll);
        ll.remove(0);
        System.out.println("After removing 0th element of list " + ll);
        ll.remove("ghi");
        System.out.println("After deleting \"ghi\" calling "+ll);
        ll.addAll(ll2);
        System.out.println(ll);
        ll.removeAll(ll2);
        ll.add("abc");
        ll.add("def");
        ll.add("ghi");
        System.out.println("After removing ll2 element from ll1 "+ll);
        System.out.println(ll2);
        ll.addAll(ll2);
        System.out.println("After adding ll2 "+ll);
        ll.removeFirst();
        System.out.println("After calling removeFiirst()" + ll);
        ll.removeLast();
        System.out.println("After calling removeLast() "+ll);
        ll.add("abc");
        ll.add("pgp");
        ll.addLast("abc");
        ll.addFirst("ashu");
        ll.add("ashu");
        System.out.println("After adding few elements "+ll);
        ll.removeFirstOccurrence("ashu");
        System.out.println(ll);
        ll.removeLastOccurrence("abc");
        System.out.println(ll);

    }
}
