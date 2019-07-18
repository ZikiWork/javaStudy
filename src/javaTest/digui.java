package javaTest;

public class digui {

	public static void test(int times) {
		float H = 100, L = 0;
		for (int i = 1; i <= times; i++) {
			if (i == 1) {
				L = H;
				H = H / 2;
			} else {
				L += 2 * H;
				H = H / 2;
			}
		}
		System.out.println(H);
		System.out.println(L);
	}

	public static void main(String[] args) {
		test(5);
	}

}   
