package com.company;

import java.util.ArrayList;

/**
 * Created by danielpak on 4/20/17.
 */
public class Gearbox { //top level class
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < gears.size() && clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("GRINNDDD!!!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if (clutchIsIn){
            System.out.println("SCREEAMMMSS");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear { //inner class --> this wouldn't make sense by itself, so it's coupled with gear box that's why we use an inner class
        private int gearNumber; //has access to the Gearbox properties //if you want to use the Gearbox properties you can use Gearbox.this.currentGear
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * ratio;
        }
    }
}
