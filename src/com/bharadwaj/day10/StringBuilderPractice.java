package com.bharadwaj.day10;

import java.util.Scanner;

public class StringBuilderPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		StringBuilder reverseString = sb.reverse();
		
		System.out.println("The reverse String is: " +reverseString);
		

//		
//		String s = sc.nextLine();
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = s.length() - 1; i >= 0; i--) {
//			sb.append(s.charAt(i));
//		}
//		
//		System.out.println("The reverse String is: " +sb);
		
		
		sc.close();
	}

}
