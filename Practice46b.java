import java.util.Scanner;

public class Practice46b {

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base: ");
        int base = sc.nextInt();

        System.out.println("Enter exponent: ");
        int exp = sc.nextInt();

        System.out.println(base + "^" + exp + " = " + power(base, exp));

        sc.close();
    }
}