import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class problmIT {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Using Iterator (Forward only):");

        Iterator<Integer> it = list.iterator();
             

        System.out.println("Using iterator forward traversal: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("Using Listiterator (Forward and backward: ");
        ListIterator<Integer> lit = list.listIterator();

       

        System.out.println("forward traversal: ");
        while(lit.hasNext()){
            System.out.println(lit.next());

        }

        System.out.println("Backward traversal: ");

        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }




    }
}
