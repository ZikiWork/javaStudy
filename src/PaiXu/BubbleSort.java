package PaiXu;

public class BubbleSort {

	/**
	 * ð������
	 * 
	 * @param a
	 */
	public static void bubbleSort(int[] a) {
		int temp;
		int size = a.length;
		for (int i = 1; i < size; i++) {// i��1��ʼ
			for (int j = 0; j < size - i; j++) {// jС��size��i
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 52, 2, 36, 8, 78, 1, 2, 56 };
		bubbleSort(a);
	}
}
