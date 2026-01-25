package com.bharadwaj.day06;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		add(num1, num2);
		subtract(num1, num2);
		product(num1, num2);

		sc.close();

	}

	static void add(int a, int b) {
		System.out.println("Addition of "+ a + " and " + b + " is: "  + (a + b));
	}

	static void subtract(int a, int b) {
		System.out.println("Subtraction of "+ a + " and " + b + " is: "  + (a - b));
	}

	static void product(int a, int b) {
		System.out.println("Product of "+ a + " and " + b + " is: "  + (a * b));
	}

}
