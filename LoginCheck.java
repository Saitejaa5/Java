import java.util.Scanner;
public class LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "Admin";
        String pass = "Admin123";
        System.out.println("Enter the Username: ");
        String username = sc.nextLine();
        System.out.println("Enter the password: ");
        String password = sc.nextLine();
        if(username.equals(user) && password.equals(pass)){
            System.out.println("Login Succesfull");
        }
        else{
            System.out.println("Login Failed");
        }
    }
    
}
