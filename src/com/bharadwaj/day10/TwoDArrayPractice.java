package com.bharadwaj.day10;

public class TwoDArrayPractice {
	public static void main(String[] args) {
		
		int[][] matrix = { 
			{1, 2, 3},
			{4, 5, 6}
		};
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		int[][] jagged = {
				{1, 2},
				{3, 4, 5},
				{6}
		};
		
		for(int i = 0; i < jagged.length; i++) {
			for(int j = 0; j < jagged[i].length; j++) {
				System.out.print(jagged[i][j] + " ");
			}
			System.out.println();
		}
	}

}
