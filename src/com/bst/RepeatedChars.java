package com.bst;

public class RepeatedChars {

	public static void main(String[] args) {
		String str = "abcdddbnnkkk";
		repeatedChars(str);
	}
	
	static void repeatedChars(String str) {
		for (int i = 0; i < str.length();) {
			int index = runTo(str, i);
			if (index > i) {
				System.out.println(str.substring(i, index+1));
				i = index+1;
			}
			else {
				i++;
			}
		}
	}
	
	static int runTo(String str, int index) {
		
		for (int i = index; i < str.length(); i++) {
			if (i == str.length()-1 || str.charAt(i) != str.charAt(i+1)) 
				return i;		
		}
		return -1;
	}
}
