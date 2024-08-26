package LinkedList.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class GetAndSetElement {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<String>();
        aList.add("second");
        aList.add("third");
        aList.add("fourth");
        System.out.println("List element "+aList);
        aList.add(0,"First");
        System.out.println("After adding element at first position into list "+aList);
        // Getting elment from first position
        System.out.println(aList.get(0));
        // Setting elment at o postion
        aList.set(0, "1");
        System.out.println("After setting element at 0 position "+aList);
        for (String string : aList) {
            System.out.println(string);
        }
    }
}
