package 线程;
//三个售票窗口售票 一共五十张
/*
 * 两个问题： 1.共享的数据    extends要用static修饰  runnable不需要
 *        2.锁死run方法里面的任务
 *        
 *什么时候用锁：当多个线程对象，并且共享数据
 *         线程中对该数据的操作超过一次
 *         
 *怎么用锁:1.在类中定义一个共享的类
 *      2.在需要被锁的代码块上使用synchronized(类名)  注意循环怎么去锁
 * */
/*
public class Demo3 extends Thread{
	
	public Demo3(String name){
		super(name);
	}
	static int i = 50;
	//static Object o = new Object();
	
    @Override
    public void run() {
       // TODO Auto-generated method stub
       
            while(true){
            	synchronized("锁"){
                if(i>0){
	                System.out.println(this.getName()+"售出第"+i+"张票！");
                    i--;
                }else{
                	System.out.println("售完！");
                	break;
                	}
                }
            }
	
//		for(int i = 1;i<=50;i++){
//			System.out.println("售出第"+i+"张票！");
//		}
			
	}

	
	public static void main(String[] args)
	{
		Demo3 d1 = new Demo3("一号窗口：");
		Demo3 d2 = new Demo3("二号窗口：");
		Demo3 d3 = new Demo3("三号窗口：");
		
		d1.start();
		d2.start();
		d3.start();
		
	}
}
*/

public class Demo3 implements Runnable{
	int i = 50;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized("锁"){
				if(i>0){
					System.out.println(Thread.currentThread().getName()+"剩余票数："+i);
				}else{
					System.out.println("售罄");
					break;
				}
				i--;
				}
			}
		}
	public static void main(String[] args){
		Demo3 d = new Demo3();
		Thread one = new Thread(d,"一号窗口");
		Thread two = new Thread(d,"二号窗口");
		Thread three = new Thread(d,"三号窗口");
		
		one.start();
		two.start();
		three.start();
	}
	
}
