package com.bharadwaj.day07;

public class OverloadingDemo {

	public static void main(String[] args) {

		add(2, 3);
		add(20, 30, 40);
		add(2.0, 3.0);
	}

	static void add(int a, int b) {
		System.out.println("The sum of  " + a + " and " + b + " is " +(a + b));
	}

	static void add(int a, int b, int c) {
		System.out.println("The sum of " + a + " and " + b + " and " + c + " is " +(a + b + c));
	}

	static void add(double a, double b) {
		System.out.println("The sum of  " + a + " and " + b + " is " +(a + b));
	}
}
