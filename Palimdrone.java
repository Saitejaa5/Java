import java.util.Scanner;

public class Palimdrone {
    static boolean ispalimprome(int n ){
        int org = n ;
        int rev =0;
        while(n != 0){
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        return org == rev;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev=0;
        while(a!=0){
            int digit = a % 10;
            rev =rev * 10 + digit;
            a /= 10;
        }
System.out.println(rev);
    sc.close();
    System.out.println(ispalimprome(12321));
        
        
        
    }
}
