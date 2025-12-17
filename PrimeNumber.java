import java.util.*;
public class PrimeNumber {
    static void checkPrime(int n ){
        boolean isprime = true;
        if(n <= 1){
            System.out.println("Not a prime number");
         }
         else{
            for(int i =2 ; i < n ; i++){
                if(n % i == 0){
                    isprime = false;
                    break;
                }
            }
        }
            if(isprime){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a prime number");
            }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number: ");
        int n = sc.nextInt();
        sc.close();
        checkPrime(n);
    }
}
