// Inheritance2.java

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // inherited from Vehicle
        myCar.drive(); // Car's own method
    }
}