package com.bharadwaj.day14;

public class PaymentApp {

	public static void main(String[] args) {
		
		PaymentGateway payment;
		
		payment = new PaytmPayment();
		payment.pay(500);
		
		
		payment = new GooglePayPayment();
		payment.pay(1000);
	}

}
