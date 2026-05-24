public class BasicProblems {
    public static void EvenOdd(int num){
        if(num % 2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void intcheck(int num){
        if(num > 0){
            System.out.println("Positive");
        }
        else if(num <0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }

    public static void largestOfTwo(int a , int b){
        if(a > b ){
            System.out.println("largest is : " + a);
        }
        else if( b > a ){
            System.out.println("Largest is : " + b);

        }
        else{
            System.out.println("Both are equal");
        }
    }

    public static void LargestOfThree(int a , int b , int c){
        if(a > b && a > c){
            System.out.println("largest is: " + a);
        }
        else if( b > a && b > c){
            System.out.println("Largest is : " + b );
        }
        else {
            System.out.println("largest is : " + c);
        }
    }
    
    public static void LeapYear(int year){
        if(year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println("Not a leap year");        
        }
    }
    public static void PrintLeapYear(int n){
        for(int i = 1 ; i < n ;i++){
            if(i % 400 ==0 || (i % 4 == 0 && i % 100 != 0)){
                System.out.println( i );
        }
        }

    }

    public static void Calculator(int a , int b , char op){
        switch(op){
            case '+':
                System.out.println("sum is : " + (a+b));
                break;
            case '-':
                System.out.println("sum is : " + (a-b));
                break;
            case '/':
                System.out.println("sum is : " + (a/b));
                break;
            case '*':
                System.out.println("sum is : " + (a*b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    } 

    public static void MultiplicationTable(int num){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }


    public static void SumOfNaturalNumbers(int n){
        int sum = 0;
        for(int i = 0  ; i <= n ; i++){
            sum += i;
        }
        System.out.println("Sum of first " + n + " Natural numbers is : " + sum);
    }

    public static void Factorial(int n){
        int fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact*=i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }

    public static void PowerOfNumber(int base , int exp){
        int res = 1;
        for(int i = 1; i <= exp ; i++){
            res *= base;
        }
        System.out.println(res);
    }

    public static void fibonacci(int n){
        int a = 0; 
        int b = 1;
        for(int i = 1 ; i <= n ; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            

        }
    }
    public static void primeNumbers(int n){
        for(int i =1 ; i <= n ; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int num){
       if(num <=1 ){
        return false;
       }
       for(int i = 2 ; i <= Math.sqrt(num) ; i++){
        if(num % i ==0){
            return false; 
        }
       }
       return true;
    }
    public static void amstrongNumber(int num){
        int org = num;
        int sum = 0;
        while(num > 0){
            int res = num % 10;
            sum += res*res*res;
            num /= 10;
        }
        if(sum == org){
            System.out.println(org + " its a amstrong number");
        }
        else{
            System.out.println(org + " is not an amstrong number");
        }
    }
    


    public static void main(String[] args){
        // EvenOdd(10);
        // intcheck(-5);
        // System.out.println(isPrime(17));
        // largestOfTwo(10, 20);
        // LargestOfThree(10, 20, 15);
        // LeapYear(2020);
        // // PrintLeapYear(2026);
        // MultiplicationTable(5);
        // Calculator(10, 5, '+');
        // SumOfNaturalNumbers(10);
        // Factorial(5);
        // PowerOfNumber(2, 3);
        // fibonacci(50);
        primeNumbers(100);
    }
}

