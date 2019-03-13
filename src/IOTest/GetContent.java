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
	 * 将文件中的字符串排好序后写入新的文件中！
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
		while ((s = bufferedReader.readLine()) != null) {// 循环读出文件的数据。
			name.add(s);
		}
		bufferedReader.close();
		Collections.sort(name, new Comparator<String>() {// 把集合里面的元素按规则排序！
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);// 升序规则。
			}
		});
		for (String string : name) {
			bufferedWriter.write(string);
			bufferedWriter.newLine();// 换行！
		}

		bufferedWriter.close();
	}

	public static void main(String[] args) throws IOException {
		getContent("txt\\3.txt", "txt\\4.txt");
	}
}
