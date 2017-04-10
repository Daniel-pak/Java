package com.company;

/**
 * Created by danielpak on 4/10/17.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("Default name", 10000, "defaultemail@gmail.com");
    }

    public VipCustomer(String name, String email){
        this(name, 20000, email);
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
