package com.tazering.dataAnalysis;

public class Calculator {

    public static void main(String[] args) {
        double[] arr = {40.11, 37.69, 38.69, 37.74, 38.35};

        System.out.println(calculateStdDeviation(arr));

    }

    //Calculate Standard Deviation
    public static double calculateStdDeviation(double[] arr) {
        //find the average
        double sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum/arr.length;

        //calculate standard deviation
        sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum+= Math.pow((arr[i] - average), 2);
        }

        return Math.sqrt(sum/(arr.length - 1));
    }

}
