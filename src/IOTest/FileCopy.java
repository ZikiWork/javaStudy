package IOTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {

	/**
	 * 实现目标文件的拷贝
	 * 
	 * @param path1 目标文件
	 * @param path2 拷贝过后文件名
	 * @throws IOException
	 */
	public static void fileCopy(String path1, String path2) throws IOException {
		if (path1 == null || path1.length() == 0) {
			throw new FileNotFoundException("目标文件不存在！");
		}
		if (path2 == null || path2.length() == 0) {
			throw new FileNotFoundException("目标文件不存在！");
		}
		File file = new File(path1);
		InputStream Is = new FileInputStream(file);
		OutputStream Os = new FileOutputStream(path2);
		byte[] b = new byte[1024];// 读取数据字节
		int length = 0;
		while ((length = Is.read(b, 0, b.length)) != -1) {
			Os.write(b, 0, length);
		}
		Is.close();
		Os.close();
	}

	/**
	 * 复制文件！
	 * 
	 * @param path1
	 * @param path2
	 * @throws IOException
	 */
	public static void fileCopy3(String path1, String path2) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(path1);
		FileOutputStream fileOutputStream = new FileOutputStream(path2);
		byte[] date = new byte[2048];
		int length;
		while ((length = fileInputStream.read(date, 0, date.length)) != -1) {
			fileOutputStream.write(date, 0, length);
		}
		fileInputStream.close();
		fileOutputStream.close();
	}

	/**
	 * 复制文本文件！
	 * 
	 * @param path1
	 * @param path2
	 * @throws IOException
	 */
	public static void fileCopy2(String path1, String path2) throws IOException {
		Reader reader = new FileReader(path1);
		BufferedReader bufferedReader = new BufferedReader(reader);
		Writer writer = new FileWriter(path2);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		String s = null;
		while ((s = bufferedReader.readLine()) != null) {
			bufferedWriter.write(s);
		}
		bufferedReader.close();
		bufferedWriter.close();
	}

	public static void main(String[] args) throws IOException {
		// fileCopy("F:\\QQ文件\\周志华-机器学习.pdf", "F:\\QQ文件\\周志华-机器学习1.pdf");
		// fileCopy2("F:\\QQ文件\\ser.c", "F:\\QQ文件\\ser1.c");
		// fileCopy3("F:\\QQ文件\\百度云盘加速器.zip", "F:\\QQ文件\\百度云盘加速器1.zip");
	}
}
