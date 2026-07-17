import java.util.Scanner;

public class Practice4 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name:");
        String name =sc.nextLine();

        System.out.println("Enter your age ");
        int age=sc.nextInt();

        System.out.println("Enter your height in meters: ");
        double height =sc.nextDouble();

        System.out.println("Helloo "+name +"! You are "+age +" years old boy and "+height+"m tall.");

        sc.close();
    }
}
