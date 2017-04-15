package com.company;

/**
 * Created by danielpak on 4/14/17.
 */
public class Hamburger {
    private String bread;
    private String meat;
    private Additions addition;
    private double burgerTotal;
    //method for total --> should override once extended classes are made

    public Hamburger(String bread, String meat, Additions addition) {
        this.bread = bread;
        this.meat = meat;
        this.addition = addition;
        this.burgerTotal = 4.50;
    }

    private String getBread() {
        return "This option has bread";
    }

    private String getMeat() {
        return "This option has " + this.meat;
    }

    private void getBase(){
        System.out.println(getBread());
        System.out.println(getMeat());
    }

    public void getOrder() {
        getBase();
        addition.totalAdditions();
    }

    public void total(){
        double total = addition.getTotal() + burgerTotal;
        System.out.println("Your total is " + total);
    }

    public double getBurgerTotal() {
        return burgerTotal + addition.getTotal();
    }
}
