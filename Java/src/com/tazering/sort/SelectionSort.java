package com.tazering.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
    public static void main(String[] args) {
        final String BIG_O_COMPLEXITY = "O(n^2)";

        int[] arr = {0, 2, 6, 1, 7, 8, 2, 14, 17, 20};
        System.out.println("Selection Sort Algorithm");
        System.out.println("Big O complexity: " + BIG_O_COMPLEXITY);
        System.out.println("");

        System.out.println("Input: " + printArray(arr));
        System.out.println("Running algorithm...");
        System.out.println("");

        selectionSort(arr);

        System.out.println("Sorted List: " + printArray(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int min_idx = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
