package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
//使用命令控制符运行程序:
//bin 里面的是class文件 src 里面的是Java文件
//进入到bin  如果是包  就是包名+类名
public class Demo1receiver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//建立udp服务   并且接听一个端口
		DatagramSocket datagramSocket = new DatagramSocket(999);
		//准备空的数据包存放数据
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		//接收数据  这个时候数据已经存储在字节数组中
		datagramSocket.receive(datagramPacket);
		//打印数据                                                                                                                                              这边 因为可能数据没有1024，所以使用datagramPacket.getLength()
		System.out.println("接收到的数据为："+new String(buf, 0, datagramPacket.getLength()));
		//关闭资源
		datagramSocket.close();
				

	}

}
