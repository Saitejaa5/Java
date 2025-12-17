import java.util.Scanner;


public class CountOfDigits {
    static void countOfDigits(int n ){
        int sum = 0;
        // while(n > 0){
        //     n /=10;
        //     sum += 1;
        // }

        do { 
            sum ++;
            n /= 10;
        } while (n > 0);
        System.out.println("The count of digits is: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = 0;

        System.out.println("enter a number ");
        int n = sc.nextInt();

        sc.close();
        // while( n > 0){
        //     n /= 10;
        //     sum+= 1;
        // }
        // System.out.println(sum);
        countOfDigits(n);
    }

    
}
