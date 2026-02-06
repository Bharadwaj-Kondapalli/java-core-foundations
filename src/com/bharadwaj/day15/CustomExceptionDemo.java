package com.bharadwaj.day15;

public class CustomExceptionDemo {
	
	static void checkAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
		System.out.println("Access Granted");
	}

	public static void main(String[] args) {
		try {
			checkAge(17);
		} catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Age verification completed");
		}

	}

}
