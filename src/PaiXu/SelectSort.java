package PaiXu;

public class SelectSort {

	/** 
	 * 选择排序:
	 * 在未排序序列中找到最小元素，存放到排序序列的起始位置  
 	 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列起始位置。  
 	 * 以此类推，直到所有元素均排序完毕。 
	 * @param a
	 */
	public static void selectSort(int[] a) {
		int temp;
		int size = a.length;
		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = size - 1; j > i; j--) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
		}
	}

	public static void main(String[] args) {
		int[] a = { 25, 5, 6, 8, 9, 4, -52, 4, 5, 65 };
		selectSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
