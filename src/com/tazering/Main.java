package com.tazering;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 4, 2, 1, 4, 4, 4};

        ArrayList<Integer> uniqueValues = uniqueValues(input);

        if(uniqueValues.size() == input.length) {
            System.out.println(0);
        } else {
            System.out.println(largestValue(findListOfDistances(input, uniqueValues)));
        }
    }

    public static ArrayList<Integer> findListOfDistances(int[] input, ArrayList<Integer> uniqueValues) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> uniqueArr = uniqueValues(input);

        for(int i = 0; i < uniqueValues.size(); i++) {
            int[] minAndMax = firstAndLastIndex(input, uniqueArr.get(i));

            arr.add(minAndMax[1] - minAndMax[0] + 1);
        }

        return arr;
    }

    //Supplemental Classes
    public static ArrayList<Integer> uniqueValues(int[] input) {

        ArrayList<Integer> finalArr = new ArrayList<>();
        finalArr.add(input[0]);

        for(int i = 0; i < input.length; i++) {
            boolean foundDuplicate = false;

            for(int j = 0; j < finalArr.size(); j++) {

                if(input[i] == finalArr.get(j)) {
                    foundDuplicate = true;
                }

            }
            if(!foundDuplicate) {
                finalArr.add(input[i]);
            }

        }

        return finalArr;
    }

    public static int[] firstAndLastIndex(int[] input, int uniqueValue) {
        int[] finalV = new int[2];

        for(int i = 0; i < input.length; i++) {
            if(input[i] == uniqueValue) {
                finalV[0] = i;
                break;
            }
        }

        for(int i = input.length - 1; i >= 0; i--) {
            if(input[i] == uniqueValue) {
                finalV[1] = i;
                break;
            }
        }

        return finalV;
    }


    public static int largestValue(ArrayList<Integer> arr) {
        int largestValue = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > largestValue) {
                largestValue = arr.get(i);
            }
        }

        return largestValue;
    }

}