package OOPS;

class Student{
    int id;
    String name ;


    Student(int id , String name){
        this.id= id;
        this.name=name;

    }

    public void display(){
       System.out.println("id " + id  + " name " + name);
    }

}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(39 , "Saiteja");
        Student s2 = new Student(166 , "Shreeja");
        Student s3 = new Student(173 , "Shravya");


        s1.display();
        s2.display();
        s3.display();

        System.out.println("id : " + s1.id + "\nname :" + s1.name);
    }
    
}
