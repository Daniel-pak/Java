package com.company;

import java.util.ArrayList;

/**
 * Created by danielpak on 4/18/17.
 */
public class Customer {

//    public ArrayList<Double> transactionArrayList = new ArrayList<>();
//    private String name;
//
//    public ArrayList<Double> getTransactionArrayList() {
//        return transactionArrayList;
//    }
//
//   public Double addTransaction(double transaction) {
//        transactionArrayList.add(transaction);
//        return transaction;
//    }
//
//    public void showTransaction(){
//        for (int i = 0; i < transactionArrayList.size(); i++){
//            double value = transactionArrayList.get(i);
//            System.out.println(i + " --> " + value);
//        }
//    }
//
//    public Customer(ArrayList<Double> transactionArrayList, String name) {
//        this.transactionArrayList = transactionArrayList;
//        this.name = name;
//    }

//*********************************************************************************

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction); //this is an example of autoboxing
    }


}
