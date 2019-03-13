package JavaDategramSocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception {

		DatagramSocket socket = new DatagramSocket();
		String msg = "hello";// ���͵�����
		DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
		packet.setAddress(InetAddress.getByName("localhost"));
		packet.setPort(9000);
		socket.send(packet);// ����������������

		socket.receive(packet);// �õ����������ص���Ϣ��
		byte[] data = packet.getData();
		int length = packet.getLength();
		int offset = packet.getOffset();
		String s = new String(data, offset, length);
		System.out.println(s);
		// socket.close();

	}
}
