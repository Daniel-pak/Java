package com.company;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by danielpak on 4/16/17.
 */

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contacts> contacts = new ArrayList<>();
    private static boolean running = true;

    public static int chooseOption() {
        System.out.println("Please choose an option: ");
        System.out.println("1. To add contact");
        System.out.println("2. To Modify contact");
        System.out.println("3. To remove contact");
        System.out.println("4. To search for a contact");
        System.out.println("5. To print all contacts");
        System.out.println("6. To quit");
        int response = scanner.nextInt();
        return response;
    }

    public static void runningPhone() {
        do {
            phoneResponse(chooseOption());
        } while (running);
    }

    public static void phoneResponse(int number) {
        switch (number) {
            case 1:
                addContact();
                break;
            case 2:
                modifyPosition();
                break;
            case 3:
                deleteContact();
                break;
            case 4:
                searchForContact();
                break;
            case 5:
                printContacts();
                break;
            case 6:
                quit();
        }
    }

    private static void addContact() {
        System.out.println("Please enter a name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Please enter a phone number: ");
        String number = scanner.nextLine();
        Contacts contact = new Contacts(name, number);
        contacts.add(contact);
    }

    private static void printContacts() {
        System.out.println("You have " + contacts.size() + " contacts!");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("********************");
            System.out.println(contacts.get(i).getName());
            System.out.println(contacts.get(i).getPhoneNumber());
            System.out.println(("********************"));
        }
    }

    private static void searchForContact() {
        System.out.println("Please type in a name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        int position = searchForPosition(name);
        if (position != -1) {
            System.out.println("Your contact was found! Name: " + name + ", Phone Number: " + contacts.get(position).getPhoneNumber());
        } else {
            System.out.println("No contact was found!");
        }
    }

    private static int searchForPosition(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private static void modifyPosition() { //add in a change number here
        System.out.print("Please select the contact to change: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        int position = searchForPosition(name);
        if (position == -1) {
            System.out.println("This contact does not exist!");
        } else {
            System.out.println("Would you like to change the 1. name, 2. number, 3. both: ");
            int answer = scanner.nextInt();
            modifierHelper(answer, position);
        }
    }

    private static void modifierHelper(int answer, int position){
        if (answer == 1) {
            System.out.println("Please type in a new name!");
            scanner.nextLine();
            String newName = scanner.nextLine();
            contacts.get(position).setName(newName);
        } else if (answer == 2) {
            System.out.println("Please type in a new number!");
            scanner.nextLine();
            String newNumber = scanner.nextLine();
            contacts.get(position).setPhoneNumber(newNumber);
        } else if (answer == 3) {
            System.out.println("Please type in a new name!");
            scanner.nextLine();
            String newName = scanner.nextLine();
            System.out.println("Please type in a new number!");
            String newNumber = scanner.nextLine();
            contacts.get(position).setName(newName);
            contacts.get(position).setPhoneNumber(newNumber);
        }
    }

    private static void deleteContact() {
        System.out.print("Please type in a contact to delete!");
        scanner.nextLine();
        String name = scanner.nextLine();
        int position = searchForPosition(name);
        if (position != -1) {
            contacts.remove(position);
        } else {
            System.out.println("This contact does not exist!");
        }
    }

    private static void quit() {
        running = false;
    }
}
