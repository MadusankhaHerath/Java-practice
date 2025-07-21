class Transport {
    void move() {
        System.out.println("Transport is moving...");
    }
}

class Car extends Transport{
    void move(){
        System.out.println("Car is moving in the road");
    }
}

class Bus extends Transport {
    
    void move() {
        System.out.println("Bus is carrying passengers");
    }
}

class Bike extends Transport {
    
    void move() {
        System.out.println("Bike is speeding through traffic");
    }
}

public class Override {
    public static void main(String[] args) {
        Transport t;

        t = new Car();
        t.move();  // Output: Car is moving on the road

        t = new Bus();
        t.move();  // Output: Bus is carrying passengers

        t = new Bike();
        t.move();  // Output: Bike is speeding through traffic
    }
}
