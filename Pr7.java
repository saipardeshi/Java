
class Student10 {
    String name;
    int maths;
    int science;
    int english;

    void display() {
        int total = maths + science + english;
        double average = total / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Total is: " + total);
        System.out.println("Average is: " + average);
    }
}

public class Pr7 {
    public static void main(String[] args) {
        Student10 s1 = new Student10();

        s1.name = "sai";
        s1.maths = 100;
        s1.science = 80;
        s1.english = 90;

        s1.display();
    }
}
