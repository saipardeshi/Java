public class Practice62
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    seen = true;
                    break;
                }
            }
            if (!seen) count++;
        }

        System.out.println("Unique count: " + count);
    }
}