package com.company;

public class Main {

    public static void main(String[] args) {
	    int myMin = -2_147_483_648; //length is just right
        int myMax = 2_147_483_647;
        int myTotal = (myMin/2);

        byte myByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewBytevalue = (byte) (myByteValue/2); //casting --> to tell Java to put the result into the byte type instead of putting it right into an int

        short myShortValue = 32767;
        short myMaxShortValue = -32768; //this is about 2x's space that a byte is and about 1/2 of the space of an int
        short myNewShortValue = (short) (myShortValue/2);

        long myLongValue = 100L; //need to put an l at the end of the number;

        byte myPracticeByte = 100;
        short myPracticeShort = 1000;
        int myPracticeInt = 10;
        long myPracticeLong = (long) (50000 + (10 * (myPracticeByte + myPracticeShort + myPracticeInt))); // don't need the casting here

        //integer is the best type of variable type to use here;
        System.out.println(myPracticeLong);
    }
}
