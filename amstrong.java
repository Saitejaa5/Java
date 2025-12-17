import java.util.*;
public class amstrong {
    static boolean isamstrongNumber(int n){
        int num = n ;
        int amstrong = 0;
        while( n > 0 ){
            int temp = n % 10;
            amstrong += temp* temp * temp;
            n /= 10;
        }
        return num == amstrong;

    }
    static void amstrongNumber(int n){
        int amstrong = 0;
        int original= n;
        while(n > 0){
            int temp = n % 10;
            amstrong += temp * temp * temp; 
            n /= 10;
        }
        if(original == amstrong){
            System.out.println("Yes it is an amstrong number");
        }
        else{
            System.out.println("No it is not an amstrong number");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbeer: ");
        int n = sc.nextInt();
        sc.close();
        // int original = n;
        // int amstrong = 0;
        // while(n > 0){
        //     int temp = n % 10 ;
        //     amstrong= amstrong + (temp * temp * temp);
        //     n /= 10;

        // }
        // System.out.println(amstrong);
        // if(original ==  amstrong){
        //     System.out.println("yes it is an imstrong number ");

        // }
        // else{
        //     System.out.println("No its not AN AMSTRON number");
        // }
        amstrongNumber(n);
    System.out.println(isamstrongNumber(153));

    }
}
