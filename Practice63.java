public class Practice63 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 3, 1, 4, 2};
        int[] freq = new int[arr.length];
        int maxCount = 0, maxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) count++;
            }
            freq[i] = count;
            if (count > maxCount) {
                maxCount = count;
                maxVal = arr[i];
            }
        }

        System.out.println("Most frequent: " + maxVal + " (count " + maxCount + ")");
    }
}