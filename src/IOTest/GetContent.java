package IOTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GetContent {

	/**
	 * ���ļ��е��ַ����ź����д���µ��ļ��У�
	 * 
	 * @param path1
	 * @param path2
	 * @throws IOException
	 */
	public static void getContent(String path1, String path2) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2));
		ArrayList<String> name = new ArrayList<>();
		String s = null;
		while ((s = bufferedReader.readLine()) != null) {// ѭ�������ļ������ݡ�
			name.add(s);
		}
		bufferedReader.close();
		Collections.sort(name, new Comparator<String>() {// �Ѽ��������Ԫ�ذ���������
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);// �������
			}
		});
		for (String string : name) {
			bufferedWriter.write(string);
			bufferedWriter.newLine();// ���У�
		}

		bufferedWriter.close();
	}

	public static void main(String[] args) throws IOException {
		getContent("txt\\3.txt", "txt\\4.txt");
	}
}
