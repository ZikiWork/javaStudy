package com.zhou.stack;

public class TestSatck {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);

		System.out.println(stack.pop());
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
