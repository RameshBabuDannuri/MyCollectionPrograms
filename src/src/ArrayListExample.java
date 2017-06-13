import java.util.*;

/**
 * Created by root on 13/6/17.
 */
public class ArrayListExample {
    public static void main(String args[]){
        List l = new ArrayList();
        int y=0;
        Scanner sc = new Scanner(System.in);
        for (int i= 0;i<4;i++){
           int x = sc.nextInt();
           l.add(x);
        }
        System.out.println(l);
        System.out.println("sub list of array List--> "+l.subList(1,2));
        l.add(20);
        l.add(0,100);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(l.contains(100));
        ArrayList l2 = new ArrayList(l.subList(1,3));
        l2.add(55);
        l2.add(65);
         Collections.sort(l2);
        System.out.println("list 2--->"+l2);
      //  l2.addAll(1,l);
        //System.out.println("list2 aferr modify--> "+l2);
        ArrayList l3 = new ArrayList();
        for (Object r : l2) {
               l3.add(l.contains(r) ? "yes" : "no");
               System.out.println(l3);
        }
    }
}
