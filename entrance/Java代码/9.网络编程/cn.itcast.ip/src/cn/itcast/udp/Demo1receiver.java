package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
//ʹ��������Ʒ����г���:
//bin �������class�ļ� src �������Java�ļ�
//���뵽bin  ����ǰ�  ���ǰ���+����
public class Demo1receiver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����udp����   ���ҽ���һ���˿�
		DatagramSocket datagramSocket = new DatagramSocket(999);
		//׼���յ����ݰ��������
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		//��������  ���ʱ�������Ѿ��洢���ֽ�������
		datagramSocket.receive(datagramPacket);
		//��ӡ����                                                                                                                                              ��� ��Ϊ��������û��1024������ʹ��datagramPacket.getLength()
		System.out.println("���յ�������Ϊ��"+new String(buf, 0, datagramPacket.getLength()));
		//�ر���Դ
		datagramSocket.close();
				

	}

}
