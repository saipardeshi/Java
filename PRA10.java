class Student78 {
    String name;
    int age;

    Student78(String n, int a) {
        name = n;
        age = a;

    }
}
public class PRA10 {
    public static void main(String[] args) {
        Student78 s1 =new Student78("sai",23);
        Student78 s2 =new Student78("rahul",22);

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
