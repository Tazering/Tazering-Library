package quickselect;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] example = {10, 7, 12, 6, 3, 2, 8};
        quickSort(example, 0, example.length - 1);

        printArray(example);


    }

    public static int[] quickSort(int[] arr, int start, int end) {
        int n = end - start;

        if(n <= 1) { //base case
            return arr;
        } else { //recursive case
            int pivot = partition(arr, start, end);

            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);

            return arr;
        }

    }

    public static int partition(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int c = 0;
        int p = 0;

        //put pivot into the end
        swap(arr, mid, end);
        int value = arr[end];

        while(p < end) {
            if(arr[p] < value) {
                swap(arr, c, p);
                c++;
            }
            p++;
        }

        swap(arr, end, c);

        return c;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        System.out.print("[" + arr[0]);

        for(int i = 1; i < arr.length - 1; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.println(" " + arr[arr.length - 1] + "]");

    }

}
