public class Practice30 {


    /*
    Task: Loop from 1 to 50. Use continue to skip any number that is divisible by 4, and use break to stop completely once you find a number greater than 30 that is divisible by 7.

This combines two conditions per rule (not just a simple i % n == 0 check like before) — good practice for reading and writing slightly more complex loop conditions. Try it yourself in IntelliJ first, or ask for the complete code if you'd like to see the solution directly.
    */
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i > 30 && i % 7 == 0) {
                break;
            }
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}