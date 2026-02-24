package com.bharadwaj.day18;

import java.util.*;

public class MapTypesDemo {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "Bharadwaj");
		hashMap.put(4, "Charan");
		hashMap.put(5, "Vinay");
		hashMap.put(2, "Varun");
		hashMap.put(3, "Satish");

		
		System.out.println("HashMap: " +hashMap);
		
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put(1, "Bharadwaj");
		linkedHashMap.put(2, "Varun");
		linkedHashMap.put(3, "Satish");
		linkedHashMap.put(4, "Charan");
		linkedHashMap.put(5, "Vinay");
		
		System.out.println("LinkedHashMap: " +linkedHashMap);
		
		Map<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(1, "Bharadwaj");
		treeMap.put(2, "Varun");
		treeMap.put(3, "Satish");
		treeMap.put(4, "Charan");
		treeMap.put(5, "Vinay");
		
		System.out.println("TreeMap: " +treeMap);

	}

}
