package dequeimpl;
import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        // Deque is implemented by ArrayDeque only
        Deque<String> dq= new ArrayDeque<String>();
        dq.add("Ashu");
        dq.add("ram");
        dq.add("Surya");
        dq.add("hanu");
        dq.add("purusotam");

        Iterator<String> itr=dq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
