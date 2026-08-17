import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        // Creating a HashMap: key = String, value = Integer
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Adding key-value pairs
        studentMarks.put("Sai", 85);
        studentMarks.put("Ravi", 72);
        studentMarks.put("Anu", 90);

        System.out.println("All marks: " + studentMarks);

        // Getting a value by key
        System.out.println("Sai's marks: " + studentMarks.get("Sai"));

        // Checking if a key exists
        System.out.println("Contains Ravi? " + studentMarks.containsKey("Ravi"));

        // Updating a value (just put again with same key)
        studentMarks.put("Sai", 95);
        System.out.println("Sai's updated marks: " + studentMarks.get("Sai"));

        // Removing a key-value pair
        studentMarks.remove("Ravi");
        System.out.println("After removing Ravi: " + studentMarks);

        // Looping through all keys and values
        System.out.println("All students:");
        for (String name : studentMarks.keySet()) {
            System.out.println(name + " -> " + studentMarks.get(name));
        }
    }
}