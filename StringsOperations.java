import java.util.Scanner;
        // take a user input array sring find the cummulative length 
    // static void lenghtOfStringArray[string[] arr]{



    // }



public class StringsOperations {
    public static void main(String[] args) {
        String s1 = "SName";
        String s2 = "SName";
        Scanner sc = new Scanner(System.in);
        // take a user input array sring find the cummulative length 
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();   
        }
        for (int i = 0; i < arr.length; i++) {
            len += arr[i].length();
        }
        System.out.println(len);
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));
    }
}



