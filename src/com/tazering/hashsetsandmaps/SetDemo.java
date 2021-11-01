package com.tazering.hashsets;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        ArrayList<String> menu1 = new ArrayList<>();
        menu1.add("fries");
        menu1.add("burger");
        menu1.add("tots");

        CornerRestaurant cr1 = new CornerRestaurant(-1, menu1, "Boylan Heights");

        ArrayList<String> menu2 = new ArrayList<>();
        menu2.add("salad");
        menu2.add("caesar salad");
        menu2.add("salad");
        CornerRestaurant cr2 = new CornerRestaurant(9, menu2, "Roots");

        HashSet<CornerRestaurant> guide = new HashSet<>();
        guide.add(cr1);
        guide.add(cr2);
        guide.add(cr2);

        for (CornerRestaurant cr : guide) {
            System.out.println(cr.getName());
        }
    }
}
