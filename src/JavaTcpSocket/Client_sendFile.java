package JavaTcpSocket;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 向服务器发送文件！
 * @author Administrator
 *
 */
public class Client_sendFile {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("localhost", 8888);
		OutputStream outputStream = socket.getOutputStream();
		
		InputStream is = new FileInputStream(new File("txt\\3.txt"));
		
		byte[] b = new byte[1024];
		int length = 0;
		while ((length = is.read(b, 0, b.length)) != -1) {
			outputStream.write(b, 0, length);
		}
		
		is.close();
		outputStream.close();
		socket.close();
		
	}
}
