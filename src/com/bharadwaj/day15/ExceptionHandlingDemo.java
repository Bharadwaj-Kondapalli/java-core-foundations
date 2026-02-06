package com.bharadwaj.day15;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			int[] arr = {10, 20, 30};
			int result = arr[1] / 0;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("The number can't be divisible by zero");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds");
		} catch(Exception e) {
			System.out.println("Some other Exception Occurred");
		} finally {
			System.out.println("Program Execution Completed");
		}
	}

}
