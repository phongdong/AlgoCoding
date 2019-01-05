package com.bst;

import java.util.ArrayList;
import java.util.List;

public class MemLeak {
	
	public static List<Integer> list = new ArrayList<>();
	public static void memoryLeak() {
		list.add(new Integer(0));
	}
	
	public static void main(String[] args) 
	{
		while (true) {
			memoryLeak();
		}
	}
}
