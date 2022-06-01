package com.tazering.recursion;

public class fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        //base case
        if(n == 1 || n == 2) {
            return 1;
        } else { //recursive case
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
