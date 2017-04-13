package com.company;

public class Main extends Object{

    public static void main(String[] args) {
        //Challenge;
        //Start with a base class of a Vehicle, then create a Car class that inherits from this base class;
        //Finally, create another class, a specific type of Car that inherits from the Car class;
        //You should be able to handle steering, changing gears, moving(speed);
        //You will want to decide where to put the appropriate state and behaviors (fields and methods);
        //As mentioned above, changing gears, increasing/decreasing speed should be included
        //For your specific type of vehicle you will want to add something specific for that type of car;
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
