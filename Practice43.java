public class Practice43 {
    public static void main(String[] args) {
        int num = 5678;
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }

        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);
    }
}