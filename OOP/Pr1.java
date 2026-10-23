package OOP;
class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Pr1 {
    public static void main(String[] args) {
        Student s1=new Student("sai",23);
        Student s2 =new Student("ram",22);

        s1.display();
        s2.display();
    }
}
