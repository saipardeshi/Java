class Vehicle4 {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

class Car3 extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key/button");
    }
}

class VehicleDemo3 {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();

        v1.start(); // Bike starts with a kick
        v2.start(); // Car starts with a key/button
    }
}