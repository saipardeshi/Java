package OOP;
class student{
    String name="sai";
    int age=23;

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Pr5 {
    public static void main(String[] args) {
        student s=new student();
        s.display();
    }
}
