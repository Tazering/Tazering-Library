package com.tazering.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Rabbit implements Comparable<Rabbit> {

    private int numberOfKittens;
    private double screamVolume;

    public Rabbit() {
        numberOfKittens = 0;
        screamVolume = 0.0;
    }

    public static void main(String[] args) {
        ArrayList<Rabbit> myPen = new ArrayList<>();
        Collections.sort(myPen, new YellSorter());
    }

    @Override
    public int compareTo(Rabbit o) {

        if(this.numberOfKittens > o.getNumberOfKittens()) {
            return o.getNumberOfKittens() - this.numberOfKittens;
        } else if(this.numberOfKittens < o.getNumberOfKittens()) {
            return this.numberOfKittens - o.getNumberOfKittens();
        }

        return 0;
    }

    public int getNumberOfKittens() {
        return numberOfKittens;
    }

    public void setNumberOfKittens(int numberOfKittens) {
        this.numberOfKittens = numberOfKittens;
    }

    public double getScreamVolume() {
        return this.screamVolume;
    }

    public void setScreamVolume(double screamVolume) {
        this.screamVolume = screamVolume;
    }

}
