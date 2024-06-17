package com.tazering.test;

public class Animal {

    private int numberOfLegs;
    private int numberOfArms;
    private String classification;

    public Animal() {
        this.numberOfArms = 0;
        this.numberOfLegs = 0;
        this.classification = "mammal";
    }

    public Animal(int numberOfLegs, int numberOfArms, String classification) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfArms = numberOfArms;
        this.classification = classification;
    }
}
