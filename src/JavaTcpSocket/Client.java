package JavaTcpSocket;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("localhost", 8888);
		OutputStream outputStream = socket.getOutputStream();
//		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//		dataOutputStream.writeUTF("hello");
		//·¢ËÍ×Ö·û´®
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
		bw.write("hello server!");
		bw.close();
		socket.close();
		
		
	}
}
