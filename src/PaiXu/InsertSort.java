package PaiXu;

public class InsertSort {

	/**
	 * 插入排序：
	 * ①从第一个元素开始，该元素可以认为已经被排序
	 * ②取出下一个元素，在已经排序的元素序列中从后向前扫描
	 * ③如果该元素（已排序）大于新元素，将该元素移到下一位置 
	 * ④重复步骤3，直到找到已排序的元素小于或者等于新元素的位置 
	 * ⑤将新元素插入到该位置中
	 * ⑥重复步骤2
	 * 
	 * @param a 
	 */
	public static void insertSort(int[] a) {
		int size = a.length;
		int temp;
		int j;
		for (int i = 1; i < size; i++) {
			temp = a[i];
			for (j = i; j > 0 && temp < a[j - 1]; j--)
				a[j] = a[j - 1];
			a[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] a = { 25, 5, 6, 8, 9, 4, 52, 4, 5, 65 };
		insertSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
