// Abstract class
abstract class CleaningRobot {
    // Abstract method
    abstract void startCleaning();

    // Common method
    void chargeBattery() {
        System.out.println("Charging battery...");
    }
}

// Subclass 1
class FloorRobot extends CleaningRobot {
    void startCleaning() {
        System.out.println("Sweeping the floor...");
    }
}

// Subclass 2
class WindowRobot extends CleaningRobot {
    void startCleaning() {
        System.out.println("Wiping the windows...");
    }
}
public class AbsEx1 {
    public static void main(String[] args) {
        CleaningRobot robot1 = new FloorRobot();
        robot1.chargeBattery();
        robot1.startCleaning();

        System.out.println("-----");

        CleaningRobot robot2 = new WindowRobot();
        robot2.chargeBattery();
        robot2.startCleaning();
    }
}

