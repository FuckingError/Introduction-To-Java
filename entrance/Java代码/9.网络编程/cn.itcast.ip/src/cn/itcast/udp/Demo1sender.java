package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo1sender {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����udp����
		DatagramSocket datagramSocket  = new DatagramSocket();
		//׼�����ݣ������ݷ�װ�����ݰ���
		String data = "Ѧ���ã���ϲ���㣡����";
	    //��װΪ���ݰ�
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length,InetAddress.getLocalHost(), 999);
		//����datagramSocket�������ݰ�
		datagramSocket.send(datagramPacket);
		//�ر���Դ
		datagramSocket.close();

	}

}
