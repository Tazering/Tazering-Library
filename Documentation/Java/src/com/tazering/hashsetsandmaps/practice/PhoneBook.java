package com.tazering.hashsetsandmaps.practice;

import java.util.TreeMap;

public class PhoneBook {

    TreeMap<String, Integer> phoneBook;

    public static TreeMap<Integer, String> reverseBook(TreeMap<String, Integer> phoneBook) {
        TreeMap<Integer, String> reversePhoneBook = new TreeMap<>();

        for(String s: phoneBook.keySet()) {
            reversePhoneBook.put(phoneBook.get(s), s);
        }

        return reversePhoneBook;
    }

}
