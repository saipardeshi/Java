
package OOP;

class student1 {
    int id;

    student1(int id) {
        this.id = id;
    }
}

public class Pr7 {
    public static void main(String[] args) {

        student1 s1 = new student1(101);
        student1 s2 = new student1(102);
        student1 s3 = new student1(101);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
