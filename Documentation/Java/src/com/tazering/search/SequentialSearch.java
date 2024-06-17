package com.tazering.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SequentialSearch {

    public static void main(String[] args) {
        final String BIG_O_COMPLEXITY = "O(n)";
        int value = 7;

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 3, 6, 3, 2, 7, 1, 6, 10, 17));

        System.out.println("Sequential Search Algorithm");
        System.out.println("Big O complexity of: " + BIG_O_COMPLEXITY);
        System.out.println("");

        System.out.println("Input: " + arrayList.toString());
        System.out.println("Using sequential search algorithm to find: " + value);
        System.out.println("Running algorithm...");

        System.out.println("");
        System.out.println("Found value: " + value + " at index " + sequentialSearch(arrayList, value));
    }

    public static int sequentialSearch(ArrayList<Integer> arrayList, int value) {
        for(int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) == value) {
                return i;
            }
        }

        return -1;
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
