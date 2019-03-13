package IOTest;

import java.io.File;

public class GetFiles {

	/**
	 * 获取指定路径下的所有文件 以及包含在内的文件夹下的文件！
	 * 
	 * @param path
	 * @throws Exception
	 */
	public static void getFiles(String path) throws Exception {
		if (path == null || path.length() == 0) {
			throw new Exception("文件格式不正确！");
		}
		File file = new File(path);
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.isFile()) {
				System.out.println(file2);
			}
			if (file2.isDirectory()) {
				getFiles(path + "/" + file2.getName());// 递归查找！
			}
		}
	}

	public static void main(String[] args) throws Exception {

		getFiles("D:\\电子书籍\\资料");

	}
}
