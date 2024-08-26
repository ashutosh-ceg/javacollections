package ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerDeser {
    public static void main(String[] args) {
        ArrayList<String> aList= new ArrayList<String>();
        aList.add("Ashutosh");
        aList.add("Amit");
        aList.add("Sudhanshu");

        System.out.println("Input Output Stream with ArrayList");
        try { 
            // Serialization

            
            FileOutputStream fos= new FileOutputStream("file");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(aList);
            fos.close();
            oos.close();

            //  Deserialization

            FileInputStream fis= new FileInputStream("file");
            ObjectInputStream ois= new ObjectInputStream(fis);
            ArrayList list=(ArrayList)ois.readObject();
            System.out.println(list);

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
