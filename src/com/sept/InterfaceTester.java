package com.sept;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class InterfaceTester {
	public static void main(String[] args) {
		/*
		Car car = new Car();
		car.print();
		*/
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		//System.out.println(filtered);
		
		/*
		Random random = new Random();
		random.ints().limit(5).forEach(System.out::println);
		*/
		
		/*
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squares = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squares);
		*/
		
		/*
		int count = (int)strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		*/
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		System.out.println(stats.getAverage());

	}
}

interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle.");
	}
	
	static void blowHorn() {
		System.out.println("Blowing horn.");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("I am a four wheeler.");
	}
}

class Car implements Vehicle, FourWheeler {
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car.");
	}
}

