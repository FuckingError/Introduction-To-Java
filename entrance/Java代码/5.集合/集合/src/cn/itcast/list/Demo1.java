package cn.itcast.list;

import java.util.ArrayList;
import java.util.Collection;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("�ܽ���");
		c.add("�Ź���");
		c.add("���ǳ�");
		System.out.println("��ӳɹ���"+c.add("����"));
		
		Collection c1 = new ArrayList();
		c1.add("���»�");
		c1.add("����Ѹ");
		c1.add("�ܽ���");
		
		c.addAll(c1);
		
		//c.clear();//��ռ����е�Ԫ��
		
		/*ɾ��
		System.out.println("ɾ���ɹ���"+c.remove("���»�"));
		*/
		
		//c.removeAll(c1);//ɾ��c��������c1�Ľ���
		
		//c.retainAll(c1);//����c������c1���ϵĽ���Ԫ��
		
		System.out.println("�鿴Ԫ�صĸ���:"+c.size());
		
		System.out.println("�ж�Ԫ���Ƿ�Ϊ��?"+c.isEmpty());
		System.out.println("�жϼ������Ƿ����ָ����Ԫ��?"+c.contains("�ܽ���"));//contains�ڲ�������equals
		
		System.out.println("���ϵ�Ԫ��:"+c);
		
		
		

	}

}
