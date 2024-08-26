package LinkedList.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorProgram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        System.out.println("Getting List element usi listiterator");

        ListIterator<String> litr = list.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.nextIndex()+ " "+litr.next());
        }

        // Getting list element in descending order
        System.out.println("List element in descending order");
        while (litr.hasPrevious()) {
            System.out.println(litr.previousIndex()+ " "+litr.previous());
        }

    }
}
