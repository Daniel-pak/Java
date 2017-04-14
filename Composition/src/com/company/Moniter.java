package com.company;

/**
 * Created by danielpak on 4/13/17.
 */
public class Moniter {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution; //early example of composition --> resolution is part of monitoe

    public Moniter(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
