public class Pr10 {
    String name;
    int salary;
    Pr10(String n, int s) {
        name = n;
        salary = s;
    }
    void display() {
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Pr10 e1 = new Pr10("Rahul", 30000);
        Pr10 e2 = new Pr10("Amit", 40000);

        e1.display();
        e2.display();
    }
}