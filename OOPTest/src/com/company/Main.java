package com.company;

public class Main {

    public static void main(String[] args) {
    /*The purpose of the application is to help a ficticious company called Bills Burgers to manage their process of selling hamburgers
	* Our application will help Bill to select types of burgers, some of the additional items(additions) to be added to the burgers and pricing.
	*
	* We can to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
	*
	* The basic hamburger should have the following items:
	*   Bread roll type/ Meat/ and up to 4 additional additions(things like lettuce, tomato, carrot, etc) that the customer can select to be added to the burger.
	*   Each one of these items gets charged an additional price so you need some way to track how many items got added and to calculate the price (for the base and all
	*   its additions).
	*
	* This burger has a base price and all separately priced additions.
	*
	* Create a Hamburger class to deal with all the above - the constructor should only include the roll type, meat and price.
	* ********
	*
	* Also create two extra varieties of Hamburgers(classes) to cater for
	* a) Healthy burger (on a brown rye bread roll), plus two additional items can be added.
	* The healthy burger can have a total of 6 items (Additions) in total.
	*
	* hint: You probably want to process the 2 additional items in this new class, not the base class, since the 2 additional items are only appropriate for this new class
	*
	* b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
	* hint: You have to find a way to automatically add these new additions at the time the deluxe burger object is created, and then prevent other additions being made.
	*
	* All 3 classes should have a method that can be called anytmie to show the base price of the hamburger plus all additions, each showing the addition name, and addition price
	* and a grand total for the burger
	*
	* For the two additional classes this may require you to be looking at the base class for pricing and then adding totals onto that.
	*/

//	Hamburger hamburger = new Hamburger("Bun", "Chicken", new Additions(1, 1, 1, 1));
//
//        hamburger.getOrder();
//        hamburger.total();

        Hamburger hamburger1 = new Hamburger("Sesame bagel", "Salmon", new Additions(0, 0, 0, 1));

        hamburger1.getOrder();
        hamburger1.total();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Chicken", new Additions(1, 1, 1, 1));
        deluxeBurger.getOrder();
        deluxeBurger.total();

        HealthyBurger healthyBurger = new HealthyBurger(new Additions(0, 1, 0, 1), 0, 0);

        healthyBurger.getOrder();
        healthyBurger.total();

        DeluxeBurger deluxeBurger1 = new DeluxeBurger(" Beef", new Additions(1, 0, 0 , 1));
        deluxeBurger1.getOrder();
        deluxeBurger1.total();
    }


}
