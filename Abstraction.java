// Abstraction.java

// Abstract class - cannot be instantiated directly
abstract class Payment {
    // Abstract method - no body, must be implemented by subclasses
    abstract void processPayment(double amount);

    // Regular (concrete) method - shared by all subclasses
    void printReceipt(double amount) {
        System.out.println("Receipt: Payment of " + amount + " processed successfully.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}

class UpiPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.processPayment(2500.0);
        p1.printReceipt(2500.0);

        System.out.println("-----");

        Payment p2 = new UpiPayment();
        p2.processPayment(750.0);
        p2.printReceipt(750.0);

        // Payment p = new Payment(); // ❌ compile error - can't instantiate abstract class
    }
}