package com.bst;

import java.util.Arrays;
import java.util.List;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abppplee";
		List<String> list = Arrays.asList("able", "ale", "apple", "bale", "kangaroo");
		//System.out.println(list.get(0));
		longestSubString(str, list);

	}
	
	static void longestSubString(String str, List<String> list) {
		
		String maxSubString = "";
		for (String current: list) {
			int l = 0, r = str.length()-1;
			int i = 0;
			String tmp = "";
			while (l < r) {
				if (str.charAt(l) == current.charAt(i)) {
					tmp += Character.toString(str.charAt(l));
					l++;
					i++;
					
				} else {
					l++;
				}
			}
			if (tmp.equals(current) && current.length() > maxSubString.length()) {
				maxSubString = current;
			}
		}
		
		System.out.println(maxSubString);
	}
}
