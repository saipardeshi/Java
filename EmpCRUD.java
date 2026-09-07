import java.util.ArrayList;
import java.util.Scanner;


// Stores employee data
class EmployeeData {

    int id;
    String name;
    double salary;


    // Constructor
    EmployeeData(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    // Prints employee details
    public String toString() {

        return "ID: " + id +
                ", Name: " + name +
                ", Salary: " + salary;
    }
}


// Main CRUD class
public class EmpCRUD {

    // ArrayList stores EmployeeData objects
    static ArrayList<EmployeeData> employees = new ArrayList<>();

    // Scanner for user input
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int choice;

        // Keep running until user selects 5
        do {

            System.out.println("\n--- Employee CRUD System ---");

            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();


            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    updateEmployee();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    System.out.println("Program Closed!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }


    // ========== CREATE ==========
    public static void addEmployee() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();


        // Create object
        EmployeeData employee = new EmployeeData(id, name, salary);

        // Add object to ArrayList
        employees.add(employee);

        System.out.println("Employee Added Successfully!");
    }


    // ========== READ ==========
    public static void viewEmployees() {

        // Check if list is empty
        if (employees.isEmpty()) {

            System.out.println("No Employees Found!");

        } else {

            // Print all employees
            for (EmployeeData employee : employees) {

                System.out.println(employee);
            }
        }
    }


    // ========== UPDATE ==========
    public static void updateEmployee() {

        System.out.print("Enter Employee ID to Update: ");
        int id = sc.nextInt();


        // Find employee by ID
        for (EmployeeData employee : employees) {

            if (employee.id == id) {

                System.out.print("Enter New Name: ");
                employee.name = sc.next();

                System.out.print("Enter New Salary: ");
                employee.salary = sc.nextDouble();

                System.out.println("Employee Updated Successfully!");

                return;
            }
        }

        System.out.println("Employee Not Found!");
    }


    // ========== DELETE ==========
    public static void deleteEmployee() {

        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();


        // Find employee by ID
        for (EmployeeData employee : employees) {

            if (employee.id == id) {

                employees.remove(employee);

                System.out.println("Employee Deleted Successfully!");

                return;
            }
        }

        System.out.println("Employee Not Found!");
    }
}