class Circle1 {
    private double radius;

    Circle1(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive! Setting to 0.");
            this.radius = 0;
        }
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius;
        } else {
            System.out.println("Radius must be positive!");
        }
    }

    void compareTo(Circle1 other) {
        if (this.getArea() > other.getArea()) {
            System.out.println("This circle is bigger.");
        } else if (this.getArea() < other.getArea()) {
            System.out.println("This circle is smaller.");
        } else {
            System.out.println("Both circles are equal in area.");
        }
    }
}

public class Practice12 {
    public static void main(String[] args) {
        Circle1 circleA = new Circle1(5);
        Circle1 circleB = new Circle1(3);

        System.out.println("Circle A - Area: " + circleA.getArea() + ", Circumference: " + circleA.getCircumference());
        System.out.println("Circle B - Area: " + circleB.getArea() + ", Circumference: " + circleB.getCircumference());

        circleA.compareTo(circleB);

        Circle1 circleC = new Circle1(-4);
        System.out.println("Circle C - Area: " + circleC.getArea());
    }
}