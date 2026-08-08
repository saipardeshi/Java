import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age =sc.nextInt();

        System.out.println("Enter your float:");
        float f=sc.nextFloat();

        System.out.println("Enter your BigInteger :");
        BigInteger bg= sc.nextBigInteger();

        System.out.println("My age is: "+age);
        System.out.println("My float is "+f);
        System.out.println("My BigInteger is:"+bg);

        sc.close();

    }

}
