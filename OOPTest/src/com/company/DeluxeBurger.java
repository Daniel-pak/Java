package com.company;

/**
 * Created by danielpak on 4/15/17.
 */
public class DeluxeBurger extends Hamburger {
    private int drink;
    private int chips;

    public DeluxeBurger(String meat) {
        super("Bun", meat, new Additions(0, 0, 0, 0));
        this.drink = 1;
        this.chips = 1;
    }

    @Override
    public void getOrder() {
        super.getOrder();
        getDrink();
        getChips();
    }

    @Override
    public void total(){
        System.out.println("Your total is " + (super.getBurgerTotal() + 1.99));
    }

    private void getDrink() {
        if (drink == 1) System.out.println("This option has a drink");
    }

    private void getChips() {
        if (chips == 1)
            System.out.println("This option has chips");
    }
}
