class Employee5{
    String name;
    int salary;

    void display(){
        System.out.println("name :"+name);
        System.out.println("salary :"+salary);
    }

}

public class Pr4 {
    public static void main(String[] args) {

        Employee5 e1=new Employee5();
        e1.name="sai";
        e1.salary=25000;

        Employee5 e2=new Employee5();
        e2.name="bhakti";
        e2.salary=30000;

        e1.display();
        e2.display();
    }
}
