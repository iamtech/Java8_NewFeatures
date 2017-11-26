package com.features.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestForEach {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		
		for(int i =0; i<10; i++){
			li.add(i);
		}
		
		li.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		});
		
		System.out.println("-----------------------------------");
		
		for(Integer in : li){
			System.out.println(in);
		}
		
		
	}
}
