// Interview Question: Find GCD (HCF) of two numbers using recursion (Euclid's algorithm)
public class Practice45 {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a; // base case
        }
        return gcd(b, a % b); // recursive case
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}