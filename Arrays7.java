public class Arrays7 {
    public static void main(String[] args) {

        // 1. Declaration & initialization
        int[] arr = {12, 45, 3, 67, 23, 89, 1, 56};

        // 2. Traverse
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. Find max & min
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);

        // 4. Sum & Average
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum + ", Avg: " + (double) sum / arr.length);

        // 5. Reverse array
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Reversed: ");
        printArray(reversed);

        // 6. Linear search
        int target = 67;
        int index = linearSearch(arr, target);
        System.out.println(target + " found at index: " + index);

        // 7. Bubble sort
        int[] sorted = arr.clone();
        bubbleSort(sorted);
        System.out.print("Sorted: ");
        printArray(sorted);

        // 8. Binary search (needs sorted array)
        int bIndex = binarySearch(sorted, target);
        System.out.println(target + " found at index (binary search): " + bIndex);

        // 9. Second largest
        System.out.println("Second largest: " + secondLargest(arr));

        // 10. Count even/odd
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even: " + evenCount + ", Odd: " + oddCount);

        // 11. Remove duplicates (using a simple approach)
        int[] withDup = {1, 2, 2, 3, 4, 4, 5};
        System.out.print("Without duplicates: ");
        removeDuplicates(withDup);

        // 12. 2D array example
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int binarySearch(int[] sortedArr, int target) {
        int low = 0, high = sortedArr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArr[mid] == target) return mid;
            else if (sortedArr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    static void removeDuplicates(int[] arr) {
        java.util.LinkedHashSet<Integer> set = new java.util.LinkedHashSet<>();
        for (int num : arr) set.add(num);
        for (int num : set) System.out.print(num + " ");
        System.out.println();
    }
}