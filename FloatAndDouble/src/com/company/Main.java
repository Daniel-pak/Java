package com.company;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
        int myIntValue = 5/2;
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f/3f; //typically you use a f after the float number
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d/3d; //typically with a decimal point java will assume it's a double

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 10d;
        double poundsToKilo = pounds/0.45359237d;

        System.out.println(poundsToKilo);
    }
}
