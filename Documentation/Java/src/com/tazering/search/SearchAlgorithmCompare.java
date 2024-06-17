package com.tazering.search;

import java.util.ArrayList;

public class SearchAlgorithmCompare {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int value = 7;

        System.out.println("Input: " + printArray(arr));
        System.out.println("\nSequential Search...");
        System.out.println("Results in index: " + sequentialSearch(arr, value));

        System.out.println("");
        System.out.println("Binary Search...");
        System.out.println("Results in index: " + binarySearch(arr, value));

    }

    //sequential search
    public static int sequentialSearch(int[] arr, int value) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    //binary search
    public static int binarySearch(int[] arr, int value) {
        return binarySearchAlgorithm(arr, 0, arr.length - 1, value);
    }

    public static int binarySearchAlgorithm(int[] arr, int low, int high, int value) {
        //base case
        if(low > high) {
            return -1;
        }

        int mid = (low+high)/2;

        if(arr[mid] == value) {
            return mid;
        } else if(value < arr[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }

        return binarySearchAlgorithm(arr, low, high, value);

    }

    //helper
    public static String printArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for(int i = 0; i < arr.length - 1; i++) {
            stringBuilder.append(arr[i] + ", ");
        }

        stringBuilder.append(arr[arr.length - 1]);

        stringBuilder.append("]");

        return stringBuilder.toString();
    }


}
