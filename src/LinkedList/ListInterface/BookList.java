package LinkedList.ListInterface;
import java.util.*;
public class BookList {
    public static void main(String[] args) {
        List<Book> bookList= new ArrayList<Book>();
        Book b1= new Book(1, "DSA", "Ashutosh", 700);
        Book b2= new Book(2, "Java", "Amit", 300);
        Book b3= new Book(3, "Spring Boot", "Alok Kumar", 250);

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        // Traversing book list
        System.out.println("All Book Details");

        for (Book book : bookList) {
            System.out.println(book.id + " "+book.name+" "+book.price+" "+book.author);
        }

    }
}
