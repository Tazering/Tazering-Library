package com.tazering.sort;

import java.util.ArrayList;

public class Insertion {
    public static void insertionSort(ArrayList<String> input) {

        for(int i = 0; i < input.size() - 1; i++) {
            for(int j = i + 1; j < input.size(); j++) {
                if(input.get(i).compareTo(input.get(j)) > 0) {
                    String temp = input.get(i);
                    input.set(i, input.get(j));
                    input.set(j, temp);
                }
            }
        }


    }

}
