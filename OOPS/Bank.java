
package OOPS; 

import java.util.Scanner;

class Acc{
    private int balance;

    public void setBalance(int balance){
        if(balance > 0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance");
        }
    }


    public int getBalance(){
        return balance;
    }

    

}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance: ");
        int amt = sc.nextInt();

        sc.close();
        Acc a1 = new Acc();
        a1.setBalance(amt);
        System.out.println("Balance :" + a1.getBalance());
    }
    
}
