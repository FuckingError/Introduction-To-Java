package 线程;
//时间：2017年7月13日17:58:14
/*创建线程的三种方法：
  1.继承Thread
  2.接口Runable  线程间可以共享一个线程类的实例变量
  
  推荐使用第二种方法：因为1.java是单继承，第二种方法可以继承别的父类
                 2.共享threat的实例变量
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
		//创建线程
		Thread thread = new Thread(d,"狗娃");
		Thread thread1 = new Thread(d,"李旦");
		thread.start();
		thread1.start();
		
		for(int i =0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}
*/


