package com.company;

import java.util.ArrayList;

/**
 * Created by danielpak on 4/18/17.
 */
public class Branch {

    public ArrayList<Customer> branchCustomers;
    public String branchName;

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public Branch(String branchName) {
        this.branchCustomers = new ArrayList<>();
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null){
            this.branchCustomers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < branchCustomers.size(); i++){
            if (this.branchCustomers.get(i).getName().equals(customerName)){
                return this.branchCustomers.get(i);
            }
        }
        return null;
    }


//***********************************************************************
//    public Customer addCustomerToBranch(Customer customer, Double transaction) {
//        branchCustomers.add(customer);
//        addTransaction(customer, transaction);
//        return customer;
//    }
//
//    public void addTransaction(Customer customer, Double transaction) {
//        int position = searchForCustomer(customer);
//        if (searchForCustomer(customer) != -1){
//            double transactionAmount = branchCustomers.get(position).addTransaction(transaction);
//            System.out.println(transactionAmount + " added to " + customer.getName() + "'s account");
//        } else {
//            System.out.println("This customer does not exist!");
//        }
//    }
//
/*    private int searchForCustomer(Customer customer) {
        for (int i = 0; i < branchCustomers.size(); i++){
            if (this.branchCustomers.get(i) == customer){
                return i;
            }
        }
        return -1;
    }
//*/
//    public void showCustomers(){
//        for (int i = 0; i < branchCustomers.size(); i++) {
//            branchCustomers.get(i).getName();
//        }
//    }
//
//    public void showTransaction(){
//        for (int i = 0; i < branchCustomers.size(); i++){
//            System.out.println(branchCustomers.get(i).getName() + "*****");
//            branchCustomers.get(i).showTransaction();
//        }
//    }

}
