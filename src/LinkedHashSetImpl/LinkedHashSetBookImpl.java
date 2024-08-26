package LinkedHashSetImpl;

import java.util.*;

public class LinkedHashSetBookImpl {
    public static void main(String[] args) {
        LinkedHashSet<Book> lhs= new LinkedHashSet<Book>();
        Book b1= new Book(1, "DSA", "ashutosh", 500);
        Book b2= new Book(2, "Java", "amit", 400);
        Book b3= new Book(3, "MySQL", "ajit", 300);
        lhs.add(b1);
        lhs.add(b2);
        lhs.add(b3);
        // Getting Book elements from LinkedHashSet

        for (Book book : lhs) {
            System.out.println(book.id+" "+book.name+" "+book.author+" "+book.price);
        }
    }
}
