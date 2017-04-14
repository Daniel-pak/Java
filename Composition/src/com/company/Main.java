package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Moniter theMonitor = new Moniter("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer(theCase, theMonitor, theMotherBoard); //created a new class with the other objects;
        thePC.powerUp();

    }
}
