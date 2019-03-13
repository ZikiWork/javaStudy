package JavaDategramSocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP��̣�
 * @author Administrator
 *
 */
public class UDPServer {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(9000);
		while (true) {
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
			socket.receive(packet);// ���տͻ������ݣ�
			byte[] data = packet.getData();
			int length = packet.getLength();
			int offset = packet.getOffset();
			String s = new String(data, offset, length);
			System.out.println(s);
			socket.send(packet);// ��ͻ��˷������ݣ�
		}
	}
}
