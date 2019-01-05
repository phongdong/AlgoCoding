package com.bst;

import java.util.HashMap;

public class FirstNonRepeatedChar {
	static int firstNonRepeatedChar(String string) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			if (!hm.containsKey(c)) {
				hm.put(c, 1);
			} else {
				int count =  hm.get(c);
				hm.put(c, count++);
			}
		}
		
		for (int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			if (!c.equals(' ') && hm.get(c) == 1)
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		String input = " tutorial horizon";
		int index = firstNonRepeatedChar(input);
		if (index == -1)
			System.out.println("no chars");
		else 
			System.out.printf("first chars is : %s - at %d", input.charAt(index), index);

	}

}
