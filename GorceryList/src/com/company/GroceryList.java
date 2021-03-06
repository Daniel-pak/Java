package com.company;

import java.util.ArrayList;

/**
 * Created by danielpak on 4/16/17.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>(); //can hold objects

    public void addGroceryItem(String item){
        groceryList.add(item); //adds an item to the list;
    }


    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + " . " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
       return groceryList.indexOf(searchItem);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;

    }

}
