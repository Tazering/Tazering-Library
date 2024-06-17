package com.tazering.Interfaces.Practice;


public class Cuboid implements Solids {

    private double length, width, height;

    private String color, name;

    public Cuboid(double length, double width, double height, String color, String name){
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.name = name;
    }

    @Override
    public double getVolume() {
        return this.length * this.width * this.height;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Volume = length*width*height

}
