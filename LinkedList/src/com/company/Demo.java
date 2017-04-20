package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by danielpak on 4/19/17.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Darwin"); //not added because it's already included;
        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");

        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i .hasNext()){ //is there another entry
            System.out.println("Now visiting " + i.next()); //returns current value and increases iterator
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity); //0 is matched strings //need to use .next(); to point to the first entry
            if (comparison == 0){
                //equal do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) { //new item should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true; //in regular iterator, you cannot move backwards to a previous one. This is why we use listIterator
            } else {
                //move onto next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    //linkedLists are double reference forward and backward;
    //linkedLists are used to manipulate and sort lists

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday Vacation over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("You've reached the end of the list");
                    }
                    break;
                case 2:
                    if(goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress: ");
        System.out.println("0 - to quit \n" +
                        "1 - go to next city \n" +
                        "2 - go to previous city \n" +
                        "3 - print menu");

    }
}
