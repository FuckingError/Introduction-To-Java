package �߳�;
/*
 * join() �ò����  
 * */
class Mon extends Thread{
	public void run(){
		System.out.println("�����");
		System.out.println("����û�а�");
		Son s = new Son();
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ӹ���");
		System.out.println("�����˶���");
	}
}

class Son extends Thread{
	public void run(){
		System.out.println("���ӷ��ٵ��ܵ���̨");
		System.out.println("����һ������������");
	}
}


public class Demo11 {
	public static void main(String[] args)
	{
		Mon m = new Mon();
		m.start();
	}

}
