package cn.itcast.Map;

import java.util.ArrayList;
import java.util.Collections;

/*collections ��������
 * 
 * */
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> list = new ArrayList<Person>();
			
		//�Զ�������  ������Ҫ����Ƚ��� 
		list.add(new Person(2,"����"));
		list.add(new Person(1,"����"));
		list.add(new Person(0,"jay"));
		
	     //����
		Collections.sort(list,new MyComparator1());
		System.out.println(list);
		//���ֲ��ҷ�������Ҫ�������ʹ�� 
		System.out.println("Ԫ�ص�����ֵΪ��"+Collections.binarySearch(list,new Person(2,"����"),new MyComparator1()));
		//��Сֵ
		System.out.println("���ֵ��"+Collections.max(list,new MyComparator1()));
		System.out.println("��Сֵ��"+Collections.min(list,new MyComparator1()));
		
		Collections.reverse(list);
		System.out.println("��ת:"+list);
		
	}

}
