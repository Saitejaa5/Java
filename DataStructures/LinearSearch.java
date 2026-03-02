import java.util.Scanner;
public class LinearSearch{
    static void linearSearch(int arr[] , int key){
        boolean found = false;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == key){
                System.out.println("Key found at index " + i);
                found = true;
                break;
            }
        }
            if(found == false){
                System.out.println("Key not found");
            
            }else{
                System.out.println("Key found");
            }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of array elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key to be searched ");
        int key = sc.nextInt();
        linearSearch(arr , key);
        sc.close();}


    }
