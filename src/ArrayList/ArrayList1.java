package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;



public class ArrayList1 {

    public static void main(String[] args) {
        // System.out.println("Ram ram");
        Student s1=new Student(1, "Ashutosh", 26);
        Student s2=new Student(2, "Amit", 25);
        Student s3=new Student(3, "Ankur", 29);

        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator itr=al.iterator();
        while (itr.hasNext()) {
            Student students=(Student)itr.next();
            System.out.println(students.name + " "+students.age + " "+students.rollno);
        }
        

    }
}