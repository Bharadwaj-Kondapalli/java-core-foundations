package com.bharadwaj.day06;

import java.util.Arrays;

public class MethodDemo {
	public static void main(String[] args) {
		int productResult = product(9, 5);
		sum(9, 5);
		System.out.println("Product: " +productResult);
		System.out.println(Arrays.toString(args));
	}
	
	static void sum(int a, int b) {
		System.out.println("Sum Result: " +(a + b));
	}
	
	static int product(int a, int b) {
		return a*b;
	}
	


}
