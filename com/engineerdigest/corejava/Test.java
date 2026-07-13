package com.engineerdigest.corejava;

public class Test {
    public static void main(String[] args) {
        student s1 = new student("Sneha", 20, 85.5);

        System.out.println(s1.getName() + " - Age: " + s1.getAge() + " - Marks: " + s1.getMarks());

        s1.setAge(-5);
        s1.setMarks(150);

        s1.setAge(21);
        System.out.println("Updated age: " + s1.getAge());
    }
}