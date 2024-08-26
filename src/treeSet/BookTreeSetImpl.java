package treeSet;

import java.util.Set;
import java.util.TreeSet;

public class BookTreeSetImpl {
    public static void main(String[] args) {
        Set<Book> bts = new TreeSet<Book>();
        Book b1 = new Book(1, "Java", "Ashu", "BPB", 8);
        Book b2 = new Book(2, "DSA", "Ashutosh", "Oirely", 12);
        Book b3 = new Book(11, "MySQL", "Dr S Swamynathan", "MCGraw Hills", 5);

        bts.add(b1);
        bts.add(b2);
        bts.add(b3);

        // Traversing set elements
        System.out.println("Getting Book Treeset Elements");

        for (Book b : bts) {
            System.out.println(b.bid + " " + b.name + " " + b.author+" " +" "+ b.publisher +" "+ b.quantity);
        }
    }
}
