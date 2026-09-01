import java.util.Scanner;

public class Practice47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result = result + sentence.charAt(i);
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Without vowels: " + result);

        sc.close();
    }
}