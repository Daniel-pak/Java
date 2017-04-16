package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i <myIntegers.length; i++){
            System.out.println(myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++){
            sumTotal += array[i];
        }
        return sumTotal/array.length;
    }
}

//	    int[] myIntArray = new int[10];
//	    myIntArray[5] = 50;
//	    int [] myIntArray = new int[25];
//        double[] myDoubleArray = new double[10];
//
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);

//        for (int i = 0; i < myIntArray.length; i++){
//            myIntArray[i] = i * 10;
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }