package com.tazering.hashsetsandmaps;

import java.util.ArrayList;

public class CornerRestaurant {

    private int rating;
    private ArrayList<String> menu;
    private String name;

    public CornerRestaurant() {
        rating = 0;
        menu = new ArrayList<>();
        name = "no name";
    }

    public CornerRestaurant(int rating, ArrayList<String> menu, String name) {
        this.rating = rating;
        this.menu = menu;
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }

        if(o instanceof CornerRestaurant) {
            CornerRestaurant r1 = (CornerRestaurant) o;

            return this.menu.equals(r1.getMenu()) && this.name.equals(r1.getName()) && this.rating == r1.getRating();
        }
        return false;
    }
}
