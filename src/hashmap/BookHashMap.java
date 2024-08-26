package hashmap;
import java.util.HashMap;
import java.util.Map;
public class BookHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Book> bhm= new HashMap<Integer,Book>();
        Book b1= new Book(1, "DSA", "Narsimha", "Carrermonk", 8);
        Book b2= new Book(2, "Java", "Gosling", "", 10);
        Book b3= new Book(3, "MySQL", "Khanna Nehemiah", "MCGrw Hills", 100);
        bhm.put(1, b1);
        bhm.put(2, b2);
        bhm.put(3, b3);

        // Traversing map

        for(Map.Entry<Integer,Book> m:bhm.entrySet()){
            int key=m.getKey();
            Book b=m.getValue();
            System.out.println("Key "+key);
            System.out.println(b.id+" "+b.author+" "+b.name+" "+b.pulisher+" "+b.quantity);

        }

    }
}
