package IOTest;

import java.io.File;

public class GetFiles {

	/**
	 * ��ȡָ��·���µ������ļ� �Լ��������ڵ��ļ����µ��ļ���
	 * 
	 * @param path
	 * @throws Exception
	 */
	public static void getFiles(String path) throws Exception {
		if (path == null || path.length() == 0) {
			throw new Exception("�ļ���ʽ����ȷ��");
		}
		File file = new File(path);
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.isFile()) {
				System.out.println(file2);
			}
			if (file2.isDirectory()) {
				getFiles(path + "/" + file2.getName());// �ݹ���ң�
			}
		}
	}

	public static void main(String[] args) throws Exception {

		getFiles("D:\\�����鼮\\����");

	}
}
