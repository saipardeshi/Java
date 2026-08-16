public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        // Example 1: ArrayIndexOutOfBoundsException
        try {
            System.out.println(numbers[5]); // invalid index!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: That index doesn't exist in the array.");
        }

        // Example 2: ArithmeticException (divide by zero)
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // Example 3: NumberFormatException
        try {
            String text = "abc";
            int num = Integer.parseInt(text); // "abc" isn't a valid number
        } catch (NumberFormatException e) {
            System.out.println("Error: That's not a valid number.");
        }

        System.out.println("Program continues running normally after errors!");
    }
}