public class Practice20 {
    public static void main(String[] args) {
        String word = "Programming";

        // Length of the string
        System.out.println("Length: " + word.length());

        // charAt() - get character at a specific index
        System.out.println("Character at index 0: " + word.charAt(0));
        System.out.println("Character at index 4: " + word.charAt(4));

        // indexOf() - find the index of a character/substring
        System.out.println("Index of 'g': " + word.indexOf('g'));
        System.out.println("Index of \"ram\": " + word.indexOf("ram"));

        // lastIndexOf() - find the LAST occurrence
        System.out.println("Last index of 'g': " + word.lastIndexOf('g'));

        // substring() - extract part of the string using indexes
        System.out.println("Substring(0,4): " + word.substring(0, 4));
        System.out.println("Substring(4): " + word.substring(4));

        // Looping through a string using indexes
        System.out.println("Each character with its index:");
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Index " + i + ": " + word.charAt(i));
        }
    }
}