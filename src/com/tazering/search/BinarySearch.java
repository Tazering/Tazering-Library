package com.tazering.search;

import java.util.ArrayList;

public class BinarySearch {

    public static int binarySearch(int upper, int lower, ArrayList<String> elements, String target) {
        int mid = (upper + lower)/2;

        //base case
        if(upper < lower) {
            return -1;
        } else if(target.equals(elements.get(mid))) {
            return mid;
        }

        //recursive case
        if(target.compareTo(elements.get(mid)) > 0) {
            return binarySearch(upper, mid + 1, elements, target);
        }

        if(target.compareTo(elements.get(mid)) < 0) {
            return binarySearch(mid - 1, lower, elements, target);
        }

        return -1;

    }

}
