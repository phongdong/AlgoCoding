package com.refresher;

import java.util.Stack;
public class StackUtil 
{
	public boolean isBalancedParenthesis(String str) {
		Stack<Character> stack = new Stack<>();
		for (Character c: str.toCharArray()) {
			if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (c == '(')
				stack.push(')');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}
