class Rectangle1 {
    private double length;
    private double width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    void setLength(double newLength) {
        if (newLength > 0) {
            length = newLength;
        } else {
            System.out.println("Length must be positive!");
        }
    }
}

public class Practice11 {
    public static void main(String[] args) {
        Rectangle1 rect1 = new Rectangle1(10, 5);
        Rectangle1 rect2 = new Rectangle1(7, 3);

        System.out.println("Rectangle 1 - Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());
        System.out.println("Rectangle 2 - Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimeter());

        rect1.setLength(-5);
        rect1.setLength(20);
        System.out.println("Rectangle 1 after update - Area: " + rect1.getArea());
    }
}