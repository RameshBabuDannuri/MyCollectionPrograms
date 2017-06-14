import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by root on 13/6/17.
 */
public class Student implements  Comparable<Student>{
    private String name;
    private int age;
    private int rollno;
    public  Student(int rollno, String name ,int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;

    }
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
    void  setName(String name){
        this.name = name;
    }
    String getName(){
        return  name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return  age;
    }
    void setRollno(int rollno){
        this.rollno = rollno;
    }
    int getRollno(){
        return rollno;
    }

   public String toString(){
        return "[rollno="+rollno + ", name = " +name + ", age =" +age +"]";
   }


}
