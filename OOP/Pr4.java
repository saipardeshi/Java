package OOP;

class Vehicle {
    void start() {
        System.out.println("vehicle starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("car starts with key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("bike starts with kick");
    }
}

public class Pr4 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}