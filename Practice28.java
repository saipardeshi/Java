public class Practice28 {

    /*
    Build a simple traffic light simulator using switch.

Task:

Declare a String color variable with a value like "red", "yellow", or "green"
Use a switch statement on color to print:
"red" → "Stop"
"yellow" → "Get Ready"
"green" → "Go"
anything else → "Invalid signal"
Bonus: also print how many seconds each light typically lasts (e.g., red = 30 sec, yellow = 5 sec, green = 45 sec) using the same switch */
    public static void main(String[] args) {
        String color = "yellow";

        switch (color) {
            case "red":
                System.out.println("Stop");
                System.out.println("Duration: 30 seconds");
                break;
            case "yellow":
                System.out.println("Get Ready");
                System.out.println("Duration: 5 seconds");
                break;
            case "green":
                System.out.println("Go");
                System.out.println("Duration: 45 seconds");
                break;
            default:
                System.out.println("Invalid signal");
        }
    }
}