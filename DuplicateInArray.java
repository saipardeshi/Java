import java.util.*;
import java.util.stream.Collectors;

public class DuplicateInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 5};

        Set<Integer> unique = new HashSet<>();

        Set<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .filter(num -> !unique.add(num))
                .collect(Collectors.toSet());

        System.out.println("Duplicate Elements: " + duplicates);
    }
}