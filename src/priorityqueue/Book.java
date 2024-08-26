package priorityqueue;

public class Book implements Comparable<Book> {
    int id;
    String name,author;
    int quantity;
    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    public int compareTo(Book b){
        if (id>b.id) {
            return 1;
        }
        else if (id<b.id) {
            return -1;
        }
        else
        return 0;
    }
}
