package com.tazering.abstraction.practice;
/**
 *
 * @author CS 2110 Faculty
 * Vet class, where all domesticated animals must visit
 *
 */
public class Vet {

    // TODO The following method is incomplete; you need to fix it to:
    // a) take an animal argument and b) have the animal make its noise
    public static void giveShot() {
        // do horrible things to the animal
        System.out.print(" after the shot cried ");

    }

    public static void main(String[] args) {
        Animal a = new Dog("Jack");
        Animal b = new Cat("Garfield");
        Animal c = new Animal("Marlow");
        String aType = a.getClass().getTypeName();
        String bType = b.getClass().getName();
        String cType = c.getClass().getName();
        // TODO Complete the rest of the code to print the following output:
        System.out.print(aType + " " + a.name);
        giveShot();
        System.out.println(a.makeNoise());

        System.out.print(bType + " " + b.name);
        giveShot();
        System.out.println(b.makeNoise());

        System.out.print(cType + " " + c.name);
        giveShot();
        System.out.println(c.makeNoise());
        // > Dog Jack after the shot cried Woof!
        // > Cat Garfield after the shot cried Miaw!
        // > Animal Marlow after the shot cried ...

    }

}

