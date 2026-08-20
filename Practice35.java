// Interview Question: Count how many times each number appears in an array
import java.util.HashMap;

public class Practice35 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : numbers) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        System.out.println("Frequency: " + freq);
    }
}