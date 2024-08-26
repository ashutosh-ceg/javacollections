package LinkedList;

import java.util.LinkedList;

public class LinkedListAddMethods {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Intial list " + ll);
        ll.add("abc");
        ll.add("def");
        ll.add("ghi");
        System.out.println("After adding few elements " + ll);
        ll.add(1, "ashutosh");

        System.out.println("After adding one element at 1 position " + ll);
        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("jkl");
        ll2.add("mno");
        ll2.add("pqr");
        ll.addAll(ll2);
        System.out.println("After adding ll2 elements into first LinkedList " + ll);

        LinkedList<String> ll3 = new LinkedList<String>();
        ll3.add("stu");
        ll3.add("vwx");
        ll3.add("yz");

        ll.addAll(1, ll3);
        System.out.println("After adding ll3 at the 1 position of first list " + ll);

        ll.addFirst("first");
        System.out.println("After adding first value at first "+ll);
        ll.addLast("last");
        System.out.println("After adding last element at last postion " + ll);

    }
}
