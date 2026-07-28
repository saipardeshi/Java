class BankAccount {
    private double balance;   // private = only accessible inside this class

    // Constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Getter - lets outside code READ the value safely
    double getBalance() {
        return balance;
    }

    // Setter/method - lets outside code CHANGE the value, but with rules
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else {
            balance = balance - amount;
        }
    }
}

public class BankDemo1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        System.out.println("Starting balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("After withdraw: " + account.getBalance());

        account.withdraw(10000);  // should fail - insufficient funds
        account.deposit(-50);     // should fail - invalid amount

        // account.balance = -999;  // This would NOT compile - balance is private!
    }
}