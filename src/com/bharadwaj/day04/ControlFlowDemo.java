package com.bharadwaj.day04;

public class ControlFlowDemo {
	public static void main(String[] args) {
		int num = 0;
		
		if(num == 0) {
			System.out.println("Zero");
		} else if(num > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
		
		
		
		int day = 0;
		
		switch(day) {
		case 1: 
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
		}
		
		
		
		int marks = 39;
		
		if(marks > 90 && marks <= 100) {
			System.out.println("Grade S");
		} else if(marks > 80 && marks <= 90) {
			System.out.println("Grade A");
		} else if(marks > 70 && marks <= 80) {
			System.out.println("Grade B");
		} else if(marks > 60 && marks <= 70) {
			System.out.println("Grade C");
		} else if(marks > 50 && marks <= 60) {
			System.out.println("Grade D");
		} else if(marks >= 40 && marks <= 50) {
			System.out.println("Grade E");
		} else {
			System.out.println("Sorry! Please write your exam again!");
		}

	}
}
