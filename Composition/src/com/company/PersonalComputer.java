package com.company;

/**
 * Created by danielpak on 4/13/17.
 */
public class PersonalComputer { //has a case, has a moniter
    private Case theCase;
    private Moniter monitor;
    private Motherboard motherboard;

    public PersonalComputer(Case theCase, Moniter monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}
