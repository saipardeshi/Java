public class Strings2 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        // 1. Print total length of the sentence
        System.out.println("Length: " + sentence.length());

        // 2. Split the sentence into words
        String[] words = sentence.split(" ");

        // 3. Print total number of words
        System.out.println("Word count: " + words.length);

        // 4. Print each word using a for-each loop
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 5. Check if sentence starts with "Java"
        System.out.println("Starts with 'Java': " + sentence.startsWith("Java"));

        // 6. Check if sentence ends with "language"
        System.out.println("Ends with 'language': " + sentence.endsWith("language"));

        // 7. Replace "powerful" with "popular"
        String updated = sentence.replace("powerful", "popular");
        System.out.println("Updated sentence: " + updated);

        // 8. Find the index of the word "programming"
        System.out.println("Index of 'programming': " + sentence.indexOf("programming"));
    }
}