package com.sept;

import java.util.ArrayList;
import java.util.List;



public class Java8Practice {
	
	final static String salutation = "Hello! ";
	

	public static void main(String[] args) {
		
		
		GreetingServices greetingService1 = (name) -> System.out.println(salutation + name);
		greetingService1.sayMessage("Phong");
		
		List<String> names = new ArrayList<>();
		
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      names.forEach(System.out::println);

	}
	
	interface GreetingServices {
		void sayMessage(String str);
	}

}
