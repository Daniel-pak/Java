package com.company;

import java.util.ArrayList;
/**
 * Created by danielpak on 4/18/17.
 */
public class Bank {
//    private ArrayList<Branch> branchArrayList = new ArrayList<>();
//
//    public void createBranch(String name) {
//        Branch branch = new Branch(name);
//    }
//
//    public void addCustomerToBranch(Customer customer, Double transaction){
//    }
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){ //checking if branch exists;
            return branch.newCustomer(customerName, initialAmount);
        }
        return false; //weren't able to store customer
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i < this.branches.size(); i++){
            Branch checkBranch = this.branches.get(i);
            if(checkBranch.getBranchName().equals(branchName)) {
                return checkBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers for branch " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getBranchCustomers();
            for(int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " [" + i + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + j + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }


}
