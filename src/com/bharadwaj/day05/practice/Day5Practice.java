package com.bharadwaj.day05.practice;

public class Day5Practice {
	public static void main(String[] args) {

		// 1. Print numbers from 1 to 100
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		// 2. Print even and odd numbers from 1 to 50

		System.out.print("Even Numbers: ");
		for(int i = 1; i<= 50; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		System.out.print("Odd Numbers: ");
		for(int i = 1; i <= 50; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

        // 3. Sum from 1 to N


		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum of numbers from 1 to 10: " +sum);

        // 4. Count even numbers

		int count = 0;
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				count++;
			}
		}
		System.out.println("Number of even numbers present between 1 and 50 is: " +count);

        // 5. Prime number check

		int num = 20;
		int factorCount = 0;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				factorCount++;
			}
		}
		if(factorCount == 0) {
			System.out.println("The number is a prime number");
		} else {
			System.out.println("The number is not a prime number");
		}

        // 6. Reverse a number

		int number = 12345;
		int reverseNumber = 0;

		while(number != 0) {
			int digit = number % 10;
			reverseNumber = reverseNumber * 10 + digit;
			number = number / 10;
		}

		System.out.println("Reversed Number: " +reverseNumber);

        // 7. Factorial

		int factorialNumber = 5;
		int factorial = 1;
		for(int i = factorialNumber; i >= 1; i--) {
			factorial *= i;
		}

		System.out.println("Factorial of the number is: " +factorial);

        // 8. Multiplication table


		int multiplicationNumber = 7;
		for(int i = 1; i <= 10; i++) {
			System.out.println(multiplicationNumber + " X " + i + " = " + multiplicationNumber * i);
		}
	}

}
