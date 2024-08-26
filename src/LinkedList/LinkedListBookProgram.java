package LinkedList;

import java.util.LinkedList;

public class LinkedListBookProgram {
    public static void main(String[] args) {
        LinkedList<Book> ll = new LinkedList<Book>();

        Book b1 = new Book(1, "Java", 400);
        Book b2 = new Book(2, "DSA", 500);
        Book b3 = new Book(3, "MySQL", 300);

        ll.add(b1);
        ll.add(b2);
        ll.add(b3);

        System.out.println("Retriving the BookLinkedList element ");
        for (Book b : ll)
            System.out.println(b.id + " " + b.name + " " + b.price);
    }
}
