import java.util.Scanner;
//Print All Factors and Sum of Factors
public class Practice50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sumOfFactors = 0;

        System.out.println("Factors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                sumOfFactors = sumOfFactors + i;
            }
        }

        System.out.println("Sum of all factors: " + sumOfFactors);

        sc.close();
    }
}