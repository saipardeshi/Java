abstract class Employee76 {
    String name;

    Employee76(String name) {
        this.name = name;
    }

    abstract int salary();

    void show() {
        System.out.println(name + " earns " + salary());
    }
}

class FullTime76 extends Employee76 {
    FullTime76(String name) {
        super(name);
    }

    int salary() {
        return 30000;
    }
}

class PartTime76 extends Employee76 {
    int hours;

    PartTime76(String name, int hours) {
        super(name);
        this.hours = hours;
    }
    int salary() {
        return hours * 200;
    }
}
public class Practice76 {
    public static void main(String[] args) {
        Employee76 e1 = new FullTime76("sai");
        Employee76 e2 = new PartTime76("ram", 50);
        e1.show();
        e2.show();
    }
}