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
	 * @param filePath     目标文件
	 * @param copyFilePath 拷贝过后文件名
	 * @throws IOException
	 */
	public static void fileCopy(String filePath, String copyFilePath) throws IOException {
		if (filePath == null || filePath.length() == 0) {
			throw new FileNotFoundException("目标文件不存在！");
		}
		File file = new File(filePath);
		InputStream Is = new FileInputStream(file);
		OutputStream Os = new FileOutputStream(copyFilePath);
		// 自定义缓冲对象
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
	 * 按行复制文件！
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
	 * 文件复制并修改每一行开头！
	 * 
	 * @throws IOException
	 */
	public static void fileCopy4(String filePath, String copyPath) throws IOException {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		File file = new File(filePath);
		if (!file.exists()) {
			System.out.println("文件不存在！");
			file.createNewFile();
			System.out.print("创建文件：" + file.getPath());
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
		fileCopy("F:\\QQ文件\\周志华-机器学习.pdf", "F:\\QQ文件\\周志华-机器学习1.pdf");
		// fileCopy4("F:\\QQ文件\\test.sql", "F:\\QQ文件\\testcopy.sql");
		System.out.println("success");
		// fileCopy3("F:\\QQ文件\\百度云盘加速器.zip", "F:\\QQ文件\\百度云盘加速器1.zip");
	}

}
