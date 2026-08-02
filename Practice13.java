class Student1 {
    private String name;
    private int marks;

    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    boolean isPassing() {
        return marks >= 40;
    }

    int getMarks() {
        return marks;
    }
}

public class Practice13 {
    public static void main(String[] args) {
        Student1[] students = new Student1[4];
        students[0] = new Student1("Sai", 85);
        students[1] = new Student1("Ravi", 32);
        students[2] = new Student1("Anu", 55);
        students[3] = new Student1("Priya", 91);

        int totalMarks = 0;

        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();

            if (students[i].isPassing()) {
                System.out.println("Status: Passing");
            } else {
                System.out.println("Status: Failing");
            }

            totalMarks = totalMarks + students[i].getMarks();
        }

        double average = (double) totalMarks / students.length;
        System.out.println("Class average marks: " + average);
    }
}