package cn.itcast.udp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Demo2ChatSender extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			DatagramSocket socket = new DatagramSocket();//建立udp服务
			//准备数据  键盘录入数据
			boolean flag =true;
		
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line = reader.readLine())!=null){
				
				DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("192.168.0.255"), 12000);
				socket.send(packet);
			}
			
			socket.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
