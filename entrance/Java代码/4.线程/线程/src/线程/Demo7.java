package �߳�;
/**�ڶ��ֶ��̵߳�ʵ�ַ���
 * ע�⣺
 * 1.��ֻ��new ��һ���ӿڶ��󣬸���ı�������Ҫ��static ����
 * 2.���߳�ָ��������̶߳���
 *   
 *   
 */
class SaleTicket implements Runnable{
	int num = 50;
	public void run(){
		while(true){
			synchronized("��"){
			if(num > 0){
				System.out.println(Thread.currentThread().getName()+"�۳���"+num+"��Ʊ");
				num--;
			}
			else{
				System.out.println("�۹⣡����");
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

	Thread d1 = new Thread(s,"һ�Ŵ��ڣ�");
	Thread d2 = new Thread(s,"���Ŵ��ڣ�");
	Thread d3 = new Thread(s,"���Ŵ��ڣ�");
	
	d1.start();
	d2.start();
	d3.start();
		
	}

}
