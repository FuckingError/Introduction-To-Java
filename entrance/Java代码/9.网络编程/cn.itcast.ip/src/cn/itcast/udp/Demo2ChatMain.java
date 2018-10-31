package cn.itcast.udp;

public class Demo2ChatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//启动接收端
		Demo2ChatReceiver chatReceiver = new Demo2ChatReceiver();
		chatReceiver.start();

		//启动发送端的线程
		Demo2ChatSender chatSender = new Demo2ChatSender();
		chatSender.start();
	

	}

}
