public class StringArrayDemo {
    public static void main(String[] args) {
        // 1. Declaration + initialization
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        // 2. Declare first, assign later
        String[] cities = new String[3];
        cities[0] = "Pune";
        cities[1] = "Mumbai";
        cities[2] = "Nagpur";

        // 3. Loop through with index
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // 4. Enhanced for-each loop
        for (String city : cities) {
            System.out.println(city);
        }

        // 5. Common operations
        System.out.println("Length: " + fruits.length);

        // Sort
        java.util.Arrays.sort(fruits);
        System.out.println("Sorted: " + java.util.Arrays.toString(fruits));

        // Search
        int index = java.util.Arrays.asList(fruits).indexOf("Mango");
        System.out.println("Mango found at index: " + index);

        // Convert array to a single String
        String joined = String.join(", ", fruits);
        System.out.println("Joined: " + joined);

        // Convert String to array (split)
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("Word count: " + words.length);
    }
}