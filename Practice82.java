class Area82 {
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double length, double width) {
        return length * width;
    }
    double area(int side) {
        return side * side;
    }
}
public class Practice82 {
    public static void main(String[] args) {
        Area82 a = new Area82();

        System.out.println("Circle: " + a.area(2.0));
        System.out.println("Rectangle: " + a.area(4.0, 5.0));
        System.out.println("Square: " + a.area(3));
    }
}