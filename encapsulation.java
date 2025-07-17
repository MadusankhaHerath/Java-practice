class Student {
    private String name;  // private = encapsulated

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Dilshan");
        System.out.println(s.getName());
    }
}
