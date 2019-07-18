 package com.stack;

/**
 * ��������ʵ��˳��ջ
 * 
 * @author Administrator
 * @param <E>
 */

public class Stack<E> {
	private Object[] data = null;
	private int maxSize = 0; // ջ����
	private int top = -1; // ջ��ָ��

	/**
	 * ���캯�������ݸ�����size��ʼ��ջ
	 */
	Stack() {
		this(10); // Ĭ��ջ��СΪ10
	}

	Stack(int initialSize) {
		if (initialSize >= 0) {
			this.maxSize = initialSize;
			data = new Object[initialSize];
			top = -1;
		} else {
			throw new RuntimeException("��ʼ����С����С��0��" + initialSize);
		}
	}

	// �п�
	public boolean empty() {
		return top == -1 ? true : false;
	}

	// ��ջ,��һ��Ԫ��top=0��
	public boolean push(E e) {
		if (top == maxSize - 1) {
			throw new RuntimeException("ջ�������޷���Ԫ����ջ��");
		} else {
			data[++top] = e;
			return true;
		}
	}

	// �鿴ջ��Ԫ�ص����Ƴ�
	@SuppressWarnings("unchecked")
	public E peek() {
		if (top == -1) {
			throw new RuntimeException("ջΪ�գ�");
		} else {
			return (E) data[top];
		}
	}

	// ����ջ��Ԫ��
	@SuppressWarnings("unchecked")
	public E pop() {
		if (top == -1) {
			throw new RuntimeException("ջΪ�գ�");
		} else {
			return (E) data[top--];
		}
	}

	// ���ض����ڶ�ջ�е�λ�ã��� 1 Ϊ����
	public int search(E e) {
		int i = top;
		while (top != -1) {
			if (peek() != e) {
				top--;
			} else {
				break;
			}
		}
		int result = top + 1;
		top = i;
		return result;
	}
}
