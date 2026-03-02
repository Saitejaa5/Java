public class TwoPointers {
    public static void main(String[] args) {


        int arr[] = {1,2,0,4,5};
        int n = arr.length;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
        }
        System.out.println(sum);

        int sumofall = n * ( n + 1 ) / 2;

        System.out.println(sumofall);

        int missingNumber = sumofall - sum;

        System.out.println(missingNumber);

        // int arr[] = {1, 2, 4, 6};
        // int n = 6; 

        // int sum = 0;
        // int squareSum = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        //     squareSum += arr[i] * arr[i];
        // }

        // int totalSum = n * (n + 1) / 2;
        // int totalSquareSum = n * (n + 1) * (2 * n + 1) / 6;

        // int sumDiff = totalSum - sum; 
        // int squareDiff = totalSquareSum - squareSum;

        // int xy = (sumDiff * sumDiff - squareDiff) / 2;

        // int x = (sumDiff + (int)Math.sqrt(sumDiff * sumDiff - 4 * xy)) / 2;
        // int y = sumDiff - x;

        // System.out.println("Missing numbers are: " + x + " and " + y);

        String str = "Hello";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb);




    }
}