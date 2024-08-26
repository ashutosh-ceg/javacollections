package ArrayList;
import java.util.*;;
public class ArrayListAddMethods {
    public static void main(String[] args) {
        ArrayList<String> al1= new ArrayList<String>();
        al1.add("abc");
        al1.add("def");
        al1.add("ghi");

        System.out.println("Before adding elements ");
        System.out.println(al1);

        System.out.println("After adding new element ");
        al1.add(1,"ashuutosh");
        System.out.println(al1);

        ArrayList<String> al2= new ArrayList<String>();
        al2.add("jkl");
        al2.add("mno");
        al2.add("pqr");

        al1.addAll(al2);
        System.out.println("After adding " + al1);

        ArrayList<String> al3= new ArrayList<String>();
        al3.add("amit");
        al3.add("sumit");
        al3.add("suman");

        System.out.println("After adding array list 3 into arraylist 1");

        al1.addAll(1, al3);
        System.out.println(al1);
    }
}
