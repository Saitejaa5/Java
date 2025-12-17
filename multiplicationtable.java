import java.util.*;
public class multiplicationtable {
    static void multiplicationTable(int n ){
        for(int i = 1 ; i <=10 ; i++){
            System.out.println(n + " x " + i + " = " + ( n *i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want the multiplication tablr for: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + ( n * i ));
        }
        multiplicationTable(n);
    }
}
