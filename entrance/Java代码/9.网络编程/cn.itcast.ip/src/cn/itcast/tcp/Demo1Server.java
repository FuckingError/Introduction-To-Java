package cn.itcast.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1Server {
//ʹ�ÿ���̨���г����ע��㣺
/*1.����Ҫ�����̷� ֱ��д�̷� ����E��
 *2.����binĿ¼  bin������class�ļ�  src������java�ļ� 
 *3.���г��� java ����.���� 
 * */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//����tcp���� ����һ���˿�
		ServerSocket serverSocket = new ServerSocket(9090);
		//���տͻ��˵�����
		Socket socket = serverSocket.accept();
		//��ȡ������
		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		System.out.println(new String(buf,0,length));
		serverSocket.close();
		

	}

}
