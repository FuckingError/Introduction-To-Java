package 线程;

import javax.swing.plaf.synth.SynthColorChooserUI;

/*死锁！！！
 * 
  */
class DeadClass extends Thread{
	public DeadClass(String name){
		super(name);
	}

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		if("张三".equals(this.getName())){
			synchronized("遥控器"){
				System.out.println("张三拿到了遥控器");
				synchronized("电池"){
					System.out.println("张三拿到了电池和遥控器");
				}
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if("李四".equals(this.getName())){
			synchronized("电池"){
				System.out.println("李四拿到了电池");
				synchronized ("遥控器"){
					System.out.println("李四拿到了遥控器和电池");
				}
			}
		}
	}
}


public class Demo6 {
	public static void main(String[] args)
	{
		DeadClass d1 = new DeadClass("张三");
		DeadClass d2 = new DeadClass("李四");
		
		
		d1.start();
		d2.start();
		
	}

}
