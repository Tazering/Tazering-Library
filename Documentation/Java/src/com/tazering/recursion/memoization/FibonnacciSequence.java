package com.tazering.recursion.memoization;

import java.util.HashMap;
import java.util.Map;

public class FibonnacciSequence {

    private Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(new FibonnacciSequence().fibonacciSequence(10));
    }

    public  int fibonacciSequence(int n) {
        int result = 0;
        //base case
        if(n <= 0) {
            return 0;
        } else if(n <= 1) {
            return 1;
        } else { //recursive case
            if(memo.containsKey(n)) {
                System.out.printf("grabbing memo[%d]\n", n);
                return memo.get(n);
            }

            System.out.printf("computing fib(%d)\n", n);
            result = fibonacciSequence(n - 1) + fibonacciSequence(n - 2);

            memo.put(n, result);
        }

        System.out.println(memo);

        return result;
    }

}
