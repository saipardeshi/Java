import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check the number is armstrong num or not ");
        int num=sc.nextInt();

        int originalNum =num;
        int sum=0;

        while(num>0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        if(sum == originalNum){
            System.out.println(originalNum +"num is armstrong");
        }else{
            System.out.println(originalNum+"num is not armstrong");
        }
        sc.close();
    }

}