package com.company;

public class Main {

    public static void main(String[] args) {
//	    boolean gameOver = true;
//	    int score = 800;
//	    int levelCompleted = 5;
//	    int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println(highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println(highScore);

        displayHighScorePosition("Daniel", calculateHighScorePosition(1500));
        displayHighScorePosition("Christian", calculateHighScorePosition(900));
        displayHighScorePosition("Bob", calculateHighScorePosition(400));
        displayHighScorePosition("Mike", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //if you want to return a value change void to data type you want to use
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;

    }
}
