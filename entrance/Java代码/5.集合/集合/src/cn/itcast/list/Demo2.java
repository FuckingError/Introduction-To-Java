package cn.itcast.list;
/*�Զ��弯�ϵıȽ����ӡ
 * contains()
 *containsAll()
 *��ӡ
 * */
import java.util.ArrayList;
import java.util.Collection;



public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(123456,"�ܽ���");
		Person p2 = new Person(123,"����");
		Person p3 = new Person(12,"�Ǻ�");
		
		Collection p = new ArrayList();
		p.add(p1);
		p.add(p2);
		
		Collection ps = new ArrayList();
		ps.add(p1);
		ps.add(p2);
		ps.add(p3);
		
		//�Զ��弯��Ԫ��  �ж��Ƿ����
		System.out.println("�Ƿ���ڸü���Ԫ�أ�"+p.contains(new Person(123456,"j")));//���õ���ʵ�ε�equals����
		//��ӡ�Զ��弯��
		System.out.println(p);
		//
		System.out.println("ps�����Ƿ����p���ϵ�����Ԫ�أ�"+ps.containsAll(p));
		

	}

}
