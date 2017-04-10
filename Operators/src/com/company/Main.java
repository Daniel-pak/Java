package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result -1;

        System.out.println("result = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result/5;
        System.out.println(previousResult + " / 5 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;

        if (topScore != 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("greater than top score and less than 100!");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar) //you can actually set a boolean value in the if statement
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double num1 = 20d;
        double num2 = 80d;
        double finalNumber = (num1 + num2) * 25;
        if (finalNumber % 40 <= 20)
            System.out.println("Total was over the limit");

    }
}
