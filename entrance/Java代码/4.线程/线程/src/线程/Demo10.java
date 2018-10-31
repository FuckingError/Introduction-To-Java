package 线程;
/*
 * 守护线程(后台线程):在一个进程中如果只剩下守护线程，那么该守护线程会死掉
 * */
public class Demo10 extends Thread{

	public void run(){
		for(int i = 0;i<=100;i++){
			System.out.println("程序已下载"+i+"%");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("下载完成!!!");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d = new Demo10();
		//设置守护线程
		d.setDaemon(true);
		//判断是否为守护线程
		System.out.println(d.isDaemon());
		d.start();
		
		
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
		

	}

}
