package com.tazering;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

   public static void main(String[] args) {
      int[][] twoDArray = {{1, 2},{3, 4}};

      //print out 2D array
      for(int col = 0; col < twoDArray.length; col++) {


         for(int row = 0; row < twoDArray[col].length; row++) {

               System.out.println("Current value is: " + twoDArray[col][row]);
               System.out.println("Here is a set of values that is not chosen: ");
               printAllValuesNotIncludingCurrent(col, row, twoDArray);

            }
         System.out.println("");
         }

      //print out all values except the chosen

      }

      //print out all values that are not chosen
      public static void printAllValuesNotIncludingCurrent(int col, int row, int[][] array) {
            for(int c = 0; c < array.length; c++) {
               for(int r = 0; r < array[c].length; r++) {
                  if(c != col || r != row) {

                     //TODO: replace this print statement with you algorithm
                     System.out.println(array[c][r]);

                  }

               }
               }
            }
      }



