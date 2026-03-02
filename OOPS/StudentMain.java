package OOPS;
import java.util.*;

class Student {

    private int id;
    private String name;
    private int marks;

    public void setId(int id){
        if(id > 0){
            this.id = id;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public String getName(){
        return name;
    }

    public void setMarks(int marks){
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100");
        }
    }

    public int getMarks(){
        return marks;
    }

    void displayDetails(){
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Marks : " + marks);
    }
}

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student id: ");
        int id = sc.nextInt();

        System.out.println("Enter the Student name: ");
        String name = sc.next();

        System.out.println("Enter the Student Marks: ");
        int marks = sc.nextInt();

        Student s1 = new Student();
        s1.setId(id);
        s1.setName(name);
        s1.setMarks(marks);

        s1.displayDetails();

        sc.close();
    }
}
