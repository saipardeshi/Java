package com.engineerdigest.corejava;

public class Launch4 {

    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 10, 3};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
    }
}