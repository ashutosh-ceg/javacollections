package LinkedList.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] arr= {"abc","def","ghi"};
        System.out.println("Array Element "+Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
        // Converting array to list
        List<String> l=new ArrayList<String>();
        for (String str : arr) {
            l.add(str);
        }

        System.out.println("List after converting array to list "+l);

    }
}
