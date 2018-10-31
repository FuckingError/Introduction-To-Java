package 线程;

import javax.swing.plaf.synth.SynthColorChooserUI;

/*
 * 线程的停止的两个方法
 * 1.使用一个变量
 * 2.interrupt()  将线程的状态清除，被清除状态的线程会接受InterruptionException
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
					demo9.flag = false;//当程序进行到这里时，haha线程还是处于等待状态，没有被唤醒  但是flag被改成false 
					demo9.notify();    //被唤醒，这一次的循环结束，当想进行下一次的循环时，flag已经被改成了false  所以haha线程停止
					
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
				System.out.println("接收到了异常");
			}	
			System.out.println(this.getName()+i);
			i++;
		}
	}
}
	
	public static void main(String[] args){
		Demo9 d = new Demo9("狗娃");
		d.start();
		
	    for(int i = 0;i<100;i++){
	    	System.out.println(Thread.currentThread().getName()+i);
	        if(i == 80){
	        	d.flag = false;
	        	/* 温柔的方式
	        	synchronized(d){
	        	d.notify();
	        	}
	        	
	        	d.interrupt();
	        }
	        
	    }
		
	}

}
*/