package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        // java Treeset element to retrieve and remove element

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(100);
        treeSet.add(20);
        treeSet.add(50);
        System.out.println("Treeset element" + treeSet);

        Iterator<Integer> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Retriving and removing first element from treeset

        System.out.println(treeSet.pollFirst());

        // Retriving and removing last element of treeSet

        System.out.println(treeSet.pollLast());

        System.out.println("Treeset element after pollFirst() and pollLast() method " +treeSet);

    }
}
