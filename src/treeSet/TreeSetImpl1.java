package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("java");
        treeSet.add("dsa");
        treeSet.add("mysql");

        Iterator<String> itr = treeSet.iterator();
        System.out.println("TreeSet elements ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
