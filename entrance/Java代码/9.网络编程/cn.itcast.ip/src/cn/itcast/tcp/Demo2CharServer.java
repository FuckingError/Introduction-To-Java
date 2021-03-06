package cn.itcast.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Demo2CharServer {
	public static void main(String[] args) throws IOException{
		//建立Tcp服务端
		ServerSocket serverSocket = new ServerSocket(9090);
		//接收
		Socket socket = serverSocket.accept();
		//获取输入流
		BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//获取socket的输出流对象
	    OutputStreamWriter socketOutput = new OutputStreamWriter(socket.getOutputStream());
	    //获取键盘输入流对象 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
		String line = null;
		while((line = socketInput.readLine()) != null){
			System.out.println("已经接受");
			System.out.println("读取到的数据："+line);
			//读到客户端发来的数据后 发送数据给客户端
			line = bufferedReader.readLine();
            socketOutput.write(line+"\r\n");
            //OutputStreamWriter 要刷新
            socketOutput.flush();
        }
		serverSocket.close();
	}

}
