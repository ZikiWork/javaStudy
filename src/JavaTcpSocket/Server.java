package JavaTcpSocket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8888);
		while (true) {//使用死循环让其不停监听！
			Socket socket = serverSocket.accept();
			InputStream is = socket.getInputStream();
			System.out.println("1");
//			DataInputStream dataInputStream = new DataInputStream(is);
//			System.out.println(dataInputStream.readUTF());
			
//			// 接受 字符串
//			BufferedReader br = new BufferedReader(new InputStreamReader(is));
//			String re = br.readLine();
//			br.close();
//			System.out.println(re);
			OutputStream os = new FileOutputStream(new File("txt\\5.txt"));
			byte[] b = new byte[1024];// 读取数据字节
			int length = 0;
			while ((length = is.read(b, 0, b.length)) != -1) {
				os.write(b, 0, length);
			}
			is.close();
			os.close();
			System.out.println("结束");
		}
	}

}
