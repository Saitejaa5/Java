import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Hash code for '" + str + "': " + str.hashCode());

        String anotherStr = "Hello, World!";
        System.out.println("Hash code for '" + anotherStr + "': " + anotherStr.hashCode());

        String differentStr = "Goodbye, World!";
        System.out.println("Hash code for '" + differentStr + "': " + differentStr.hashCode());

        int num1 = 39;
        System.out.println("Hash code for " + num1 + ": " + Integer.hashCode(num1));

        int[] arr = {1,1,2,3,3,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr) {
           map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
        
    }
    
}
