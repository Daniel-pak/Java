package com.company;

/**
 * Created by danielpak on 4/20/17.
 */
public interface ITelephone { //uses interface instead of class
    void powerOn(); //not actually defining the methods, those will be in classes
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
    //don't need to use access modifiers

    //for a class that's inheriting from this interface, you must implement these methods. //define the methods for the classes
}
