import java.util.ArrayList;
public class Arraylist {

     public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max ){
                max = list.get(i);
            }
            
        }
        return max;

     
    }

    public static int addElement(ArrayList<Integer> list, int element) {
        list.add(element);
        return element;
    }
    public static int removeElement(ArrayList<Integer> list , int index){
        return list.remove(index);
    }

    public static int sumOfElements(ArrayList<Integer> list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }

        return sum;

    }

    public static int reverseList(ArrayList<Integer> list){
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
        return 0;

    }

    public static int CountEvenOrOdd(ArrayList<Integer> list ){
        int even = 0;
        int odd = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
        return 0;
    }

    public static int findSecondMax(ArrayList<Integer> list){
        int max = list.get(0);
        int secondMax = Integer.MIN_VALUE;
        for(int i = 1; i < list.size(); i++){

            if(list.get(i) > max ){
                secondMax = max ;
                max = list.get(i);
            }

            else if(list.get(i) > secondMax && list.get(i) != max ){
                secondMax = list.get(i);
            }
            // if(list.get(i) > max){
            //     secondMax = max;
            //     max = list.get(i);
            // }
           
        }
        return secondMax;
    }

    public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();

    List<Integer> list2  = new ArrayList<>(list);

    addElement(list, 20);
    addElement(list, 10);
    addElement(list, 30);
    addElement(list, 40);
    System.out.println("Max element is: " + findMax(list));
    System.out.println("Sum of elements is: " + sumOfElements(list));
    System.out.println("Reversed list is:");
    reverseList(list);


    System.out.println(list);
    CountEvenOrOdd(list);



    }




    





















        // ArrayList<Object> List = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // List.add(10);
        // List.add(20);
        // List.add(30);
        // List.add(40);
        // System.out.println(List);
        // List.add(1,50);
        // System.out.println(List);
        // System.out.println(List.getFirst());
        // System.out.println(List.getLast());
        // List.remove(4);
        // List.add("Hello");
        // List.add(3.14);
        // List.add('a');
        // System.out.println(List);




    }
    

