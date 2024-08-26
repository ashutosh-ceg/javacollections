package LinkedList.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        System.out.println("Size of list before adding element "+l.size());
        l.add("abc");
        l.add("def");
        l.add("ghi");
        System.out.println("List element after adding the data "+l);
        
    }
}
