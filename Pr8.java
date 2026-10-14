class BankAcount{
    String name;
    int balance;

    void deposit(int amount){
        balance =balance+amount;
        System.out.println("Deposited :"+amount);
    }
    void withdraw(int amount){
        if(amount <= balance){
            balance=balance =amount;
            System.out.println("withdraw:" +amount);
        }else{
            System.out.println("insufficienct balance");
        }
    }
    void displayBalance(){
        System.out.println("Account holder :"+name);
        System.out.println("Balance:"+balance);
    }
}

public class Pr8 {
    public static void main(String[] args) {
        BankAcount b1=new BankAcount();

        b1.name="sai";
        b1.balance=5000;

        b1.deposit(2000);
        b1.withdraw(1500);

        b1.displayBalance();
    }
}
