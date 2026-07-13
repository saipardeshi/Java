package com.engineerdigest.corejava;

public class Launch5 {

    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 10, 3};
        int target = 10;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found");
        }
    }
}