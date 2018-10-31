package �߳�;

import javax.swing.plaf.synth.SynthColorChooserUI;

/*
 * �̵߳�ֹͣ����������
 * 1.ʹ��һ������
 * 2.interrupt()  ���̵߳�״̬����������״̬���̻߳����InterruptionException
 * */
public class Demo9 extends Thread{
	boolean flag = true;
	
	public Demo9(String name){
		super(name);
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		int i = 1;
		while(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName()+i);
			i++;
		}
		
	}
	
	public static void main(String[] args){
		Demo9 demo9 = new Demo9("haha");
		demo9.start();
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
			if(i ==80){
				synchronized(demo9){
					demo9.flag = false;//��������е�����ʱ��haha�̻߳��Ǵ��ڵȴ�״̬��û�б�����  ����flag���ĳ�false 
					demo9.notify();    //�����ѣ���һ�ε�ѭ�����������������һ�ε�ѭ��ʱ��flag�Ѿ����ĳ���false  ����haha�߳�ֹͣ
					
				}
			}
		}
	}
	
}


/*
public class Demo9 extends Thread{	
	boolean flag = true;
	
	public Demo9 (String name){
		super(name);
	}
	
	public void run(){
		int i = 1;
	
		while(flag){
			synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("���յ����쳣");
			}	
			System.out.println(this.getName()+i);
			i++;
		}
	}
}
	
	public static void main(String[] args){
		Demo9 d = new Demo9("����");
		d.start();
		
	    for(int i = 0;i<100;i++){
	    	System.out.println(Thread.currentThread().getName()+i);
	        if(i == 80){
	        	d.flag = false;
	        	/* ����ķ�ʽ
	        	synchronized(d){
	        	d.notify();
	        	}
	        	
	        	d.interrupt();
	        }
	        
	    }
		
	}

}
*/