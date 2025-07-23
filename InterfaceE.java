interface Vehicle {
    void start();  // abstract method
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}
public class InterfaceE{
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();

        v.start();
        v.stop();
    }
}