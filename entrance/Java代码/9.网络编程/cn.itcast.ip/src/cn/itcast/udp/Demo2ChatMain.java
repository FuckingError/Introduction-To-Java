package cn.itcast.udp;

public class Demo2ChatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ն�
		Demo2ChatReceiver chatReceiver = new Demo2ChatReceiver();
		chatReceiver.start();

		//�������Ͷ˵��߳�
		Demo2ChatSender chatSender = new Demo2ChatSender();
		chatSender.start();
	

	}

}
