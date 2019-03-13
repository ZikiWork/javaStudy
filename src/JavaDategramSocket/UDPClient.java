package JavaDategramSocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception {

		DatagramSocket socket = new DatagramSocket();
		String msg = "hello";// 发送的数据
		DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
		packet.setAddress(InetAddress.getByName("localhost"));
		packet.setPort(9000);
		socket.send(packet);// 发送数据至服务器

		socket.receive(packet);// 得到服务器返回的信息！
		byte[] data = packet.getData();
		int length = packet.getLength();
		int offset = packet.getOffset();
		String s = new String(data, offset, length);
		System.out.println(s);
		// socket.close();

	}
}
