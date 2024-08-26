package treeSet;

import java.util.TreeSet;

public class TreeSet5 {
    public static void main(String[] args) {
        // Sorted Set Operations 

        TreeSet<String> ts=new TreeSet<String>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");

        System.out.println("Intirial set "+ts);
        System.out.println("Head Set "+ts.headSet("D"));
        System.out.println("Sub Set "+ts.subSet("A", "D"));
        System.out.println("Tail Set "+ts.tailSet("C"));
    }
}
