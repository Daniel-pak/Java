package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount danielPak = new BankAccount();

//        BankAccount danielPak = new BankAccount("1234567890", 1000000,"daniel pak", "email@gmail.com", "12345");
//
//        System.out.println(danielPak.getBalance());
//        System.out.println(danielPak.getBankAccountNumber());
//        System.out.println(danielPak.getCustomerName());
//        System.out.println(danielPak.getEmail());
//        System.out.println(danielPak.getPhoneNumber());
//
//        danielPak.depositFunds(1);
//        System.out.println(danielPak.getBalance());
//
//        danielPak.withdrawFunds(1000000);
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "12345");
//        System.out.println(timsAccount.getEmail() + timsAccount.getCustomerName());
//      ***************************** CHALLENGE 2 ********************************

        VipCustomer DanielPak = new VipCustomer("Daniel Pak", 1000000, "daniel@gmail.com");
        System.out.println(DanielPak.getCreditLimit());
        System.out.println(DanielPak.getEmail());
        System.out.println(DanielPak.getName());
        System.out.println("*****************");
        VipCustomer Tim = new VipCustomer();
        System.out.println(Tim.getName());
        System.out.println(Tim.getEmail());
        System.out.println(Tim.getCreditLimit());
        System.out.println("*****************");
        VipCustomer Max = new VipCustomer("Maxie Pad", "Max@gmail.com");
        System.out.println(Max.getName());
        System.out.println(Max.getEmail());
        System.out.println(Max.getCreditLimit());
    }
}
