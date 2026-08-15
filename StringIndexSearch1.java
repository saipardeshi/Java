import java.util.Scanner;

public class StringIndexSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many words do you want to enter?");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter word " + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        System.out.println("Enter the word you want to find the index of: ");
        String target = sc.nextLine();

        int foundIndex = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("\"" + target + "\" found at index: " + foundIndex);
        } else {
            System.out.println("\"" + target + "\" not found in the array.");
        }

        sc.close();
    }
}