import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    void arr_list(){
        
    }
    public static void main(String[] args) {
        ArrayList<Object> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        System.out.println(List);
        List.add(1,50);
        System.out.println(List);
        System.out.println(List.getFirst());
        System.out.println(List.getLast());
        List.remove(4);
        List.add("Hello");
        List.add(3.14);
        List.add('a');
        System.out.println(List);


    }
    
}
