abstract class Shape2 {
    String name;

    Shape2(String name) {
        this.name = name;
    }

    // Abstract method - no body! Every child MUST implement this
    abstract double area();

    // Regular method - can still have shared logic
    void display() {
        System.out.println(name + " has area: " + area());
    }
}

class Circle2 extends Shape2 {
    double radius;

    Circle2(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle2 extends Shape2 {
    double length, width;

    Rectangle2(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape2[] shapes = {
                new Circle2(5),
                new Rectangle2(4, 6)
        };

        for (Shape2 s : shapes) {
            s.display();
        }

        // Shape2 s = new Shape2("test");  // This would NOT compile!
    }
}