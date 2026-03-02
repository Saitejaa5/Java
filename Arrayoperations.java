import java.util.Scanner;

public class Arrayoperations {
    static void updateElement(int[] arr , int index , int value){
        arr[index] = value;
    }
    static void printArray(int[] arr, int size){
        System.out.println("Elements in Array are: ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void sumOfArray(int[] arr , int size){
        int sum =0;
        System.out.println("Sum of array elements is: ");
        for(int i =0;i < size ; i++){
            sum +=arr[i];

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();    
        int[] arr = new int[size];  
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();  
        }
        printArray(arr, size);
        sumOfArray(arr, size);
        sc.close();
    }
    
}
