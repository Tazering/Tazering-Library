package com.tazering.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {
        final String BIG_O_COMPLEXITY = "O(log(n))";
        int value = 7;

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 3, 6, 3, 2, 0, 1, 6, 10, 17, 7));
        Collections.sort(arrayList);
        System.out.println("Binary Search Algorithm");
        System.out.println("Big O complexity: " + BIG_O_COMPLEXITY);
        System.out.println("ArrayList must be sorted first.");
        System.out.println("");

        System.out.println("Input: " + arrayList.toString());
        System.out.println("Using binary search algorithm to find: " + value);
        System.out.println("Running algorithm...");
        System.out.println("");

        System.out.println("Found value " + value + " at index " + binarySearch(arrayList, value));
    }

    public static int binarySearch(ArrayList<Integer> arr, int value) {
        return binarySearchAlgorithm(arr, 0, arr.size()-1, value);
    }

    public static int binarySearchAlgorithm(ArrayList<Integer> arr, int low, int high, int value) {
        //base case
        if(low > high) {
            return -1;
        }

        int mid = (low + high)/2;

        System.out.println("Mid Value: " + arr.get(mid));

        //recursive case
        if(arr.get(mid) == value) {
            return mid;
        } else if(arr.get(mid) < value) {

            low = mid + 1;

        } else {

            high = mid - 1;

        }

        return binarySearchAlgorithm(arr, low, high, value);
    }

}
