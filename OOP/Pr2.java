package OOP;

class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class Pr2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("sai", 20000);
        System.out.println(e1.getName() + " " + e1.getSalary());

        e1.setSalary(25000);
        System.out.println(e1.getName() + " " + e1.getSalary());

        e1.setSalary(-500);
        System.out.println(e1.getName() + " " + e1.getSalary());
    }
}