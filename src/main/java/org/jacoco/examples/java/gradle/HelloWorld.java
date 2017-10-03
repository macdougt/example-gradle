package org.jacoco.examples.java.gradle;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
                System.out.println("Here I am");
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
