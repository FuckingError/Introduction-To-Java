package 线程;
/*
 * join() 让步语句  
 * */
class Mon extends Thread{
	public void run(){
		System.out.println("打儿子");
		System.out.println("发现没有棒");
		Son s = new Son();
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("接过棒");
		System.out.println("打死了儿子");
	}
}

class Son extends Thread{
	public void run(){
		System.out.println("儿子飞速的跑到阳台");
		System.out.println("拿起一根棒交给妈妈");
	}
}


public class Demo11 {
	public static void main(String[] args)
	{
		Mon m = new Mon();
		m.start();
	}

}
