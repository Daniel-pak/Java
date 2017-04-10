package com.company;

/**
 * Created by danielpak on 4/10/17.
 */

public class BankAccount {

    private String bankAccountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() { //if an empty constructor is called, we can set default values;
        this("56789", 2.50, "Default Name", "Default Email", "12345"); //this is calling the below constructor, must be the first line
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(String bankAccountNumber, double balance, String customerName, String email, String phoneNumber){ //with constructors don't call setters, rather just save to the field;
        System.out.println("Constructor with parameters called");
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) { //this is calling to the major constructor
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public void setBankAccountNumber(String accountNumber) {
        this.bankAccountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Your new balance is " + this.balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (withdrawAmount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Balance remaining: " + this.balance);
        }
    }
}
