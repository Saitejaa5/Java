package OOPS;
class Person{
    int age ; 
    String name;

    Person(int age , String name){
        this.age = age;
        this.name = name;
    }

    void displayPerson(){
        System.out.println("age :" + age);
        System.out.println("Name : " + name );

    }
}

class Student extends Person{
    
    int id ;
    String course;

    Student(String name ,int age ,int id , String course ){
        super(age , name);
        this.id = id;
        this.course = course;
    }

        void displayStudent(){
            displayPerson();
            System.out.println("id : " + id);
        System.out.println("course " + course);
        }

    }



public class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student("teja" , 20 , 39 , "java");
s1.displayStudent();
    }
    
}
