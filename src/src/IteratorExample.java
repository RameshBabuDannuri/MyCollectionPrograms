import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by root on 13/6/17.
 */
public class IteratorExample {
   public static  void  main(String args[]){
       ArrayList<String> a = new ArrayList<String>();
       Scanner sc = new Scanner(System.in);
       String str = null;

       for (int i= 0;i<=9;i++){
           System.out.println("enter a string");
           str = sc.nextLine();
           a.add(str);
       }
       Iterator itr = a.iterator();
       while (itr.hasNext()){
           String i = (String)itr.next();
           System.out.println(i+" ");
           if (i!=null){
             itr.remove();
           }

       }
       System.out.println();
       System.out.println(a);
   }
}
