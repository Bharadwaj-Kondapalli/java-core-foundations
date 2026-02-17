package com.bharadwaj.day17;

import java.util.LinkedList;

public class LinkedListOperationsDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(6);
		
		list.addFirst(10);
		list.addLast(20);
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		

	}

}
