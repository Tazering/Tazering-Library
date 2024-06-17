package com.tazering.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        //base case
        if(n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }


    }

}
