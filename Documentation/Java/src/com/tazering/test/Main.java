package com.tazering.test;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Animal> test = new HashSet<Animal>();

        Animal animal0 = new Animal();
        Dog dog0 = new Dog();
        Cat cat0 = new Cat();
        Kitten kitten0 = new Kitten();

        test.add(animal0);
        test.add(dog0);
        test.add(cat0);
        test.add(kitten0);
        
            System.out.println(test);

    }

}
