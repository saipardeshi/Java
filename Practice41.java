import java.util.Scanner;

public class Practice41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Enter how many rows (e.g. 10): ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}