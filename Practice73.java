import java.util.HashSet; // Import HashSet class
public class Practice73 {
    public static void main(String[] args) {
        // Create a HashSet to store Integer values
        HashSet<Integer> set = new HashSet<>();
        set.add(1); // Add 10 to the set
        set.add(20); // Add 20 to the set
        set.add(10); // Duplicate 10 will NOT be added
        set.add(30); // Add 30 to the set
        // Print all elements (order is not guaranteed)
        System.out.println(set);
        // Print the number of unique elements
        System.out.println("Size: " + set.size());
        // Check whether 20 exists in the set
        System.out.println("Has 20? " + set.contains(20));
    }
}