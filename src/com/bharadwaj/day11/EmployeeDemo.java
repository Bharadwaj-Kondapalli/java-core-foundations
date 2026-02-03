package com.bharadwaj.day11;

public class EmployeeDemo {
	
	int id;
	String name;
	static String companyName = "Wipro";
	
	
	public EmployeeDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + companyName;
	}


	public static void main(String[] args) {
		
		EmployeeDemo object1 = new EmployeeDemo(1, "Kondapalli");
		EmployeeDemo object2 = new EmployeeDemo(2, "Bharadwaj");
		
		
		System.out.println(object1);
		System.out.println(object2);
	}

}
