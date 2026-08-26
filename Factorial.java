import java.util.Scanner;

public class Factorial {

    // Recursive method
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Iterative method
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial using Iterative method: " + factorial);

        // Recursive method
        int result = factorialRecursive(num);

        System.out.println("Factorial using Recursive method: " + result);

        sc.close();
    }
}