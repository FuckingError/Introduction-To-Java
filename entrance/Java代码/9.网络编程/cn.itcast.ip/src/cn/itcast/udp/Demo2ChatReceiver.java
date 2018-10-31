package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo2ChatReceiver extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//建立udp服务，监听一个端口
		try {
			DatagramSocket socket = new DatagramSocket(12000);
			//建立一个空的数据包
			byte[] buf = new byte[1024];
			//Ip地址在packet里面
			DatagramPacket packet = new DatagramPacket(buf,buf.length); 
			boolean flag = true;
			while(flag){
				socket.receive(packet);
				System.out.println(packet.getAddress().getLocalHost()+":"+new String(buf,0,packet.getLength()));
			}
			socket.close();
	
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
