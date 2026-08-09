import java.util.Scanner;

public class conditionals2 {
    public static void main(String[] args) {
        int income;
        System.out.println("Enter yout name :");
        Scanner sc=new Scanner(System.in);
        income =sc.nextInt();

//        if statement
        if(income>100000){
            System.out.println("you are rich");
        }
        else{
            System.out.println("you are not rich");
        }
        System.out.println("enter yout age");
        int age =sc.nextInt();

        if(age>=18){
            System.out.println("i am eligilbe to vote");
        }
    }
}
