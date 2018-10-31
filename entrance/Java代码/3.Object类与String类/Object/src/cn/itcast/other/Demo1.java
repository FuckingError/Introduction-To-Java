package cn.itcast.other;

import java.util.Arrays;
import java.util.Properties;

/*
 *  System��  ��Ҫ���ڻ�ȡϵͳ���������� 
 * arraycopy() 
 * currentTimeMillis()
 * exit(int status) �˳�jvm ���������0����ʾ�����˳�jvm�������ʾ�쳣�˳�jvm
 * gc() ����jvm����������������������
 * finalize() ���һ�������������������յ�ʱ�򣬻��ȵ��ö����finalize()����
 */

class Person{
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void finalize() throws Throwable{
		super.finalize();
		System.out.println(this.name+"�������ˣ�����");
	}
}

public class Demo1 {
	public static void main(String[] args)
	{
//		int[] arr = {0,1,2,3,4,5};
//		int[] newarr = new int[4];
//		System.arraycopy(arr, 1, newarr, 2, 2);
//		//System.exit(1);//jvm�˳�  
//		System.out.println("Ŀ�������Ԫ��"+Arrays.toString(newarr));
//		System.out.println("��ǰϵͳʱ�䣺"+System.currentTimeMillis());
//		
		/*gc() ����jvm����������������������
		for(int i = 1;i<=4;i++){
			new Person("��ˬ"+i);
			System.gc();
		}
		*/
		
		/*
	    Properties properties = System.getProperties();
		properties.list(System.out);
		*/
		
		String value = System.getProperty("os.name");
		System.out.println(value);
	}

}
