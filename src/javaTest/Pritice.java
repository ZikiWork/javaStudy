package javaTest;

public class Pritice {

	public static void main(String[] args) throws Exception {
		// do2();
		//do7();
		do8();
		//throw new Exception("");
	}

	public void do1() {
		short s1 = 1;
		// s1 = s1 + 1;//int�Ͳ��ܸ�ֵΪshort���ͣ�
		s1 += 1;
	}

	public static void do2() {
		short x = 3;
		x += 4.6;// ����ǿתΪshort���ͣ�
		System.out.print(x);
	}

	public static void do3() {
		int i = 5;
		long j = 8;
		// i = i + j;
		i += j;
	}

	public static void do4() {
		int num = 20;
		final int num2;
		num2 = 20;
		switch (num) {
		default:
			System.out.println("default");
			// case num2://num2���ǳ������ʽ��
			System.out.println(4);
			break;
		}
	}

	public static void do5() {
		int num = 120;
		switch (num) {
		default:
			System.out.println("default");
		case 0:
			System.out.println("case1");
			// case 10 * 2 - 20: //���ܳ����ظ���case!
			System.out.println("case2");
			break;
		}
	}

	public static void do8() {
		System.out.println("" + 'a' + 1);
		System.out.println( + 'a' + 1);//a��ASCII����97 �ټ���1 ����Ϊ98������
	}

	public static void do6() {
		float f=1.1f;
		double d=1.1;
		long l=4990;
		int i = 10;
		do
			while (i++ < 15)
				i = i + 20;
		while (i < 2);
		System.out.println(i);
	}

	/**
	 * ʱ �������Ϊ�������ͳ����������ͣ� double ��Ĭ��С������û�м�F�� ��ΪDouble�ͣ� ��
	 */
	public static void do7() {
		int num1 = 10, num2 = 2;
		System.out.println(num1 < num2 ? 9.9 : 9);
		System.out.println(num1 > num2 ? 9 : 9.9);

		double d = 9.9;
		long l = 100;
		// long r=d+l;
		double r = d + l;// �ó�double�ķ�Χ����
	}

}
