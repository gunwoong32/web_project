package mega;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//������ü�� ��������.
		ServerSocket server = new ServerSocket(9100);
		System.out.println("server start!!");
		int count = 0;
		while (true) {
			System.out.println("wait request!!");
			server.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����!!"+ ++count);
			if (count == 1000) {
				break;
			}
		}
		//server.close();
	}

}
