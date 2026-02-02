package com.bharadwaj.day09;

import java.util.Scanner;

public class StringPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String s = sc.nextLine();
		
		String reverseString = "";
		
		for(int i = s.length() - 1; i >= 0; i--) {
			
			reverseString += s.charAt(i);
		}
		
		System.out.println("The reversed String is: " +reverseString);
		
		if(s.equals(reverseString)) {
			System.out.println("Yes, The given String is a Palindrome");
		} else {
			System.out.println("No, the given String is not a Palindrome");
		}
		
		sc.close();
	}

}
