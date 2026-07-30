import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("===== Simple Java Calculator =====");

        while (continueCalc) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exit");
            System.out.print("Enter choice (1-6): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1-6.");
                continue;
            }

            if (choice == 6) {
                System.out.println("Exiting calculator. Goodbye!");
                continueCalc = false;
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select between 1-6.");
                continue;
            }

            double num1, num2;
            try {
                System.out.print("Enter first number: ");
                num1 = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Enter second number: ");
                num2 = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number entered. Try again.");
                continue;
            }

            double result;
            String symbol;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    symbol = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    symbol = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    symbol = "*";
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    symbol = "/";
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Modulus by zero is not allowed.");
                        continue;
                    }
                    result = num1 % num2;
                    symbol = "%";
                    break;
                default:
                    continue;
            }

            System.out.printf("Result: %.2f %s %.2f = %.2f%n", num1, symbol, num2, result);

            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String again = scanner.nextLine().trim().toLowerCase();
            if (!again.equals("yes") && !again.equals("y")) {
                continueCalc = false;
                System.out.println("Exiting calculator. Goodbye!");
            }
        }

        scanner.close();
    }
}