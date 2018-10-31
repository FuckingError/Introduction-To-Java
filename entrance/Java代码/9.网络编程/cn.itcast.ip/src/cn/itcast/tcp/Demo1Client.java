package cn.itcast.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1Client {
	public static void main(String[] args) throws Exception, Exception{
		//建立tcp服务
		Socket socket  = new Socket(InetAddress.getLocalHost(), 9090);
		//获取输出流  
	    OutputStream outputStream = socket.getOutputStream();
	    //输出数据
	    outputStream.write("服务端你好！".getBytes());
	    //关闭资源
	    socket.close();
	}

}
