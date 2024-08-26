package LinkedList.ListInterface;

import java.util.*;

public class ListToArrayProgram {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        // Converting list to array
        String[] arr=list.toArray(new String[list.size()]);
        System.out.println("Array after converting list to array " +Arrays.toString(arr));

        for (String string : arr) {
            System.out.println(string);
        }

    }
}
