package �߳�;
/*�̳߳��÷���
 * sleep()����Ҫ�׳��쳣�� ��̬����
 * setName()
 * getName()�����߳�����
 * currentThread() ���ص�ǰ�̶߳���  ����̬����   ���ĸ��߳��е��ã��ͷ����ĸ��̶߳���
 * 
 * */
public class Demo2 extends Thread {
	public Demo2(String name){
		super(name);//���ø���Ĺ��췽��
	}
	
	public void run(){
		
		for(int i = 0;i<100;i++){
			System.out.println(this.getName()+i);//����߳���
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}	
		//System.out.println("�Զ����̶߳���1��"+this.currentThread());
	}
	
	public static void main(String[] args)
	{
		Demo2 d = new Demo2("����");
		//d.setName("����");//�����߳�����
		d.start();
	  
		//System.out.println("�Զ����̶߳���0��"+d);
		
		/*���ص�ǰ�̶߳���
		Thread s = d.currentThread();
		System.out.println(s);
		*/
		//�����߳����ȼ�
		d.setPriority(8);
		currentThread().setPriority(6);
		
		//��ʾ�߳����ȼ�
		System.out.println("�Զ����̣߳�"+d.getPriority());
		System.out.println("���̣߳�"+currentThread().getPriority());
		
		for(int i = 0;i<100;i++){
			System.out.println(currentThread().getName()+i);
		}
	}
}
