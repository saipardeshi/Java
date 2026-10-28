interface Shape75 {
    double area();
}

class Circle75 implements Shape75 {
    double radius;

    Circle75(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle75 implements Shape75 {
    double length, width;

    Rectangle75(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class Practice75 {
    public static void main(String[] args) {
        Shape75[] shapes = { new Circle75(3), new Rectangle75(4, 5) };

        for (Shape75 s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}