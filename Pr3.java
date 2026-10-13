class student6{
    String name;
    int age;

    void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }
}
public class Pr3 {
    public static void main(String[] args) {
//        here student6 is a class name blueprint and s1 is reference varialbe that referns to the object
//        and new creates a new object in memory
        student6 s1 = new student6();
        s1.name="sai";
        s1.age=23;
//here student6 is blueprint (class) and new student() is creates a new object and s1 and s2 is two diff objects with theis own names and ages

        student6 s2 =new student6();
        s2.name="abhi";
        s2.age=22;

        student6 s3=new student6();
        s3.name="mehul";
        s3.age=23;


        s1.display();
        s2.display();
        s3.display();
    }
}
