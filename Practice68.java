public class Practice68 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum: " + sum);
    }
}