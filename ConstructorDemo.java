class Car2 {
    String color;
    String model;
    int speed;

    // Constructor - same name as class, no return type
    Car2(String c, String m, int s) {
        color = c;
        model = m;
        speed = s;
    }

    void displayInfo() {
        System.out.println("Model:" + model + ", color:" + color + ", speed:" + speed);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // One line creates AND fills the object
        Car2 myCar = new Car2("Red", "Tesla", 20);
        Car2 friendsCar = new Car2("Blue", "BMW", 40);

        myCar.displayInfo();
        friendsCar.displayInfo();
    }
}