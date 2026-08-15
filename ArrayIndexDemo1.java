public class ArrayIndexDemo1 {
    public static void main(String[] args) {
        int[] nums = {45, 12, 78, 3, 90, 23};

        // Basic indexing
        System.out.println("First element: " + nums[0]);
        System.out.println("Last element: " + nums[nums.length - 1]);

        // Finding index of a value (linear search)
        int target = 78;
        int foundIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Index of " + target + ": " + foundIndex);

        // Finding the index of the MAX value
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Max value " + nums[maxIndex] + " found at index " + maxIndex);

        // Swapping two elements by index
        int temp = nums[0];
        nums[0] = nums[5];
        nums[5] = temp;
        System.out.println("After swapping index 0 and 5:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Accessing an invalid index - causes a runtime error
        // System.out.println(nums[10]); // ArrayIndexOutOfBoundsException
    }
}