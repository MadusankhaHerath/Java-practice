abstract class Animal{
    abstract void makesound();
    //abstract method no body

    void breath(){
        System.out.println("Animals are breathng");
    }

}

class cat extends Animal{
    void makesound(){
        System.out.println("meow!");
    }
}

class Dog extends Animal{
    void makesound(){
        System.out.println("woof!");
    }
}


public class Abstraction{
    public static void main(String [] args){
        Animal A;

        A = new cat();
        A.makesound();

        A = new Dog();
        A.makesound();
        
        
    }
}