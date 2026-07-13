package com.engineerdigest.corejava;

public class launch2 {
    public static void main(String[] args) {
        String str = "happy journey";

        int indexA = str.indexOf('a');
        int indexE = str.indexOf('e');

        System.out.println("String: " + str);
        System.out.println("Index of 'a': " + indexA);
        System.out.println("Index of 'e': " + indexE);
    }
}