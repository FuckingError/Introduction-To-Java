package 线程;



/*
 * 目的：确保苹果香蕉生产后再消费
 * 
 * 要有上锁的意识
 * 锁对象必须是指向同一个对象的对象名
 * 
 * p.wait()
 * p.notify() 
 * p.notifyAll()
 * 必须在同步代码块或同步函数中使用   属于Object类   必须通过锁对象调用
 * 
 * 利用构造方法传入同一个对象
 * 
 * 利用boolean类型判断是否已生产或已消费 ,以及要求先生产后消费
 * 
 * 
 * */
class Product{
	String name;
	double price;
	boolean flag = true;
}

class Productor extends Thread{
	Product p;
	int i = 0;
	
	public Productor(Product p){
		this.p = p;
	}
	
	public void run(){
		while(true){
			synchronized (p) {
				//未生产
				if(p.flag){
					if(i%2 == 0){
						p.price  = 1;
						p.name = "苹果";
					}else{
						p.price = 1.5;
						p.name = "香蕉";
					}
					System.out.println("生产"+p.name+"，价格"+p.price);
					//生产一个苹果再生产一个香蕉
					i++;
					//生产后唤醒消费者消费
					p.flag = false;
					p.notify();
				}
				//生产后等待消费者消费
				else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
					
class Customer extends Thread{
	Product p;
	
	public Customer(Product p){
		this.p = p;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (p) {
				if(p.flag == false){
					System.out.println("消费"+p.name +"价格："+p.price);
					p.flag = true;
					p.notify();
				}else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
			
public class Demo8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product();
		
		Productor p1 = new Productor(p);
		Customer c = new Customer(p);
	
		p1.start();
		c.start();

	}
}

