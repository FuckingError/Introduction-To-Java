package 线程;
/*线程常用方法
 * sleep()（需要抛出异常） 静态方法
 * setName()
 * getName()返回线程名字
 * currentThread() 返回当前线程对象  ，静态方法   在哪个线程中调用，就返回哪个线程对象
 * 
 * */
public class Demo2 extends Thread {
	public Demo2(String name){
		super(name);//调用父类的构造方法
	}
	
	public void run(){
		
		for(int i = 0;i<100;i++){
			System.out.println(this.getName()+i);//获得线程名
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}	
		//System.out.println("自定义线程对象1："+this.currentThread());
	}
	
	public static void main(String[] args)
	{
		Demo2 d = new Demo2("铁蛋");
		//d.setName("刘清");//设置线程名字
		d.start();
	  
		//System.out.println("自定义线程对象0："+d);
		
		/*返回当前线程对象
		Thread s = d.currentThread();
		System.out.println(s);
		*/
		//设置线程优先级
		d.setPriority(8);
		currentThread().setPriority(6);
		
		//显示线程优先级
		System.out.println("自定义线程："+d.getPriority());
		System.out.println("主线程："+currentThread().getPriority());
		
		for(int i = 0;i<100;i++){
			System.out.println(currentThread().getName()+i);
		}
	}
}
