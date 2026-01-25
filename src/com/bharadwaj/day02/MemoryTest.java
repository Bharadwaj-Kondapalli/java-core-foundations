package com.bharadwaj.day02;

public class MemoryTest {

	int value;

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("a = "+a);
		System.out.println("b = "+b);

		MemoryTest memoryTest1 = new MemoryTest();
		memoryTest1.value = 100;
		MemoryTest memoryTest2 = memoryTest1;
		memoryTest2.value = 200;

		System.out.println("memoryTest1.value =" +memoryTest1.value);
		System.out.println("memoryTest2.value = " +memoryTest2.value);
	}

}
