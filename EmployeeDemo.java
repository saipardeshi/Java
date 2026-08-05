interface Payable {
    double calculateSalary();
}

abstract class Employee1 {
    private String name;
    private int id;

    public Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract String getRole();

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Role: " + getRole());
    }
}

class Manager extends Employee1 implements Payable {
    private double baseSalary;

    public Manager(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    public String getRole() {
        return "Manager";
    }

    public double calculateSalary() {
        return baseSalary + 5000;  // manager bonus
    }
}

class Developer extends Employee1 implements Payable {
    private double baseSalary;

    public Developer(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    public String getRole() {
        return "Developer";
    }

    public double calculateSalary() {
        return baseSalary + 2000;  // developer bonus
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee1[] employees = new Employee1[2];
        employees[0] = new Manager("Anita", 101, 40000);
        employees[1] = new Developer("Ravi", 102, 30000);

        for (Employee1 e : employees) {
            e.showDetails();
        }

        System.out.println();

        for (Employee1 e : employees) {
            Payable p = (Payable) e;
            System.out.println(e.getName() + "'s salary: " + p.calculateSalary());
        }
    }
}