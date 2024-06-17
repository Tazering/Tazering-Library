package com.tazering.hashsetsandmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class MapDemo {

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

        TreeMap<String, CornerRestaurant> mapGuide = new TreeMap<>();
        mapGuide.put("Roots", cr2);
        mapGuide.put("Boylan Heights", cr1);


        for(String s : mapGuide.keySet()) {
            System.out.println("This is the key: " + s);
            System.out.println("Map Guide: " + mapGuide.get(s));
        }

        HashMap<String, CornerRestaurant> mapGuide2 = new HashMap<>();
        mapGuide2.put("Roots", cr2);
        mapGuide2.put("Boylan Heights", cr1);

        System.out.println("");

        for(String s: mapGuide2.keySet()) {
            System.out.println("This is the key: " + s);
            System.out.println("Map Guide: " + mapGuide2.get(s));
        }


//        for (CornerRestaurant cr : guide) {
//            System.out.println(cr.getName());
//        }
    }

}
