package �߳�;
//ʱ�䣺2017��7��13��17:58:14
/*�����̵߳����ַ�����
  1.�̳�Thread
  2.�ӿ�Runable  �̼߳���Թ���һ���߳����ʵ������
  
  �Ƽ�ʹ�õڶ��ַ�������Ϊ1.java�ǵ��̳У��ڶ��ַ������Լ̳б�ĸ���
                 2.����threat��ʵ������
  */

public class Demo1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<100;i++){
			System.out.println(this.getName()+i);
		}
	}
	
	public static void main(String[] args){
		new Demo1().start();
		new Demo1().start();
		
		for(int i = 0;i<100;i++){
			System.out.println(currentThread().getName()+i);
		}
	}
}

/*
public class Demo1 implements Runnable{
	private int i;
	public void run(){
		for(;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	
	public static void main(String[] args){
		Demo1 d = new Demo1();
		//�����߳�
		Thread thread = new Thread(d,"����");
		Thread thread1 = new Thread(d,"�");
		thread.start();
		thread1.start();
		
		for(int i =0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}
*/


