package com.bharadwaj.day12;

class Employee {
	double getSalary() {
		return 30000;
	}
}

class Manager extends Employee {
	@Override
	double getSalary() {
		return 60000;
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		Employee e = new Manager();
		System.out.println(e.getSalary());
	}

}
