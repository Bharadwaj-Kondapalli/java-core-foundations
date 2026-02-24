package com.bharadwaj.day19;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		Iterator<Integer> it = numbers.iterator();
		
		while(it.hasNext()) {
			Integer value = it.next();
			if(value % 2 == 0) {
				it.remove();
			}
		}
		
		System.out.println(numbers);

	}

}
