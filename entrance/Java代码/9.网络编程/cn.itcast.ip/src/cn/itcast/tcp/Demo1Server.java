package cn.itcast.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1Server {
//使用控制台运行程序的注意点：
/*1.首先要进入盘符 直接写盘符 例：E：
 *2.进入bin目录  bin里面是class文件  src里面是java文件 
 *3.运行程序 java 包名.类名 
 * */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//建立tcp服务 监听一个端口
		ServerSocket serverSocket = new ServerSocket(9090);
		//接收客户端的连接
		Socket socket = serverSocket.accept();
		//获取输入流
		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		System.out.println(new String(buf,0,length));
		serverSocket.close();
		

	}

}
