import java.util.*;
public class Arrays {

    static void printArray(int[] arr){
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }

    static void printReverseArray(int[] arr){
          for(int i = arr.length -1 ; i >=0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            } 
         }

         System.out.println("\nMax: " );
         return max;

    }

    static void findMin(int[] arr){
         int min = arr[0];
         for(int num : arr){
            if(num < min){
                min = num;
            }
         }
            System.out.println("\nMin: " + min);
        

    }
    static void findSecondMax(int[] arr){
        int fs = arr[0];
        int se = arr[0];
        for(int num : arr){
            if(num > fs ){
                se = fs ; 
                fs = num;

            }
            else if( num > se && num != fs){
                se = num ;
            }
        }
        System.out.println("first : " + fs);
        System.out.println("Second : " + se);
    }
    static void findSecondMin(int[] arr){
        int fs = arr[0];
        int se = arr[0];
        for(int i=0; i < arr.length;i++){
            if(arr[i] < fs){
                se = fs;
                fs = arr[i];
            }
        }
        System.out.println("first : " + fs);
        System.out.println("Second : " + se);
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void frequencyCountofArrays(int[] arr){
        boolean[] visited = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(visited[i]) 
                continue;

            int count = 1;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                    
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
    static void rotateArrayLeftByOne(int[] arr){

        printArray(arr);
        int first = arr[0];

        for(int i = 0; i< arr.length-1;i++){
            arr[i] = arr[i +1];

        }
        arr[arr.length-1] = first;
        printArray( arr);


    }

    static void rotateArrayRightByOne(int[] arr){
        printArray(arr);
        int last = arr[arr.length-1];

        for(int i = arr.length-1 ; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        printArray(arr);
    }
    static void moveZerosToEnd(int[] arr){
        int index = 0;
        for(int i =0 ; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        printArray(arr);
    }

  static void avgOfThree(int a, int b, int c){
        double avg = (a + b + c) / 3.0;
        System.out.println(avg);
    }

    static void fibnacciSeries(int n){
        int a = 0; int b = 1;
        for(int i = 0 ; i < n ; i++){
            System.out.println(a);
            int c = a + b ;
            a = b ;
            b = c;

        }
  }
  static void countEvenAndOdd(int n){
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i <= n ; i++){
            if(i % 2 == 0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("Even count : " + countEven);
        System.out.println("Odd count : " + countOdd);
    }
    // static void lengthOfString()


        
    
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        do { 
            System.out.println(".");
        } while (true);
     
        


       

    }
}

       
        
       

