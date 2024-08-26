package ArrayList;
import java.util.*;;
public class ArrayListRemoveMedthod {
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

        al1.remove("abc");
        System.out.println("After removing abc");
        System.out.println(al1);

        al1.remove(0);
        System.out.println("After removing 0th element");
        System.out.println(al1);

        ArrayList<String> al2= new ArrayList<String>();
        al2.add("jkl");
        al2.add("mno");
        al2.add("pqr");

        al1.addAll(al2);
        System.out.println("After adding al2 " + al1);

        al1.removeAll(al2);
        System.out.println("After removing al2 "+al1);

        al1.removeIf(str->str.contains("ghi"));

        System.out.println("After removing ajay "+al1);

        al1.clear();

        System.out.println("After calling clear method "+al1);



        // ArrayList<String> al3= new ArrayList<String>();
        // al3.add("amit");
        // al3.add("sumit");
        // al3.add("suman");

        // System.out.println("After adding array list 3 into arraylist 1");

        // al1.addAll(1, al3);
        // System.out.println(al1);
    }
}
