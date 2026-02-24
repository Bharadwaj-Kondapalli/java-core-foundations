package com.bharadwaj.day19;

public class GenericBoxDemo {

	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		
		Box<String> stringBox = new Box<>();
		
		intBox.set(10);
		
		int value = intBox.get();
		
		System.out.println(value);
		
		stringBox.set("Hi Bharadwaj!");
		
		String strValue = stringBox.get();
		
		System.out.println(strValue);

	}

}


class Box<T> {
	T value;
	
	void set(T value) {
		this.value = value;
	}
	
	T get() {
		return value;
	}
	
}