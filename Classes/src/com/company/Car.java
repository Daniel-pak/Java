package com.company;

public class Car { //this is a new class named car //public is unrestricted access to this class -- protected/ private are also available for use
    // variables can be accessed --> class or member variables --> fields
    private int doors; //generally we'll add private --> the state of the car
    private int wheels;
    private String model;
    private String engine; //class in a class because String is a class
    private String color; // don't allow class outside of car class to access these variables --> private

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carerra") || validModel.equals("commodore")) //equals tests String value
            this.model = model;
        else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
