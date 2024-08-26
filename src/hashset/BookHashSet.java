package hashset;
import java.util.*;
public class BookHashSet {
    public static void main(String[] args) {
        HashSet<Book> set= new HashSet<Book>();
        Book b1= new Book(1, "java", "abc", 400);
        Book b2= new Book(2, "dsa", "ashutosh", 500);
        Book b3= new Book(3, "mysql", "akt", 200);
        set.add(b1);
        set.add(b2);
        set.add(b3);

        // Getting hashset element element 
        System.out.println("Book in HashSet ");
        for (Book book : set) {
            System.out.println(book.id+" "+book.name+" "+book.author+" "+book.price);
        }
    }
}
