package hashset;

import java.util.*;

public class HashSetAddMethods {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("abc");
        set1.add("def");
        set1.add("ghi");
        // Adding duplicate element,it will not thow error but it will not add it into the hashset
        set1.add("abc");
        System.out.println("Set1 elements " + set1);
        set1.remove("ghi");
        System.out.println("Set1 after removing ghi "+set1);
        HashSet<String> set2 = new HashSet<String>();
        set2.add("jkl");
        set2.add("mno");
        set2.add("pqr");
        System.out.println("Set2 elements " + set2);

        set1.addAll(set2);
        System.out.println("After Adding set2 elements into set1 " + set1);
        set1.add("stu");
        System.out.println("After adding element stu into set1"+set1);
        set1.removeIf(str->str.equals("pqr"));
        System.out.println("After removing pqr from the set "+set1);
        set1.removeAll(set2);
        System.out.println("After removing all element of s2 "+set1);
        set1.clear();
        System.out.println("After removing all the elemnts of set1 "+set1);

    }
}
