package com.tazering.Homework1;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int x = input.nextInt();

        System.out.println("Enter the second number: ");
        int y = input.nextInt();

        System.out.println("Enter the Operator: ");
        String operator = input.next();

        switch(operator) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            case "%":
                System.out.println(x % y);
                break;
            default:
                break;

        }
    }

}
