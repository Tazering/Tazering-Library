package com.tazering;


import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private boolean test;
    private boolean wonAward;

    public boolean isWonAward() {
        return wonAward;
    }

    public void setWonAward(boolean wonAward) {
        this.wonAward = wonAward;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public static void main(String[] args) {
        String a = new String("apple");
        String b = new String("apple");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

}
