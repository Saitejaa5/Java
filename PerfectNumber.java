import java.util.*;
public class PerfectNumber {
    static void isPerfect(int n ){
        int temp = n;
        int sum =0;
        for(int i = 1; i <= n/2 ; i++){
            if( n % i == 0){
                sum += i ;
            }


        }
        if(temp == sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        sc.close();
        isPerfect(n);
    }
}
