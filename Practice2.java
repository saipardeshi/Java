import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Practice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Employee CRUD Operation =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Read Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, salary));

                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No Employees Found.");
                    } else {
                        System.out.println("\nEmployee List:");
                        for (Employee e : employees) {
                            System.out.println("ID: " + e.id +
                                    " | Name: " + e.name +
                                    " | Salary: " + e.salary);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    boolean updated = false;

                    for (Employee e : employees) {
                        if (e.id == updateId) {

                            System.out.print("Enter New Name: ");
                            e.name = sc.nextLine();

                            System.out.print("Enter New Salary: ");
                            e.salary = sc.nextDouble();

                            updated = true;
                            System.out.println("Employee Updated Successfully!");
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).id == deleteId) {
                            employees.remove(i);
                            deleted = true;
                            System.out.println("Employee Deleted Successfully!");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
    }
}