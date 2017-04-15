package com.company;

/**
 * Created by danielpak on 4/15/17.
 */
public class HealthyBurger extends Hamburger{
    private int brusselSprouts;
    private int redCabbage;
    private double total;

    public HealthyBurger(Additions addition, int brusselSprouts, int redCabbage) {
        super("Brown Rye Roll", "Tofu", addition);
        this.brusselSprouts = brusselSprouts;
        this.redCabbage = redCabbage;
    }

    @Override
    public void total(){
        System.out.println(getBurgerTotal() + sidesTotal());

    }

    public void getBrusselSprouts() {
        if (brusselSprouts == 1)
            System.out.println("This option has brussel sprouts");
    }

    public void getRedCabbage() {
        if (redCabbage == 1){
            System.out.println("This option has red cabbage");
        }
    }

    @Override
    public void getOrder(){
        super.getOrder();
        getBrusselSprouts();
        getRedCabbage();
    }

    private double sidesTotal(){
        if (brusselSprouts == 1) {
            total += 1.00;
        }
        if (redCabbage == 1){
            total += 1.00;
        }
        return total;
    }
}
