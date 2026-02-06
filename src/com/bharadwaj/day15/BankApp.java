package com.bharadwaj.day15;

public class BankApp {
	
	static double balance = 5000;
	static void withdraw(double amount) throws InsufficientBalanceException {
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance for withdrawal");
		} else {
			System.out.println("amount withdrawn , remaining balance: " +(balance - amount));
		}
	}

	public static void main(String[] args) {
		try {
			withdraw(6000);
		} catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Transaction Completed");
		}

	}

}
