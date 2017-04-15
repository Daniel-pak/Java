package com.company;

import com.sun.tools.javac.util.FatalError;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Starting " + name;
    }

    public String accelerate() {
        return "has no power to accelerate";
    }

    public String breaking() {
        return "You break to a dead stop!";
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Tesla extends Car {
    public Tesla() {
        super(0, "Tesla");
    }

    @Override
    public String accelerate() {
        return "Car moves a quarter mile in 12.4 seconds";
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super(12, "Ferarri");
    }

    @Override
    public String accelerate() {
        return "Car moves a quarter miles in 10.5";
    }
}

class Lamborghini extends Car {
    public Lamborghini() {
        super(14, "Lamborghini");
    }

    @Override
    public String accelerate() {
        return "Car moves a quarter mile in 10.7";
    }
}

class JunkCar extends Car {
    public JunkCar(){
        super(4, "Junk");
    }
}


public class Main {

    public static void main(String[] args) {
//	      we are going to go back to the car analogy;
//        create a base class Car
//        it should have a few fields that would be appropriate for a generic car class
//        engine, cylinders, wheels, etc.
//        Constructor should initialize cylinders (number of) and name, and set wheels to 4
//        and engine to true. Cylinders and names would be passed parameters

//        create appropriate getters

//        Create some methods like startEngine, accelerate, break

//        show a message for each in the base class
//        now create 3 sub classes for your favorite vehicles
//        Override the appropriate methods to demonstrate polymorphism in use.
//        put all classes in the one java file.
        for (int i = 0; i < 11; i++){
            Car car = randomCar();
            System.out.println(car.startEngine());
            System.out.println(car.getCylinders()) ;
            System.out.println("Your randomly generated car is # " + i + " named " + car.getName() + " which " + car.accelerate());
            System.out.println(car.breaking());
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 4 + 1);
        switch (randomNumber) {
            case 1:
                return new Tesla();
            case 2:
                return new Ferrari();
            case 3:
                return new Lamborghini();
            case 4:
                return new JunkCar();
            default:
                return null;
        }

    }

}
