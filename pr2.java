//here i have create class and in that addded student data
class Student5{
    String name="sai";
    int age=23;
//then here create a method ,we want to display the students details
void display() {
    System.out.println("Name:" + name);
    System.out.println("Name:" + age);
  }
}
//then here created main method
public class pr2 {
    public static void main(String[] args) {
//      Here created and object
        Student5 s1 =new Student5();
        s1.display();
    }
}
