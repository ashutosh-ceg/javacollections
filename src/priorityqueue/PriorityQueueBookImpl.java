package priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueBookImpl {
    public static void main(String[] args) {
        PriorityQueue<Book> pq = new PriorityQueue<Book>();
        Book b1 = new Book(1, "Java", "James", 10);
        Book b2 = new Book(2, "DSA", "Ashutosh", 20);
        Book b3 = new Book(3, "MySQL", "Ankur", 11);
        pq.add(b1);
        pq.add(b2);
        pq.add(b3);
        System.out.println("Traversing the queue element ");
        for (Book b : pq)
            System.out.println(b.id + " " + " " + b.name + " " + b.author + " " + b.quantity);

        pq.remove();
        System.out.println("After removing one book record");
        for (Book b : pq)
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
    }
}
