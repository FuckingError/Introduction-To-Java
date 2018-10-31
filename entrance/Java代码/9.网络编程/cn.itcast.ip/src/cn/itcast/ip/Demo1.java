package cn.itcast.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		//获取本机的ip地址对象
		
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("ip地址："+address.getHostAddress());
		System.out.println("用户名:"+address.getHostName());
		
		
		
		/*//获取他人的ip地址对象
		InetAddress address = InetAddress.getByName("112.3.203.3");
		System.out.println("ip地址:"+address.getHostAddress());
		System.out.println("用户名："+address.getHostName());
		*/
	}

}
