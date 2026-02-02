package com.bharadwaj.day07;

public class AmbiguityDemo {
	public static void main(String[] args) {
//		test(10, 20);
	}

	static void test(int a, float b) {
		System.out.println("long");
	}

	static void test(float a, int b) {
		System.out.println("float");
	}

}
