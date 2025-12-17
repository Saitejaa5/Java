import java.util.*;
public class ReversingTheNumber {
    static void revrsNumber(int n ){
        int reversed = 0;
        while(n > 0){
            int temp = n % 10;
            reversed = reversed * 10 + temp;
            n /= 10;
        }
        System.out.println("The reversed number is: " + reversed);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        revrsNumber(n);
    }   
}
