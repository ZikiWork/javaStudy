package PaiXu;

public class QuickSort01 {

	/**
	 * ¿ìÅÅ
	 * @param a
	 * @param start
	 * @param end
	 */
	public static void quickSort01(int[] a, int start, int end) {
		if (start >= end)
			return;
		int i = start;
		int j = end;
		int base = a[start];
		while (i != j) {
			while (a[j] >= base && j > i)
				j--;
			while (a[i] <= base && i < j)
				i++;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[start] = a[i];
		a[i] = base;
		quickSort01(a, start, i - 1);
		quickSort01(a, i + 1, end);
	} 

	public static void main(String[] args) {
		int[] a = { 25, -5, 6, 8, 9, -4, 52, 4, 5, 65 };
		int low = 0;
		int high = a.length - 1;
		quickSort01(a, low, high);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
