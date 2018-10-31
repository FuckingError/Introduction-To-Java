package cn.itcast.tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

//模拟登陆的服务端
/*时间：2017年8月18日17:03:34
 * 知识点：一.io流
 *         1.socket获取输出流 一般是 OutPutStreamWriter
 *           注意：1）OutPutStreamWriter 需要\r\n
 *               2）需要flush 
 *         2.socket获取输入流 一般是BufferedReader
 *      二.配置文件类 Properties
 *         1.应用场景：当数据一一对应 并且不可重复 
 *         1.常用方法：1)加载配置文件 load(inputStream);
 *                  2)通过键值去判断配置文件中是否包含该键值  containsKey(String 键值);
 *                  3)通过键值获取值 getProperty(String 键值);
 *                  4）添加配置信息 setProperty(String 键值,String 值);
 *                  5)生成配置文件 store(outPutStream);
 *      三.静态代码块
 *      四.切割字符串  建立一个字符串数组
 *         String[] str = users.split(" "); 以空格为切割的位置
 *      五.客户端和服务端的关系
 *        客户端的作用 主要是获取用户的数据  通过 io 传送给服务端去处理
 *        服务端处理完毕后 通过io 反馈给客户端
 **/
 
public class Demo4LoginServer extends Thread {
	Socket socket;
	//构造方法
	public Demo4LoginServer(Socket socket){
		this.socket = socket;
	}
	//创建配置文件
	static File file = new File("F:\\users.properties");
	//静态代码块
	static{
		//判断该配置文件是否存在  若不存在则建立一个配置文件
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//获取socket的输入流
			BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//获取socket的输出流
			OutputStreamWriter socketOut =	new OutputStreamWriter((socket.getOutputStream()));
			//生成配置文件类
			Properties properties = new Properties(); 
			while(true){
				//读取客户端发来的数据
				String inf = socketInput.readLine();
				//分割成三块 option userName passWord
				String[] infs = inf.split(" ");
				String option = infs[0];
				String userName = infs[1];
				String passWord = infs[2];
				//因为这边配置文件 和 配置文件类重复的 所以统统写在外面
				if("a".equalsIgnoreCase(option)){
					//登陆
					//装载配置文件
					properties.load(new FileReader(file));
					if(properties.containsKey(userName)){
						
						//通过userName 获取 值 也就是密码
						String passWord2 = properties.getProperty(userName);
						if(passWord.equalsIgnoreCase(passWord2)){
							socketOut.write("恭喜登陆成功!!!"+"\r\n");
						}else{
							socketOut.write("输入密码错误 请重新登陆.."+"\r\n");
						}
					}else{
						socketOut.write("该用户名不存在 请重新登陆.."+"\r\n");
					}
					socketOut.flush();
					
					
				}else if("b".equalsIgnoreCase(option)){
					//注册
					
					//装载配置文件
					properties.load(new FileReader(file));
					//判断配置文件类中是否存在该用户名
					if(!properties.containsKey(userName)){
						//添加配置信息
						properties.setProperty(userName, passWord);
						//生成配置文件
						properties.store(new FileWriter(file),"users");
						socketOut.write("恭喜注册成功..."+"\r\n");
						socketOut.flush();
					}else{
						socketOut.write("用户名已存在 请重新注册"+"\r\n");
						socketOut.flush();
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub5
		ServerSocket serverSocket = new ServerSocket(9087);
		while(true){
			//不断的接收客户端的连接
			Socket socket = serverSocket.accept();
			//每接受到一个socket就开启一个线程
			new Demo4LoginServer(socket).start();
		}
		
	}

}
