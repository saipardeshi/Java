class Vehicle1 {
    String brand;

    Vehicle1(String brand) {
        this.brand = brand;
    }

    void startEngine() {
        System.out.println(brand + "'s engine has started.");
    }
}

class Bike1 extends Vehicle1 {
    Bike1(String brand) {
        super(brand);
    }

    void ringBell() {
        System.out.println(brand + "'s bell goes ring ring!");
    }
}

public class Practice14 {
    public static void main(String[] args) {
        Bike1 myBike = new Bike1("Hero");

        myBike.startEngine();
        myBike.ringBell();
    }
}