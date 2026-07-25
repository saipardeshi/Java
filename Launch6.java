abstract class Vehicle6 {
    String name;

    Vehicle6(String name) {
        this.name = name;
    }

    abstract void start();

    void showName() {
        System.out.println("Vehicle: " + name);
    }
}

interface FuelType6 {
    void fuel();
}

class Car6 extends Vehicle6 implements FuelType6 {

    Car6(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " starts with a key turn.");
    }

    @Override
    public void fuel() {
        System.out.println(name + " runs on Petrol.");
    }
}

class Bike6 extends Vehicle6 implements FuelType6 {

    Bike6(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " starts with a self-start button.");
    }

    @Override
    public void fuel() {
        System.out.println(name + " runs on Petrol too.");
    }
}

public class Launch6 {
    public static void main(String[] args) {
        Vehicle6 car = new Car6("Tata Nexon");
        Vehicle6 bike = new Bike6("Royal Enfield");

        car.showName();
        car.start();
        ((FuelType6) car).fuel();

        System.out.println();

        bike.showName();
        bike.start();
        ((FuelType6) bike).fuel();
    }
}