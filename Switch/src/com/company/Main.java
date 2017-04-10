package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 4;
        //can be used for byte short char, int;
        switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("value was 3 or 4 or 5");
                break; //without break it will fallthrough until it finds another break or the end of the switch statement.
            default:
                System.out.println("was not 1 or 2 or 3 or 4 or 5");
                break; //don't really need the break here because it is the end of the switch statement
        }

        char letter = 'F';

        switch(letter) {
            case 'A':
                System.out.println("Your letter was an A");
                break;
            case 'B':
                System.out.println("Your letter was B");
                break;
            case 'C':
                System.out.println("Your letter was C");
                break;
            case 'D':
                System.out.println("Your letter was D");
                break;
            case 'E':
                System.out.println("Your letter was E");
                break;
            default:
                System.out.println("Your letter was not A, B, C, D, or E");
                break;
        }

        String month = "JanUary";

        switch(month.toLowerCase()) { //toLowerCase() a basic method to string class which enables us to convert entire string to lowercase
            case "january":
                System.out.println("The month was January");
                break;
            case "february":
                System.out.println("The month was February");
                break;
        }
        //more code here
    }
}
