package com.company;

public class Main { //this is a statement that creates a new class in java

    public static void main(String[] args) {
	    //objects have states and behaviors;
        //states are properties // behaviors are methods;
        Car porsche = new Car(); //this is a class --> datatype
        Car holden = new Car();

        porsche.setModel("Carerra");
        System.out.println("Model is " + porsche.getModel());
    }
}
