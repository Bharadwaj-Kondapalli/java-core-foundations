package com.bharadwaj.day03;

public class VariableDemo {
	
	static int staticVar = 50;
	
	int instanceVar = 100;
	
	public static void main(String[] args) {
		int localVar = 200;
		
		System.out.println("Static Variable: " +staticVar);
		
		VariableDemo obj = new VariableDemo();
		obj.instanceVar = 200;
		System.out.println("Instance Variable: " +obj.instanceVar);
		System.out.println("Modified Instance Variable: " +obj.instanceVar);
		
		System.out.println("Local Variable: " +localVar);
	}

}
