package com.company;

/**
 * Created by danielpak on 4/13/17.
 */
public class Player {
    public String playerName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0)
            System.out.println("Player fainted!");
            //reduce number of lives remaining for the player
    }

    public int healthRemaining() {
        return this.health;
    }
}
