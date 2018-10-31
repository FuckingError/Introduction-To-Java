package 线程;
/*同步代码块的练习
 * */
public class Demo4 extends Thread{
	static int money = 5000;

	public Demo4(String name){
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	    while(true){
	    	synchronized ("锁") {
		if(money>0){
			money = money-1000;
			System.out.println(this.getName()+"取走1000元，账户余额为："+money);
		}else{
			System.out.println("取光！！！");
			break;
			}
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d1 = new Demo4("老公");
		Demo4 d2 = new Demo4("老婆");
		d1.setPriority(1);
		d2.setPriority(10);
		
		d1.start();
		d2.start();

	}

}
