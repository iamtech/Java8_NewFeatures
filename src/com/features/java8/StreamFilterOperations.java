package com.code.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterOperations {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(50);
		li.add(20);
		li.add(30);
		
		List<Integer> lst = li.stream().filter(i -> i > 20).collect(Collectors.toList()); 
		
		lst.forEach(x -> System.out.println(x));
		
		System.out.println("------------------------------------------------------");
		//
		
		List<PersonBean> person = new ArrayList<>();
		person.add(new PersonBean(1001,"tim",5685.10));
		person.add(new PersonBean(1002,"stine",6685.10));
		person.add(new PersonBean(1003,"adam",5675.10));
		person.add(new PersonBean(1004,"kingsly",6785.20));
		person.add(new PersonBean(1005,"torrento",8985.40));
		
		person.stream().filter(p -> p.getId() == 1003).forEach(p -> System.out.println(p.getName()));
		
		String pname = person.stream().filter(p -> p.getId() == 1003).map(s -> s.getName()).reduce("", String::concat);
		String pnamea = person.stream().filter(p -> p.getId() == 1003).map(s -> s.getName()).collect(Collectors.joining(""));
		System.out.println(pname);
		System.out.println(pnamea);
		String idname = person.stream().filter(p -> p.getSalary() == 8985.40).map(s -> s.getId()+","+s.getName()).collect(Collectors.joining(""));
		System.out.println(idname);
		
		System.out.println("------------------------------------------------------");
		
		PersonBean updperson = person.stream().filter(p -> p.getName().equals("stine")).findAny().orElse(null);
		System.out.println(updperson.toString());
		
		System.out.println("------------------------------------------------------");
		
		double sal = person.stream().filter(p -> { if(p.getName().equals("tim") && p.getId() == 1001)
													return true;
		return false;
		}).collect(Collectors.averagingDouble(v -> v.getSalary()));
		
		System.out.println(sal);
		
		double sala = person.stream().filter(p -> { if(p.getName().equals("tim") && p.getId() == 1001)
															return true;
												return false;
												}).map(p -> p.getSalary()).findAny().orElse(null);
		
		System.out.println(sala);
		
		System.out.println("------------------------------------------------------");
		
		String all = li.stream().sorted().map(i -> String.valueOf(i)).collect(Collectors.joining(","));
		System.out.println(all);
		
	}
	

}
