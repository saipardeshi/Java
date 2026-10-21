public class Pr11 {
    public static void main(String[] args) {
        // Outer loop: Controls the rows from A to E
        for(char i='A';i<='E';i++){
            // Inner loop: Prints letters from A up to the current row letter
            for(char j='A';j<=i;j++){
                // Prints the current character on the same line
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
