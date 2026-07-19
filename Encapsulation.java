// Encapsulation.java

class Student {
    // private fields - hidden from outside access
    private String name;
    private int age;
    private double marks;

    // Constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods (with validation - the real power of encapsulation)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student("Harry", 20, 85.5);
        s1.displayInfo();

        System.out.println("-----");

        s1.setAge(21);
        s1.setMarks(90.0);
        s1.displayInfo();

        System.out.println("-----");

        s1.setAge(-5);
        s1.setMarks(150);
        s1.displayInfo();
    }
}