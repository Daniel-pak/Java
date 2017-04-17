package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);
        printIntegers(unsortedArray);
        int[] sortedArray = sortIntegers(unsortedArray);
        printIntegers(sortedArray);
    }

    public static void printIntegers(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Index " + i + " is number: " + array[i]);
        }
    }
    public static int[] getIntegers(int number){
        int[] myArray = new int[number];
        System.out.println("Enter your " + myArray.length + " numbers...");
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    //copy an array --> int[] newArray = Array.copyOf(array, # of items);

    public static int[] sortIntegers(int[] array){
        int count = 0;
        for (int j = 0; j < array.length - 1; j++){
            int firstNumber = array[j];
            System.out.println(firstNumber + " is the first Number");
            for (int i = j + 1; i < array.length; i++){
                if (firstNumber < array[i]) {
                    int num1 = array[j];
                    int num2 = array[i];

                    array[j] = num2;
                    array[i] = num1;

                    firstNumber = array[j];
                    System.out.println(firstNumber + " is changed");
                }
                if (i == array.length - 1){
                    array[count] = firstNumber;
                    count++;
                }
            }
        }
        return array;
    }



}
