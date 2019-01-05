package com.sept;

import java.util.List;

public class BalancedParenthesis {

	public static void main(String[] args) {
		printParenthesis(4);
//		List<String> list = new ArrayList<>();
//		int n = 3;
//		char[] current = new char[2*n];
//		generateAll(current, 0, list);
//		
//		System.out.println(list);
		
	}
	
	static void printParenthesis(int n) {
		validParenthesis(n, n, "");
	}
	
	static void validParenthesis(int openP, int closeP, String str) {
		if (openP == 0 && closeP == 0) {
			System.out.println(str);
		} 
		if (openP > closeP)
			return;
		if (openP > 0)
			validParenthesis(openP-1, closeP, str+"(");
		if (closeP > 0)
			validParenthesis(openP, closeP-1,  str+")");
		
	}
	static void generateAll(char[] current, int pos, List<String> list) {
		if (pos == current.length) {
			if (isValidParenthesis(current))
				list.add(new String(current));
		} else {
			current[pos] = '(';
			generateAll(current, pos+1, list);
			current[pos] = ')';
			generateAll(current, pos+1, list);
		}
	}
	
	static boolean isValidParenthesis(char[] current) {
		int balance = 0;
		for(int i = 0; i < current.length; i++) {
			if (current[i] == '(') balance++;
			else balance--;
			if (balance < 0) return false;
		}
		return balance == 0;
	}
	
	
}
