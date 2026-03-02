package OOPS;


abstract class animal{

    abstract void sound();

    void animal(){
        System.out.println("Animal is sleeping");
    }
}


class dog extends animal{
    void sound(){
        System.out.println("Dog barks");
    
    }
}

public class abstrct {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.animal();
    }
    
}
