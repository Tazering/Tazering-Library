package closestPairOfPoints;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static final String TEST_CASE_1 = "C:/Users/tyler/dev/Tazering-Library/Data-Structures-and-Algorithms/Divide-And-Conquer/src/closestPairOfPoints/test-case-1.txt";
    static Star[] stars;
    static Star[] X;
    static Star[] Y;

    public static void main(String[] args) {
        ArrayList<String> parsedFile = new ArrayList<>();
       parsedFile = grabTestCaseFromFile(TEST_CASE_1);

        //submission
//        Scanner input = new Scanner(System.in);
//        while(input.hasNextLine()) {
//            String data = input.nextLine();
//            parsedFile.add(data);
//        }


        while(!parsedFile.isEmpty()) {
            stars = getStarsArray(parsedFile);

            if(stars.length == 0) {
                continue;
            }
            X = copyArray(stars);
            Y = copyArray(stars);

            Arrays.sort(X, new CompareStarByX());
            Arrays.sort(Y, new CompareStarByY());

            double delta = getClosestDistance(0, stars.length);

            if(delta < 10000) {
                System.out.println(String.format("%.4f", delta));
            } else {
                System.out.println("infinity");
            }

        }

    }

    //algorithm
    public static double getClosestDistance(int start, int end) {
        double delta;
        int n = end - start;
        int mid = (start + end)/2;
        //base case
        if(n <= 3) {

            return bruteForce(Arrays.copyOfRange(X, start, end));

        } else { //recursive case

            double deltaL = getClosestDistance(start, mid);
            double deltaR = getClosestDistance(mid, end);

            delta = minimum(deltaL, deltaR);

            Star[] yPrime = getStrip(delta, mid);

            double deltaC = compareNextSeven(yPrime);

            delta = minimum(delta, deltaC);

        }

        return delta;

    }

    public static double bruteForce(Star[] stars) {
        double shortestDistance = Double.MAX_VALUE;

        for(int i = 0; i < stars.length; i++) {
            for(int j = i; j < stars.length; j++) {

                double curDistance = euclideanDistance(stars[i], stars[j]);

                if(curDistance < shortestDistance && i != j) {
                    shortestDistance = curDistance;
                }
            }
        }

        return shortestDistance;
    }

    public static double compareNextSeven(Star[] starsArr) {
        double delta = Double.MAX_VALUE;

        for(int j = 0; j < starsArr.length; j++) {
            int i = 0;

            for(int k = j; k < starsArr.length; k++) {

                if(i >= 7) {
                    break;
                }

                double temp = euclideanDistance(starsArr[j], starsArr[k]);

                if(temp < delta && j != k) {
                    delta = temp;
                }

                i++;
            }
        }

        return delta;
    }

    public static double euclideanDistance(Star s1, Star s2) {
        double deltaX = Math.abs(s1.getX_coordinate() - s2.getX_coordinate());
        double deltaY = Math.abs(s1.getY_coordinate() - s2.getY_coordinate());

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public static double minimum(double x, double y) {
        if(x > y) {
            return y;
        }

        return x;
    }

    public static Star[] getStrip(double delta, int mid) {
        ArrayList<Star> temp = new ArrayList<>();

        for(Star s : Y) {
            if(isWithinDelta(delta, mid, s.getX_coordinate())) {
                temp.add(s);
            }
        }

        Star[] output = convertArrayListToArray(temp);

        return output;
    }

    public static boolean isWithinDelta(double delta, double x, double y) {
        return delta <= Math.abs(x - y);
    }

    //helper
    public static Star[] getStarsArray(ArrayList<String> parsedFile) {
        int n = Integer.parseInt(parsedFile.get(0));
        parsedFile.remove(0);

        Star[] output = new Star[n];

        for(int i = 0; i < n; i++) {
            String[] coordinates = parsedFile.get(0).split(" ");
            output[i] = new Star(Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]));
            parsedFile.remove(0);
        }

        return output;
    }

    public static Star[] copyArray(Star[] starsArray) {
        Star[] output = new Star[starsArray.length];

        for(int i = 0; i < starsArray.length; i++) {
            output[i] = starsArray[i];
        }

        return output;
    }

    public static Star[] convertArrayListToArray(ArrayList<Star> starsArr) {
        Star[] output = new Star[starsArr.size()];

        for(int i = 0; i < starsArr.size(); i++) {
            output[i] = starsArr.get(i);
        }

        return output;
    }

    //test
    public static ArrayList<String> grabTestCaseFromFile(String path) {
        File file = new File(path);
        ArrayList<String> output = new ArrayList<>();

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                output.add(data);
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }

        return output;
    }

    public static void printArrayList(ArrayList<String> arrayList) {
        for(String s: arrayList) {
            System.out.println(s);
        }
    }

    public static void printStarsArray(Star[] stars) {
        for(Star s : stars) {
            s.printStar();
        }
    }

}
