package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        bank.addBranch("Castle Rock Branch");
        bank.addCustomer("Castle Rock Branch", "Daniel", 100.00);
        bank.listCustomers("Castle Rock Branch", true);
        bank.addCustomerTransaction("Castle Rock Branch", "Daniel", 100000.00);
        bank.listCustomers("Castle Rock Branch", true);
    }
}
