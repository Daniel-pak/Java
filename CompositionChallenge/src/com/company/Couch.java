package com.company;

/**
 * Created by danielpak on 4/13/17.
 */
public class Couch {
    private String color;
    private String type;
    private Dimensions dimensions;

    public Couch(String color, String type, Dimensions dimensions) {
        this.color = color;
        this.type = type;
        this.dimensions = dimensions;
    }

    public void sit(){
        System.out.println("Couch.sit() called");
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
