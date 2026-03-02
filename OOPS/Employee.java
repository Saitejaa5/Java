package OOPS;
import java.util.*;

class Details{
    private int empID;
    private String empName;
    private double empSalary;


    public void setEmpID(int empID){
        this.empID = empID;
    }

    public int getEmpID(){
        return empID;
    }

    public void setempName(String empName){
        this.empName = empName;
    }

    public String getempName(){
        return empName;
    }


    public void setempSalary(double empSalaray){
        if(empSalaray > 0){
            this.empSalary = empSalaray;
        }
        else{
            System.out.println("Salary is null");
        }
    }
    public double getempSalary(){
        return empSalary;
    }

    void DisplayDetails(){
        System.out.println("Employee ID : " + empID);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Salary : " + getempSalary());
    }
    
}

public class Employee {
    public static void main(String[] args) {
         Details d1 = new Details();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter emp id : ");
            int id = sc.nextInt();
            System.out.println("Enter emp Name : ");
            String name = sc.next();
            System.out.println("Enter emp Salary: ");
            double salary = sc.nextDouble();

            sc.close();

            d1.setEmpID(id);
            d1.setempName(name);
            d1.setempSalary(salary);

            d1.DisplayDetails();

    }

    
}
