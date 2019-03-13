package PaiXu;

public class StringSrot {

	/**
	 * 使用StringBuffer进行字符串的倒序 reverse()方法
	 * 
	 * @param s 字符串
	 * @return StringBuffer
	 */
	public static StringBuffer buffer(String s) {
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		return sb.reverse();
	}

	public static String string(String s) {
		char[] array = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			array[i] = s.charAt(s.length() - i - 1);
			array[s.length() - i - 1] = s.charAt(i);
		}
		return new String(array);

	}

	public static void main(String[] args) {
		StringBuffer s = buffer("asdfergsdfdsf");
		System.out.println(s);

		String str = string("sadasdada");
		System.out.println(str);

	}
}
