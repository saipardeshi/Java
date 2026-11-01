class Student79 {
    String name;
    static int count = 0;

    Student79(String name) {
        this.name = name;
        count++;
    }
}
public class Practice79 {
    public static void main(String[] args) {
        Student79 s1 = new Student79("sai");
        Student79 s2 = new Student79("ram");
        Student79 s3 = new Student79("amit");

        System.out.println("Total students: " + Student79.count);
    }
}