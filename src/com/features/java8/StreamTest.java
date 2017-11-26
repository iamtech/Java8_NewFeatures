package com.features.java8;

import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
			
		Stream.of("d2", "a2", "b1", "b3", "c")
		.map(u -> u.toUpperCase())
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.contains("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

	}
}
