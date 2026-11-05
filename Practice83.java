class MathUtil83 {
    static int square(int n) {
        return n * n;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

public class Practice83 {
    public static void main(String[] args) {
        System.out.println(MathUtil83.square(5));
        System.out.println(MathUtil83.isEven(8));
    }
}