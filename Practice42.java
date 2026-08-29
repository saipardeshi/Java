import java.util.Scanner;

public class Practice42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int original = num;

        while (num != 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }

        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}