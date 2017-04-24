package com.company;

public class Main {

    public static void main(String[] args) {
        //YOU DO IT LIKE THIS WITH A PUBLIC NESTED CLASS

//        Gearbox mcLaren = new Gearbox(6); //notice the slightly different syntax
//        Gearbox.Gear first = mcLaren.new Gear (1, 12.3);
//        System.out.println(first.driveSpeed(1000));


        //DON'T DO THIS
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4); //can't do this
//        Gearbox.Gear third = new mcLaren.Gear(3, 17.8); also can't do this // gear would have to be a static nested class

        /**** lesson 2 ****/

        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
    }
}
