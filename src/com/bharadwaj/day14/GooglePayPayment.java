package com.bharadwaj.day14;

public class GooglePayPayment implements PaymentGateway {
	
	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " Using Google Pay");
	}

}
