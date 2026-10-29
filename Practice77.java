abstract class Bank77 {
    abstract double interestRate();

    void show(double amount) {
        System.out.println("Interest: " + (amount * interestRate() / 100));
    }
}

class Sbi77 extends Bank77 {
    double interestRate() {
        return 6;
    }
}

class Hdfc77 extends Bank77 {
    double interestRate() {
        return 7;
    }
}

public class Practice77 {
    public static void main(String[] args) {
        Bank77 b1 = new Sbi77();
        Bank77 b2 = new Hdfc77();

        b1.show(10000);
        b2.show(10000);
    }
}