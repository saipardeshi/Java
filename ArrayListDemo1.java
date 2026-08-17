import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits: " + fruits);

        // Accessing an element by index
        System.out.println("First fruit: " + fruits.get(0));

        // Size of the list
        System.out.println("Total fruits: " + fruits.size());

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Removing by index
        fruits.remove(0);
        System.out.println("After removing index 0: " + fruits);

        // Adding more elements
        fruits.add("Grapes");
        fruits.add("Orange");
        System.out.println("Final list: " + fruits);

        // Checking if an element exists
        System.out.println("Contains Grapes? " + fruits.contains("Grapes"));

        // Looping through an ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}