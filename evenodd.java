import java.util.Scanner;
public class evenodd {

    // static void checkEvenOdd(int number) {
    //    if(number % 2 == 0) {
    //     System.out.println("even");
    //    }
    //    else{
    //     System.out.println("odd");
    //    }
    // }
    static boolean iseven(int number) {
         if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        // int number = 10; 


        // ====================================================================================

        
        // if (number % 2 == 0) {
        //     System.out.println(number + " is an even number.");
        // } else {
        //     System.out.println(number + " is an odd number.");
        // }

        // ========================================================================================


        // String a = (number % 2 == 0) ? "Even number" : "Odd number";
        // System.out.println(a);
        // checkEvenOdd(number);


        // =========================================================================================
        // if(iseven(number)){
        //     System.out.println("even ");
        // }
        // else{
        //     System.out.println("odd");
        // }

        // =========================================================================================
        System.out.println(iseven(number) ? "even" : "odd");







      



    }
    
}
