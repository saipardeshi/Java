class Payment1 {
    double amount;

    Payment1(double amount) {
        this.amount = amount;
    }

    void processPayment() {
        System.out.println("Processing generic payment of " + amount);
    }
}

class CreditCardPayment1 extends Payment1 {
    CreditCardPayment1(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment of " + amount);
    }
}

class UpiPayment1 extends Payment1 {
    UpiPayment1(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI payment of " + amount);
    }
}

public class Practice18 {
    public static void main(String[] args) {
        Payment1[] payments = {
                new Payment1(100),
                new CreditCardPayment1(2500),
                new UpiPayment1(750)
        };

        for (Payment1 p : payments) {
            p.processPayment();
        }
    }
}