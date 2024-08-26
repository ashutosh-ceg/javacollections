import java.util.*;

public class LinkListTraversal {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc");
        al.add("def");
        al.add("ghi");

        // Traversing using Iterator
        System.out.println("Travering using iteraotor");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Traversing using for loop

        System.out.println("Traversing using for loop");
        for (int i = 0; i < al.size(); i++)
            System.out.println(al.get(i));

        // Traversing using for for each loop

        System.out.println("Traversing using for for each loop");

        for (String str : al)
            System.out.println(str);

        // Traversing using foreach method

        System.out.println("Traversing using for for each method");

        al.forEach(e -> {
            System.out.println(e);
        });

        // Traversing using for foreachremaining method
        System.out.println("Traversing using for foreachremaining method");

        Iterator<String> itr1 = al.iterator();
        itr1.forEachRemaining(e -> {
            System.out.println(e);
        });

    }
}
