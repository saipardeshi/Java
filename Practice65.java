public class Practice65 {
    public static void main(String[] args) {
        int num = 123;
        boolean isPalindrome = true;
        int temp = num, reversed = 0;

        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        if (reversed != num) {
            isPalindrome = false;
        }

        System.out.println(num + " palindrome? " + isPalindrome);
    }
}