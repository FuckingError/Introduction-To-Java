package cn.itcast.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1Client {
	public static void main(String[] args) throws Exception, Exception{
		//����tcp����
		Socket socket  = new Socket(InetAddress.getLocalHost(), 9090);
		//��ȡ�����  
	    OutputStream outputStream = socket.getOutputStream();
	    //�������
	    outputStream.write("�������ã�".getBytes());
	    //�ر���Դ
	    socket.close();
	}

}
