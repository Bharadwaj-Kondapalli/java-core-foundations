package com.bharadwaj.day08;

public class ArrayOperations {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum: " +sum);
		
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max Value: " +max);
		
		
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min Value: " +min);
	}

}
