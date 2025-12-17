import java.util.Scanner;
public class fibonacci {
    static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t;
        System.out.println("Enter the no.of terms u need for fibonacci series: ");
        int n = sc.nextInt();
        // System.out.println("Enter the first digit of the series: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the second digit of the series: ");
        // int b = sc.nextInt();
        // System.out.println("fibonacci series upto " + n + " tearms are :");
        sc.close();
        // for(int i = 3  ; i <= n  ; i++){
        //     t = a+b;
        //     System.out.println(t);
        //    a = b;
        //    b = t;

        // }


        // ============================================================================================

        // int a = 0 , b = 1;
        // System.out.println("fibonacci series starts: ");
        // for(int i = 1 ; i <= n ; i++){
        //     System.out.println(a + " ");
        //     int c = a+ b;
        //     a = b ;
        //     b = c;

        // }


        // =============================================================================================


        fibonacciSeries(n);
    }

    
}
