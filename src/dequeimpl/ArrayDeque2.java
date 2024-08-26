package dequeimpl;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque2 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.offer("J");
        deque.offer("C");
        deque.add("A");
        deque.offerFirst("L");
        System.out.println("Deque list after offerFirst");
        for (String str : deque) {
            System.out.println(str);
        }
        System.out.println("pollLast value "+ deque.pollLast());
        System.out.println("After polllast");
        for (String str1 : deque) {
            System.out.println(str1);
        }
    }
}
