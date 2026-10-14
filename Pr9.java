//Without a constructor

//class Student {
//    String name;
//    int age;
//}
//
//public class Pr9 {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//
//        s1.name = "Sai";
//        s1.age = 23;
//
//        System.out.println(s1.name);
//        System.out.println(s1.age);
//    }
//}

class Student {
    String name;
    int age;

    Student() {
        name = "Sai";
        age = 23;
    }
}
public class Pr9 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}