package cn.itcast.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		//��ȡ������ip��ַ����
		
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("ip��ַ��"+address.getHostAddress());
		System.out.println("�û���:"+address.getHostName());
		
		
		
		/*//��ȡ���˵�ip��ַ����
		InetAddress address = InetAddress.getByName("112.3.203.3");
		System.out.println("ip��ַ:"+address.getHostAddress());
		System.out.println("�û�����"+address.getHostName());
		*/
	}

}
