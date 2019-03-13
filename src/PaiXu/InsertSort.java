package PaiXu;

public class InsertSort {

	/**
	 * ��������
	 * �ٴӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
	 * ��ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ��
	 * �������Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ�� 
	 * ���ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ�� 
	 * �ݽ���Ԫ�ز��뵽��λ����
	 * ���ظ�����2
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
