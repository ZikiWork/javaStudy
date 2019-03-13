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
	 * ʵ��Ŀ���ļ��Ŀ���
	 * 
	 * @param path1 Ŀ���ļ�
	 * @param path2 ���������ļ���
	 * @throws IOException
	 */
	public static void fileCopy(String path1, String path2) throws IOException {
		if (path1 == null || path1.length() == 0) {
			throw new FileNotFoundException("Ŀ���ļ������ڣ�");
		}
		if (path2 == null || path2.length() == 0) {
			throw new FileNotFoundException("Ŀ���ļ������ڣ�");
		}
		File file = new File(path1);
		InputStream Is = new FileInputStream(file);
		OutputStream Os = new FileOutputStream(path2);
		byte[] b = new byte[1024];// ��ȡ�����ֽ�
		int length = 0;
		while ((length = Is.read(b, 0, b.length)) != -1) {
			Os.write(b, 0, length);
		}
		Is.close();
		Os.close();
	}

	/**
	 * �����ļ���
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
	 * �����ı��ļ���
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
		// fileCopy("F:\\QQ�ļ�\\��־��-����ѧϰ.pdf", "F:\\QQ�ļ�\\��־��-����ѧϰ1.pdf");
		// fileCopy2("F:\\QQ�ļ�\\ser.c", "F:\\QQ�ļ�\\ser1.c");
		// fileCopy3("F:\\QQ�ļ�\\�ٶ����̼�����.zip", "F:\\QQ�ļ�\\�ٶ����̼�����1.zip");
	}
}
