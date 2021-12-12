package com.tazering.sort;

import javax.lang.model.element.Element;

public class MergeSort {

    public static void main(String[] args) {
        final String BIG_O_COMPLEXITY = "O(n^2)";

        int[] arr = {0, 2, 6, 1, 7, 8, 2, 14, 17, 20};
        System.out.println("Insertion Sort Algorithm");
        System.out.println("Big O complexity: " + BIG_O_COMPLEXITY);
        System.out.println("");

        System.out.println("Input: " + printArray(arr));
        System.out.println("Running algorithm...");
        System.out.println("");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted List: " + printArray(arr));
    }

    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
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
