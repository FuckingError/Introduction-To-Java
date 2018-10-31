package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo1sender {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//建立udp服务
		DatagramSocket datagramSocket  = new DatagramSocket();
		//准备数据，把数据分装到数据包中
		String data = "薛钰婷，我喜欢你！！！";
	    //封装为数据包
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length,InetAddress.getLocalHost(), 999);
		//调用datagramSocket发送数据包
		datagramSocket.send(datagramPacket);
		//关闭资源
		datagramSocket.close();

	}

}
