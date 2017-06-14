import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by root on 14/6/17.
 */
class ArrayListSorted{
    public static void main(String args[]){
        ArrayList<Student> al1 = new ArrayList<>();
        al1.add(new Student(11,"ramesh",22));
        al1.add(new Student(9,"sathosh",24));
        al1.add(new Student(15,"vinod",19));

        Collections.sort(al1);

        for (Student str : al1) {
            System.out.println(str);
        }
    }
}
