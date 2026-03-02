import java.util.Scanner;
public class BinarySearch {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of array elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("ENter the sorted array elements:");
    for (int j = 0; j < arr.length; j++) {
        arr[j] = sc.nextInt();
    }
    System.out.println("Enter the element to be searched: ");
      int key = sc.nextInt();
      int low = 0;
      int high = arr.length - 1;
      boolean found = false;
   
      while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
          System.out.println("Element found at index: " + mid);
          found = true;
          break;
        } else if (arr[mid] < key) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
      if (!found) {
        System.out.println("Element not found in the array.");
      }
      else{
        System.out.println("found element is : " + key);
      }
      sc.close();
   
      }
    
  }  

