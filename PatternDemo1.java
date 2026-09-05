public class PatternDemo1 {
    public static void main(String[] args) {
        int rows = 5;
        // Pattern 1: Simple square/rectangle of stars
        System.out.println("Pattern 1 - Rectangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Pattern 2: Right-angled triangle
        System.out.println("Pattern 2 - Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3: Inverted triangle
        System.out.println("Pattern 3 - Inverted Triangle:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Pattern 4: Number triangle
        System.out.println("Pattern 4 - Number Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}