package com.refresher;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUtil {
	static Stack<Character> stack = new Stack<Character>();
	static Queue<Character> queue = new LinkedList<>();
	
	public void pushCharacter(char ch) {
		stack.push(ch);
	}
	
	public char popCharacter() {
		return stack.pop();
	}
	
	public void enqueueCharacter(char ch) {
		queue.add(ch);
	}
	
	public static char dequeueCharacter() {
		return queue.remove();
	}
	
	public boolean isPalindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			pushCharacter(str.charAt(i));
			enqueueCharacter(str.charAt(i));
		}
		for (int i = 0; i < str.length(); i++) {
			if (popCharacter() != dequeueCharacter()) {
				return false;
			}
		}
		return true;
	}
}
