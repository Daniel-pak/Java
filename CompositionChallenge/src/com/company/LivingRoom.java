package com.company;

/**
 * Created by danielpak on 4/13/17.
 */
public class LivingRoom {

    private Television theTV;
    private Couch theCouch;

    public LivingRoom(Television theTV, Couch theCouch) {
        this.theTV = theTV;
        this.theCouch = theCouch;
    }

    public void sit(){
        theCouch.sit();
    }

    public void turnOnTV(){
        theTV.powerOn();
    }
}
