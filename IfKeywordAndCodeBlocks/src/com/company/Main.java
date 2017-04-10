package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus); //scoping
            System.out.println("Your final score was " + finalScore);
        }

//        int savedFinalScore = finalScore; //once the if statement is run, finalscore is deleted;

        //challenge!
        //You could potentially just reuse those variables and set them to a new value below;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (gameOver) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println(finalScore);
        }


    }
}
