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
	 * @param filePath     Ŀ���ļ�
	 * @param copyFilePath ���������ļ���
	 * @throws IOException
	 */
	public static void fileCopy(String filePath, String copyFilePath) throws IOException {
		if (filePath == null || filePath.length() == 0) {
			throw new FileNotFoundException("Ŀ���ļ������ڣ�");
		}
		File file = new File(filePath);
		InputStream Is = new FileInputStream(file);
		OutputStream Os = new FileOutputStream(copyFilePath);
		// �Զ��建�����
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
	 * @param filePath
	 * @param copyFilePath
	 * @throws IOException
	 */
	public static void fileCopy3(String filePath, String copyFilePath) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		FileOutputStream fileOutputStream = new FileOutputStream(copyFilePath);
		byte[] date = new byte[2048];
		int length;
		while ((length = fileInputStream.read(date, 0, date.length)) != -1) {
			fileOutputStream.write(date, 0, length);
		}
		fileInputStream.close();
		fileOutputStream.close();
	}

	/**
	 * ���и����ļ���
	 * 
	 * @param filePath
	 * @param copyFilePath
	 * @throws IOException
	 */
	public static void fileCopy2(String filePath, String copyFilePath) throws IOException {
		Reader reader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(reader);
		Writer writer = new FileWriter(copyFilePath);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		String s = null;
		while ((s = bufferedReader.readLine()) != null) {
			bufferedWriter.write(s);
		}
		bufferedReader.close();
		bufferedWriter.close();
	}

	/**
	 * �ļ����Ʋ��޸�ÿһ�п�ͷ��
	 * 
	 * @throws IOException
	 */
	public static void fileCopy4(String filePath, String copyPath) throws IOException {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		File file = new File(filePath);
		if (!file.exists()) {
			System.out.println("�ļ������ڣ�");
			file.createNewFile();
			System.out.print("�����ļ���" + file.getPath());
		}
		reader = new BufferedReader(new FileReader(filePath));
		writer = new BufferedWriter(new FileWriter(copyPath));
		String line = null;
		@SuppressWarnings("unused")
		int lineNumber = 0;
		while ((line = reader.readLine()) != null) {
			writer.write("*" + line + "\n");
			lineNumber++;
		}
		reader.close();
		writer.close();
	}

	public static void main(String[] args) throws IOException {
		fileCopy("F:\\QQ�ļ�\\��־��-����ѧϰ.pdf", "F:\\QQ�ļ�\\��־��-����ѧϰ1.pdf");
		// fileCopy4("F:\\QQ�ļ�\\test.sql", "F:\\QQ�ļ�\\testcopy.sql");
		System.out.println("success");
		// fileCopy3("F:\\QQ�ļ�\\�ٶ����̼�����.zip", "F:\\QQ�ļ�\\�ٶ����̼�����1.zip");
	}

}
