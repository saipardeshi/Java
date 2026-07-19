// Polymorphism.java

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }

    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    double area() {
        return length * width;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Runtime polymorphism - same reference type, different objects
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.draw();
        System.out.println("Area: " + s1.area());

        System.out.println("-----");

        s2.draw();
        System.out.println("Area: " + s2.area());

        System.out.println("-----");

        // Compile-time polymorphism (method overloading)
        System.out.println("Sum (int): " + add(5, 10));
        System.out.println("Sum (double): " + add(5.5, 10.5));
    }

    // Overloaded methods - same name, different parameters
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}