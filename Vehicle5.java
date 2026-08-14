class Vehicle5 {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Bike2 extends Vehicle5 {
    @Override
    void start() {
        System.out.println("Bike starts with a kick!");
    }
}

class Car5 extends Vehicle5 {
    @Override
    void start() {
        System.out.println("Car starts with ignition key!");
    }
}

class VehicleDemo4 {
    public static void main(String[] args) {
        Vehicle5 v1 = new Bike2();
        Vehicle5 v2 = new Car5();

        v1.start();
        v2.start();
    }
}