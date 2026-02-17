package com.bharadwaj.day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		
		System.out.println(numbers);
		
		Set<Integer> uniqueNumbers = new HashSet<>(numbers);
		
		System.out.println(uniqueNumbers);
	}

}
