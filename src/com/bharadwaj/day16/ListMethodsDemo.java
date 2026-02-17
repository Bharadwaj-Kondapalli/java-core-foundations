package com.bharadwaj.day16;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Bharadwaj");
		names.add("Varun");
		names.add("Charan");
		names.add("Satish");
		names.add("Deepa");
		
		
		names.add(2, "Thanmayee");
		
		names.remove("Satish");
		
		
		names.set(1, "Varun Konidala");
		
		System.out.println("Contains Deepa: " +names.contains("Deepa"));
		
		
		System.out.println("Index of Thanmayee: " +names.indexOf("Thanmayee"));
		
		System.out.println("List before clear: " +names);
		
		names.clear();
		
		System.out.println(names.isEmpty());

	}

}
