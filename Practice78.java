interface Payment78 {
    void pay(int amount);
}

class Upi78 implements Payment78 {
    public void pay(int amount) {
        System.out.println("paid " + amount + " using UPI");
    }
}

class Card78 implements Payment78 {
    public void pay(int amount) {
        System.out.println("paid " + amount + " using card");
    }
}

public class Practice78 {
    public static void main(String[] args) {
        Payment78 p1 = new Upi78();
        Payment78 p2 = new Card78();

        p1.pay(500);
        p2.pay(1200);
    }
}