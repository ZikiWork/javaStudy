package javaTest;

public class Weiyunsuan {
	private Integer x = 0;

	public void say() {
		Integer x = 0;

	}

	public static void main(String[] args) {

		int a = 65 & 123;
		int b = 65 | 123;
		int c = 65 ^ 123;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("----------------");
		System.out.println(9.9 / 3.3f);
		System.out.println(((int) 3.9) % 2);
		System.out.println(4 | 7);
		int result = "0123456789".lastIndexOf("7");
		System.out.println(result);
		// System.out.println("C"-"A");
	}
}
