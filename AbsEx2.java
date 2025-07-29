abstract class Vehicle {
    // abstract method (no body)
    abstract void start();

    // regular method
    void fuel() {
        System.out.println("Filling fuel...");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a button.");
    }
}
public class AbsEx2{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();  // Car-specific start
        myCar.fuel();   // Common method

        Vehicle myBike = new Bike();
        myBike.start(); // Bike-specific start
        myBike.fuel();  // Common method
    }
}
