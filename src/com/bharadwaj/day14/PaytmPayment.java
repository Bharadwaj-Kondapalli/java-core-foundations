package com.bharadwaj.day14;

public class PaytmPayment implements PaymentGateway{
	
	@Override 
	public void pay(double amount) {
		System.out.println("Paid " + amount + " Using Paytm");
	}

}
