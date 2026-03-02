import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {

        // LinkedList<String> ll = new LinkedList<>();


        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(20);
        ll.add(50);
        ll.add(10);
        ll.add(15);
        ll.add(30) ;
        ll.add(25);
        System.out.println(ll);      

        Collections.sort(ll);
        System.out.println("Sorted linked list: " + ll);
        ll.add(5 , 35);
        System.out.println("After adding 35 at index 5: ");
        System.out.println(ll  );

        ll.remove(5);
        ll.remove(3);
        ll.remove(1);
        System.out.println("After removing 35, 25, and 15: " + ll);

        ll.addFirst(5);
        ll.addLast(100);


        ll.removeFirst();
        ll.removeLast();

        Collections.reverse(ll);

        System.out.println(ll);

        ll.contains(50);

        int mid = ll.size() / 2;
        System.out.println(mid);
        System.out.println("Middle element: " + ll.get(mid));

        LinkedList<Integer> queue = new LinkedList<>(ll);

        System.out.println("Queue: " + queue);
        Collections.reverse(queue);
        System.out.println("Reversed Queue: " + queue);
        

    }   
    
}
