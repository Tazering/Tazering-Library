package com.tazering.search;

public class Iteration {

    public static String findInteger(int[] arr, int targetValue) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == targetValue) {
                return String.valueOf(i);
            }
        }
        return "None Found";
    }

    public static String findChar(char[] arr, char targetValue) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == targetValue) {
                return String.valueOf(i);
            }
        }
        return "None Found";
    }

    public static String findDouble(double[] arr, double targetValue) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == targetValue) {
                return String.valueOf(i);
            }
        }
        return "None Found";
    }

    public static void displayInformatino() {
        System.out.println("Name: Linear Search");
        System.out.println("Big O Complexity: O(n)");
    }

}
