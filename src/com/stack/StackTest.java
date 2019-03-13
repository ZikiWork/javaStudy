package com.stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		for (int i = 0; i < 10; i++) {
			System.out.println(stack.pop());
		}
	}
}
