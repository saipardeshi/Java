package com.engineerdigest.corejava;

public class student {
    private String name;
    private int age;
    private double marks;

    public student(String name, int age, double marks) {
        this.name = name;
        setAge(age);
        setMarks(marks);
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.out.println("Invalid age");
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) this.marks = marks;
        else System.out.println("Invalid marks");
    }
}