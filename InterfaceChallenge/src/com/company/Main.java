package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*
	    * Create a simple interface that allows an object to be saved to some sort of storage medium
	    *
	    * The exact type of medium is not known to the interface (nor to the class that implements it)
	    * The interface will just specify 2 methods, one to return an ArrayList of values to be saved
	    * and the other to populate the object's fields from an ArrayList.
	    *
	    * Create some sample classes that implement your saveable interface(we've used the idea of a game,
	    * with Players and Monsters, but you can create any type of classes that you want).
	    *
	    * override the toString() method for each o your classes so that they can be easily printed to enable
	    * the program to be tested easier.
	    *
	    * In Main, write a method that takes an object that implements the interface as a parameter and "saves"
	    * the values.
	    *
	    * Also in Main, write a method that restores the values to a saveable object.
	    *
	    * Again, we are not going to use Java file I/O; instead use the readValues() method below to simulate
	    * getting values from a file - this allows you to type as many values a your class requires, and returns an
	    * ArrayList.
	    * */
        Player dan = new Player("Dan", 10, 15);
        System.out.println(dan.toString());
        saveObject(dan);

        dan.setHitPoints(100);
        System.out.println(dan);
        dan.setWeapon("KILLTIMWEAPON");
        saveObject(dan);
//        loadObject(dan);
        System.out.println(dan);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit"
        );

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }


}
