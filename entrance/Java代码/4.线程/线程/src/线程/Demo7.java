package 线程;
/**第二种多线程的实现方法
 * 注意：
 * 1.当只是new 了一个接口对象，该类的变量不需要用static 修饰
 * 2.多线程指创建多个线程对象
 *   
 *   
 */
class SaleTicket implements Runnable{
	int num = 50;
	public void run(){
		while(true){
			synchronized("锁"){
			if(num > 0){
				System.out.println(Thread.currentThread().getName()+"售出第"+num+"张票");
				num--;
			}
			else{
				System.out.println("售光！！！");
				break;
				}
			}
		}
	}
}

public class Demo7 {
	public static void main(String[] args)
	{
	SaleTicket s = new SaleTicket();

	Thread d1 = new Thread(s,"一号窗口：");
	Thread d2 = new Thread(s,"二号窗口：");
	Thread d3 = new Thread(s,"三号窗口：");
	
	d1.start();
	d2.start();
	d3.start();
		
	}

}
