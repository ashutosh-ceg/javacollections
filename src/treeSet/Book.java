package treeSet;

public class Book implements Comparable<Book> {
    int bid;
    String name, author, publisher;
    int quantity;

    public Book(int bid, String name, String author, String publisher, int quantity) {
        this.bid = bid;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book b) {
        if (bid > b.bid)
            return 1;
        else if (bid < b.bid)
            return -1;
        else
            return 0;
    }

}
