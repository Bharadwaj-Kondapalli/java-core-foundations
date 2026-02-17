package com.bharadwaj.day16;

import java.util.ArrayList;
import java.util.List;

public class ListOperationsDemo {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(0, 5);
		numbers.add(1, 20);
		numbers.add(2, 10);
		numbers.add(3, 2);
		numbers.add(4, 50);
		
		System.out.println(numbers);
		
		System.out.println("First: " +numbers.get(0));
		System.out.println("Last: " +numbers.get(numbers.size() - 1));
		
		numbers.remove(2);
		
		System.out.println("After removal: ");
		
		System.out.println(numbers);
		
	}

}
