package com.company;

/**
 * Created by danielpak on 4/13/17.
 */
public class Television {
    private String type;
    private boolean isHD;
    private Resolution resolution;

    public Television(String type, boolean isHD, Resolution resolution) {
        this.type = type;
        this.isHD = isHD;
        this.resolution = resolution;
    }

    public void powerOn(){
        System.out.println("TV.powerOn() called");
    }

    public String getType() {
        return type;
    }

    public boolean isHD() {
        return isHD;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
