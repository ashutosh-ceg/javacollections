package dequeimpl;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBookImpl {
    public static void main(String[] args) {
        Deque<Book> bookdq= new ArrayDeque<Book>();
        Book b1= new Book(1, "Java", "Ashutosh", "Orileey", 10);
        Book b2= new Book(2, "DSA", "Amit", "TMH", 21);
        Book b3= new Book(3, "MySQL", "Rama", "BPB", 2);

        bookdq.add(b1);
        bookdq.add(b2);
        bookdq.add(b3);

        // Traversing or fetching data from Book deque

        System.out.println(bookdq.getFirst().author);

        for (Book book : bookdq) {
            System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publishers+" "+book.publishers+" "+book.publishers);
        }



    }
}
