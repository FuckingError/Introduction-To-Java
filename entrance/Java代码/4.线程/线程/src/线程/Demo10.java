package �߳�;
/*
 * �ػ��߳�(��̨�߳�):��һ�����������ֻʣ���ػ��̣߳���ô���ػ��̻߳�����
 * */
public class Demo10 extends Thread{

	public void run(){
		for(int i = 0;i<=100;i++){
			System.out.println("����������"+i+"%");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�������!!!");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d = new Demo10();
		//�����ػ��߳�
		d.setDaemon(true);
		//�ж��Ƿ�Ϊ�ػ��߳�
		System.out.println(d.isDaemon());
		d.start();
		
		
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
		

	}

}
