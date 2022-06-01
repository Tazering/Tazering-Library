package com.tazering.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        final String BIG_O_COMPLEXITY = "O(n^2)";

        int[] arr = {0, 2, 6, 1, 7, 8, 2, 14, 17, 20};
        System.out.println("Insertion Sort Algorithm");
        System.out.println("Big O complexity: " + BIG_O_COMPLEXITY);
        System.out.println("");

        System.out.println("Input: " + printArray(arr));
        System.out.println("Running algorithm...");
        System.out.println("");

        insertionSort(arr);

        System.out.println("Sorted List: " + printArray(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
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
