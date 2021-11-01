package com.tazering.hashsets.practice;

import java.util.HashSet;

public class PuppyNames {

    public static void main(String[] args) {

    }

    public HashSet<String> names(HashSet<String> cards, HashSet<String> topNames) {
        HashSet<String> newNames = new HashSet<>();

        for(String name : cards) {
            if(!topNames.contains(name)) {
                newNames.add(name);
            }
        }

        return newNames;
    }

}
