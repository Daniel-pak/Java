package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone timsPhone; //why do you need to do this //you can actually do /*Deskphone timsPhone*/
	    timsPhone = new DeskPhone(123456);
	    timsPhone.powerOn();
	    timsPhone.callPhone(123456);
	    timsPhone.answer();

	    timsPhone = new MobilePhone(23456);//you can do this because we did ITelephone in the instant ln 6;
	    timsPhone.callPhone(888888888);
	    timsPhone.answer();


	    MobilePhone dansPhone = new MobilePhone(888888888);
	    dansPhone.powerOn();
	    dansPhone.callPhone(888888888);
	    dansPhone.answer();

    }
}
