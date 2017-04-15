package com.company;

/**
 * Created by danielpak on 4/13/17.
 */
public class Printer {
    private int tonerLevel = 100;
    private int numPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numPagesPrinted, boolean isDuplex) {
        System.out.println("New Printer() called");
        if (tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        if (numPagesPrinted > 0){
            this.numPagesPrinted = numPagesPrinted;
        }
        this.isDuplex = isDuplex;
    }

    public void fillToner(int filledBy){
        if (tonerLevel == 100){
            System.out.println("Your toner is already filled! Don't make it overflow!");
        } else if (tonerLevel <= 100 && filledBy > 0){
            int remainingToner;
            if (tonerLevel + filledBy >= 100){
                remainingToner = (tonerLevel + filledBy - 100);
                System.out.println("Your toner level is maxed, your total remaining toner is: " + remainingToner);
            } else {
                System.out.println("Your toner level is " + tonerLevel);
            }
        }
    }

    public void printPages(int pages){
        if (this.isDuplex){
            System.out.println("Duplex printing on both sides!");
            if (pages % 2 != 0) {
                this.numPagesPrinted += (pages / 2 + 1);
                System.out.println("You have printed " + this.numPagesPrinted + " pages");
            } else {
                this.numPagesPrinted += (pages/2);
                System.out.println("You have printed " + this.numPagesPrinted + " pages");
            }
        } else {
            System.out.println("Printer.printPages() called");
            this.numPagesPrinted += pages;
        }
    }

    public int getTonerLevel() {
        System.out.println(this.tonerLevel);
        return this.tonerLevel;
    }

    public int getNumPagesPrinted() {
        System.out.println(this.numPagesPrinted);
        return this.numPagesPrinted;
    }
}
