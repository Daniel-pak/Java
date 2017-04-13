package com.company;

/**
 * Created by danielpak on 4/10/17.
 */
public class Dog extends Animal { //extends animal allows states and behaviors to be shared to this class

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //calls the constructor to call the class that we are extending from; or inheriting from;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }


    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dgo.moveLegs() called");
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

}
