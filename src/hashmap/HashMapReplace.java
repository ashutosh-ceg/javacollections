package hashmap;
import java.util.HashMap;
import java.util.Map;;
public class HashMapReplace {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        // Replace example

        hm.put(1, "Amit");
        hm.put(2, "Vijay");
        hm.put(3, "Rahul");

        System.out.println("Initial list of elements");
        for(Map.Entry entry:hm.entrySet())
        System.out.println(entry.getKey()+ " "+entry.getValue());
        hm.replace(2, "Ashutosh");
        System.out.println("Updated list after replacing 2nd element");
        for(Map.Entry entry:hm.entrySet())
        System.out.println(entry.getKey()+ " "+entry.getValue());
        hm.replace(3, "Rahul", "Ravi");
        System.out.println("After updating Rahul with Ravi ");
        for(Map.Entry entry:hm.entrySet())
        System.out.println(entry.getKey()+ " "+entry.getValue());
        hm.replaceAll((k,v)->"Ashutosh");
        System.out.println("After replacing all value with Ashutosh");
        for(Map.Entry entry:hm.entrySet())
        System.out.println(entry.getKey()+" "+entry.getValue());

    }
}
