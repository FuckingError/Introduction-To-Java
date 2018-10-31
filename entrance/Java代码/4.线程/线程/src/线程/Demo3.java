package �߳�;
//������Ʊ������Ʊ һ����ʮ��
/*
 * �������⣺ 1.���������    extendsҪ��static����  runnable����Ҫ
 *        2.����run�������������
 *        
 *ʲôʱ��������������̶߳��󣬲��ҹ�������
 *         �߳��жԸ����ݵĲ�������һ��
 *         
 *��ô����:1.�����ж���һ���������
 *      2.����Ҫ�����Ĵ������ʹ��synchronized(����)  ע��ѭ����ôȥ��
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
            	synchronized("��"){
                if(i>0){
	                System.out.println(this.getName()+"�۳���"+i+"��Ʊ��");
                    i--;
                }else{
                	System.out.println("���꣡");
                	break;
                	}
                }
            }
	
//		for(int i = 1;i<=50;i++){
//			System.out.println("�۳���"+i+"��Ʊ��");
//		}
			
	}

	
	public static void main(String[] args)
	{
		Demo3 d1 = new Demo3("һ�Ŵ��ڣ�");
		Demo3 d2 = new Demo3("���Ŵ��ڣ�");
		Demo3 d3 = new Demo3("���Ŵ��ڣ�");
		
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
			synchronized("��"){
				if(i>0){
					System.out.println(Thread.currentThread().getName()+"ʣ��Ʊ����"+i);
				}else{
					System.out.println("����");
					break;
				}
				i--;
				}
			}
		}
	public static void main(String[] args){
		Demo3 d = new Demo3();
		Thread one = new Thread(d,"һ�Ŵ���");
		Thread two = new Thread(d,"���Ŵ���");
		Thread three = new Thread(d,"���Ŵ���");
		
		one.start();
		two.start();
		three.start();
	}
	
}
