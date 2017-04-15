package com.company;

/**
 * Created by danielpak on 4/14/17.
 */
public class Additions {

    private int lettuce = 0;
    private int tomato = 0;
    private int cheese = 0;
    private int pickles = 0;
    private double total;

    public Additions(int lettuce, int tomato, int cheese, int pickles) {
        if (lettuce == 1)
            this.lettuce = lettuce;
        if (tomato == 1)
            this.tomato = tomato;
        if (cheese == 1)
            this.cheese = cheese;
        if (pickles == 1)
            this.pickles = pickles;
    }

    private double AdditionsTotal() {
        //somehow find a way, if all are false, return 0;
        if (lettuce == 1){
            total += .99;
        }
        if (tomato == 1){
            total += .50;
        }
        if (cheese == 1){
            total += .25;
        }
        if (pickles == 1){
            total += .50;
        }
        return total;
    }

    private String isLettuce() {
        return "This option has lettuce";
    }

    private String isTomato() {
        return "This option has tomatoes";
    }

    private String isCheese() {
        return "This option has cheese";
    }

    private String isPickles() {
        return "This option has pickles";
    }

    public void totalAdditions() {
        //turn this into drop through switch statement
        if (this.pickles == 1)
            System.out.println(isPickles());
        if (this.cheese == 1)
            System.out.println(isCheese());
        if (this.lettuce == 1)
            System.out.println(isLettuce());
        if (this.tomato == 1)
            System.out.println(isTomato());
    }

    public double getTotal() {
        return AdditionsTotal();
    }
}
