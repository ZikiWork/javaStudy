package com.zhou.stack;

public class Quen {

	private Object data[] = null;
	private int len = 0;

	public Quen() {
		this.data = new Object[10];
	}

	public Boolean isEmpty() {
		return len == 0;
	}

	public int size() {
		return len;
	}

	public Object push(Object obj) {
		data[len] = obj;
		len++;
		if (len > data.length) {
			return "队列已满！";
		}
		return "";
	}

	public Object pup() {
		Object obj;
		if (isEmpty()) {
			return "队已空！";
		} else {
			obj = data[0];
			for (int i = 0; i < len - 1; i++) {
				data[i] = data[i + 1];
			}
			len--;
		}
		return obj;
	}
}
