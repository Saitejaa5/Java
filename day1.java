 import java.util.Scanner;
 public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // byte b = 10;
        // short s = 100;
        // int i = 1000;
        // long l = 100000L;

        // float f = 10.5f;
        // double d = 20.99;

        // char c = 'A';

        // boolean bool = true;

        // String str = "Hello Java";
        
        System.out.println("byte: " );
        byte b = sc.nextByte();

        System.out.println("short: " );
        short s = sc.nextShort();

        System.out.println("int: " );
        int i = sc.nextInt();
        System.out.println("long: " );
        long l = sc.nextLong();
        System.out.println("float: " );
        float f = sc.nextFloat();
        System.out.println("double: " );
        double d = sc.nextDouble();
        System.out.println("char: " );
        char c = sc.next().charAt(0);
        System.out.println("boolean: " );
        boolean bool = sc.nextBoolean();
        System.out.println("String: " );
        String str = sc.next();



    }
}
 
    

