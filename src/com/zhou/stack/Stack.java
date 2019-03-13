package com.zhou.stack;

public class Stack {

	private Object data[];
	private int len;

	Stack() {
		this.data = new Object[10];
		this.len = 0;
	}

	public Boolean isEmpty() {
		return len == 0;
	}

	public void push(Object obj) {
		data[len] = obj;
		len++;
	}

	public Object pop() {
		if (isEmpty()) {
			return "Õ»Îª¿Õ£¡";
		} else {
			len--;
		}
		return data[len];
	}

}
