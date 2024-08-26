package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<String>();
        pq.add("A");
        pq.add("V");
        pq.add("K");
        pq.add("J");
        pq.add("R");
        System.out.println("Head "+pq.element());
        System.out.println("Head "+pq.peek());
        System.out.println("Iterating queue element ");
        Iterator<String> itr=pq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        pq.remove();
        pq.poll();
        System.out.println("After removing two elements");
        Iterator<String> itr1= pq.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}
