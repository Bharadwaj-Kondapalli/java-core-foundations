package com.bharadwaj.day18;

import java.util.HashMap;
import java.util.Map;

public class MapIterationDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Bharadwaj");
		map.put(2, "Varun");
		map.put(3, "Satish");
		map.put(4, "Charan");
		map.put(4, "Vinay");
		
		
		System.out.println("Using keySet():");
		for(Integer key : map.keySet()) {
			System.out.println(key +  " " + map.get(key));
		}
		
		System.out.println("Using entrySet():");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
