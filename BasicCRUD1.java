import java.util.Scanner;
import java.util.ArrayList;
public class BasicCRUD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter students name:");
            String name = sc.nextLine();
            students.add(name);
        }
        System.out.println("students:" + students);

        System.out.println("Enter index to update(0,1,2):");
        int index = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter new name: ");
        String newName = sc.nextLine();

        if (index >= 0 && index < students.size()) {
            students.set(index, newName);
            System.out.println("After update: " + students);
        } else {
            System.out.println("Invalid index!");
        }
        // Delete
        System.out.print("Enter name to delete: ");
        String deleteName = sc.nextLine();

        if (students.remove(deleteName)) {
            System.out.println("After delete: " + students);
        } else {
            System.out.println("Student not found!");
        }

        sc.close();
    }
}