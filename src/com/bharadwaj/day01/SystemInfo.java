package com.bharadwaj.day01;

public class SystemInfo {
	public static void main(String[] args) {
		String javaVersion = System.getProperty("java.version");
		String osName = System.getProperty("os.name");
		
		System.out.println("Java Version: " +javaVersion);
		System.out.println("OS Name: " +osName);
	}

}
