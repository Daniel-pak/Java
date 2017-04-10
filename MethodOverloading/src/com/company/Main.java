package com.company;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(157));
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() { //must change number of parameters to make a method overloaded.
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches > 12 || inches < 0)
            return -1;
        else {
            double feetToInches = feet * 12;
            double inchesToCentimeters = (feetToInches * 2.54d) + (inches * 2.54d);
            return inchesToCentimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0)
            return -1;
        else {
            int feet = (int) inches/12;
            int remainingInches = (int) inches%12;
            return calcFeetAndInchesToCentimeters((double) feet, (double) remainingInches);
        }
    }

}
