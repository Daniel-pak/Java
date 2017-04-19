package com.company;

import java.util.ArrayList;

class IntClass { //this is basically a wrapper
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
//        ArrayList<int> intArrayList = new ArrayList<int>(); CAN'T DO THIS because this is a primitive type
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(46));

        //concept of autoboxing --> object wrapper to support primitive types
        Integer integer = new Integer(54); //Integer is actually a class

        Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            integerArrayList.add(Integer.valueOf(i)); //taking value of i as primitive type and turning it into Integer class --> autoboxing
        }

        for( int i =0; i <= 10; i++){
            System.out.println(i + "--> " + integerArrayList.get(i).intValue()); //--> unboxing
        }

        //this is the best way because it's shorter code, better for compiler

        Integer myIntValue = 56; //Integer.valueOf(56) --> does this automatically during compiling
        int myInt = myIntValue; // myIntValue.intValue(); --> does this automatically

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl= 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(dbl); //Autoboxing
        }

        for (int i =0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i); //unboxing
            System.out.println(i + " --> " + value);
        }


    }
}
