import java.util.Scanner;

public class factorial {
    static int factorial(int n) {
        if ( n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        // long fact = 1;
        // int temp = num;

        // if (num < 0) {
        //     System.out.println("Factorial does not exist for negative numbers");
        // } 
        // else {
        //     for (int i = 1; i <= num; i++) {
        //         fact *= i;
        //     }
        //     System.out.println(num + "! = " + fact);
        // }
        // else {
        //     for(int i = num ; i >= 2 ;i--){
        //         fact *= i;
        //     }
            
        // }System.out.println(num + "! = " + fact);


        // while(num >0){
        //     fact *=num;
        //     num--;
        // }
        // System.out.println(temp + "! = " + fact);


        // ========================================================================================

        int res = factorial(num);
        System.out.println("Factorial of " + num + " is: " + res);





    }
}
