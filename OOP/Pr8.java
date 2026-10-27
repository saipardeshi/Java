
package OOP;

class Department {
    String name = "Computer";
}

class College {
    Department department;

    College(Department department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Department d = new Department();
        College c = new College(d);

        System.out.println(c.department.name);
    }
}
