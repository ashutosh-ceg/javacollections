package treeSet;

import java.util.TreeSet;

public class TreeSet4 {
    public static void main(String[] args) {
        // NavigableSet operations.

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1111);
        treeSet.add(6444);
        treeSet.add(1365);
        treeSet.add(1222);
        System.out.println("Intial set " + treeSet);
        System.out.println("Reverse Set " + treeSet.descendingSet());
        System.out.println(treeSet.headSet(1365, true));
        System.out.println(treeSet.tailSet(1222, true));
        System.out.println(treeSet.subSet(1111, false, 6444, true));

    }
}
