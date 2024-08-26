package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("java");
        treeSet.add("dsa");
        treeSet.add("mysql");
        treeSet.add("restapi");
        // By default Treeset element is in ascending order
        System.out.println("Treeset list" + treeSet);
        System.out.println("Treeset element in descending order");
        Iterator<String> itr = treeSet.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
