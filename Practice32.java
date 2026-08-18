import java.util.Scanner;

public class Practice32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.print("Enter a character to search: ");
        char letter = sc.nextLine().charAt(0);

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                System.out.println("'" + letter + "' found at index: " + i);
            }
        }

        sc.close();
    }
}