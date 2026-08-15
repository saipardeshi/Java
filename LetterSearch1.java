import java.util.Scanner;

public class LetterSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("Enter the letter to search for: ");
        char letter = sc.nextLine().charAt(0);

        boolean found = false;
        System.out.println("Positions of '" + letter + "' in \"" + word + "\":");

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                System.out.println("Found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Letter '" + letter + "' not found in the word.");
        }

        sc.close();
    }
}