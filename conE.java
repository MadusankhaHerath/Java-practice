class Student {
    String name;

    // Constructor
    Student(String studentName) {
        name = studentName;
    }

    void display() {
        System.out.println("Student name is: " + name);
    }
}

public class conE {
    public static void main(String[] args) {
        Student s1 = new Student("Dilshan");  // constructor is called here
        s1.display();
    }
}
