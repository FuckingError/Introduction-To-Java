package cn.itcast.genrictiry;

import java.util.ArrayList;

/*�Զ��巺��
 * �����ڶ�̬�ĸ���
 * */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		//��д����Сд
		for(int i = 0;i<list.size();i++){
			String str = (String)list.get(i);
			System.out.println(str.toLowerCase());		
		}
		
	/*	Integer i = print(1);
		Double d = print(1.2);    
		Character c = print('1');
		String s = print("123");
	    Boolean b = print(false);
	}
	//������Ҫ�󣺷���ֵ����Ҫ����ʵ������  <>Ϊ����һ������  ����ֵ��ʵ��Ҫһ��  һ��ΪT ���� E
	public static <T>T print(T o){
		return o;*/
		
	}

}
