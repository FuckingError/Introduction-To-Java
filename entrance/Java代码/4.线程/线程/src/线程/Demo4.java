package �߳�;
/*ͬ����������ϰ
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
	    	synchronized ("��") {
		if(money>0){
			money = money-1000;
			System.out.println(this.getName()+"ȡ��1000Ԫ���˻����Ϊ��"+money);
		}else{
			System.out.println("ȡ�⣡����");
			break;
			}
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d1 = new Demo4("�Ϲ�");
		Demo4 d2 = new Demo4("����");
		d1.setPriority(1);
		d2.setPriority(10);
		
		d1.start();
		d2.start();

	}

}
