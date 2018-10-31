package cn.itcast.tcp;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.SocketSecurityException;

//模拟浏览器  多用户可以连接
//tcp 多线程: 1.一个ServerSocket()放在主方法  2.while()不断的接受连接  开启线程 3.run方法里面 获取socket的输出流和后续程序 
public class Demo3ImageServer extends Thread {
	Socket socket; //为run方法里面的socket服务
	//构造方法
	public Demo3ImageServer(Socket socket){
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		try {
			FileOutputStream socketOut = (FileOutputStream) socket.getOutputStream();
		    File file = new File("C:\\Users\\周杰伦\\Documents\\Tencent Files\\1772344524\\FileRecv\\小白安装及其下单操作.mp4");
		    FileInputStream fileInputStream = new FileInputStream(file); 
		    byte[] buf = new byte[1024];
		    int length = 0;
		    while((length = fileInputStream.read(buf)) != -1){
		    	socketOut.write(buf,0,length);
		    }
		    fileInputStream.close();
		    //ServeRSocket 作为服务器 永远不能关  但是可以关闭Socket 
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\
	
		//建立tcp服务
		ServerSocket serverSocket = new ServerSocket(9088);
		//不断的接受链接 
		while(true){
			Socket socket = serverSocket.accept();
		    new Demo3ImageServer(socket).start();	
		}
	}

}
