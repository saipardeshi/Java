public class TwoDArrayDemo1 {
    public static void main(String[] args) {
        // Creating a 2D array (3 rows, 3 columns)
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing a specific element: grid[row][column]
        System.out.println("Element at row 1, col 2: " + grid[1][2]);

        // Printing the whole grid using nested loops
        System.out.println("Full grid:");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println(); // new line after each row
        }

        // Calculating the sum of all elements
        int sum = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                sum += grid[row][col];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}