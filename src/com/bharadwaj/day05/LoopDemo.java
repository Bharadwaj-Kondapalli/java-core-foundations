package com.bharadwaj.day05;

public class LoopDemo {
	public static void main(String[] args) {
		
		// for loop
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			if(i == 7) {
				break;
			}
			System.out.print(i + " ");
		}

		System.out.println();
		
		
		// while loop
		int j = 1;
		while(j <= 20) {
			if(j%2 == 0) {
				System.out.print(j + " ");
			}
			j++;
		}
		
		System.out.println();
		
		//do-while loop
		int k = 10;
		do {
			System.out.println("The value of k: " +k);
			k++;
		} while(k <= 5);
		
		
		//nested for loop
		for(int i = 1; i <= 5; i++)  {
			for(int l = 1; l <= 5; l++) {
				System.out.print(i + "" + l + " ");
			}
		}
	}

}
