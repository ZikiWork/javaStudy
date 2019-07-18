package PaiXu;

public class SelectSort {

	/** 
	 * ѡ������:
	 * ��δ�����������ҵ���СԪ�أ���ŵ��������е���ʼλ��  
 	 * �ٴ�ʣ��δ����Ԫ���м���Ѱ����СԪ�أ�Ȼ��ŵ�����������ʼλ�á�  
 	 * �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ� 
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
