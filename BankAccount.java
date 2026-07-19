// BankAccount.java

class Account {
    private String accountHolder;
    private double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void showBalance() {
        System.out.println(accountHolder + "'s balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account acc = new Account("Harry", 1000.0);
        acc.showBalance();

        System.out.println("-----");

        acc.deposit(500);
        acc.showBalance();

        System.out.println("-----");

        acc.withdraw(2000);
        acc.withdraw(300);
        acc.showBalance();
    }
}