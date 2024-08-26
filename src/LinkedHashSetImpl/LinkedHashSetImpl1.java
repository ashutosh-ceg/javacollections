package LinkedHashSetImpl;

import java.util.*;

public class LinkedHashSetImpl1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("abc");
        lhs.add("def");
        lhs.add("ghi");
        System.out.println("LinkedHashSet elements " + lhs);
        lhs.add("abc"); // It will ignore duplicate element
        System.out.println("After inserting duplicate elements " + lhs);

        LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
        lhs1.add("jkl");
        lhs1.add("mno");
        lhs1.add("pqr");
        System.out.println("LinkedHashSet1 elements " + lhs1);

        lhs.addAll(lhs1);
        System.out.println("AAfter adding lhs1 elements to lhs" + lhs);
        lhs.add("stu");
        System.out.println("After adding stu element into linkedHashSet lhs" + lhs);
        lhs.remove("stu");
        System.out.println("After removing stu elements " + lhs);
        lhs.removeIf(s -> s.contains("abc"));
        System.out.println("after deleting abc using removeif method" + lhs);
        lhs.removeAll(lhs1);
        System.out.println("After Removing lhs1 elements from lhs " + lhs);
        lhs.clear();
        System.out.println("After removing all elements from lhs " + lhs);
    }
}
