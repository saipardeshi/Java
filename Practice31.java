import java.util.Scanner;

public class Practice31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'u') {
                System.out.println("'" + word.charAt(i) + "' found at index: " + i);
            }
        }

        sc.close();
    }
}