package com.bharadwaj.day15;

public class ThrowThrowsDemo {
	
	static int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}

	public static void main(String[] args) {
		
		try {
			int result = divide(10, 0);
			System.out.println("Result:" +result);
		} catch(ArithmeticException e) {
			System.out.println("Divided by zero is not possible");
		} finally {
			System.out.println("Operation Completed");
		}

	}

}
