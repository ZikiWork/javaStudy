package com.zhou.stack;

public class TestQuen {

	public static void main(String[] args) {
		Quen quen = new Quen();
		for (int i = 0; i < 10; i++) {
			quen.push(i);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(quen.pup());
		}
	}
}
