import java.util.Scanner;
//Print Squares and Cubes from 1 to n
public class Practice49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Squares from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " squared = " + (i * i));
        }

        System.out.println("Cubes from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " cubed = " + (i * i * i));
        }

        sc.close();
    }
}