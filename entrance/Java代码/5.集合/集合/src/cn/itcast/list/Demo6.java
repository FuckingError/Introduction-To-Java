package cn.itcast.list;
/*
 * List ������з�����LisIterator������
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("�ܽ���");
		list.add("����");
		list.add("�ܽ���");
		list.add("½��");
		list.add("������");
	
		/*
		 * ���
		list.add(0,"����");
		
		List list2 = new ArrayList();
		list2.add("���ǳ�");
		list2.add("������");
		
		list.addAll(1,list2);
		*/
		
		/*��ȡ
		 * System.out.println(list.get(3));
		System.out.println(list.indexOf("������"));
		System.out.println(list.lastIndexOf("�ܽ���"));
		System.out.println(list.subList(2, 4));
*/
	/*�޸�
	 * 	list.set(2, "����");
		System.out.println(list);
	*/
		
		
		//�������ķ���
		ListIterator it = list.listIterator();
		/*
		 * �������
		 * while(it.hasNext()){
		   it.next();//�������ָ�������������һ��Ԫ��
		   }
	   while(it.hasPrevious()){
		   System.out.println("Ԫ�أ�"+it.previous());
	   }*/
		
		/*
		 * ��ָ������λ�����Ԫ��
	   it.add("����");
	   System.out.println(list);
	   */
		
		/*
		 * list.size() ��ȡ����
		 * */
		
		
		
		
		/*������������һ�����ص�Ԫ��
		it.next();
		it.set("����");
		System.out.println(list);
		*/
		
		while(it.hasNext()){
			System.out.println(it.next());//��ȡ��ʼ����ָ���������һ��Ԫ��
			it.add("666");//�Զ����֮��������ӵ�Ԫ�������ƶ�һ��Ԫ��
		}
		//ע�⣺list.add()�������ڼ���ĩβ���Ԫ��
		//�ڵ��������������У�������ʹ�ü��Ϸ����ı伯�ϳ��ȣ����ǿ���ʹ�õ����������ı伯�ϳ���
		//�������������̣��Ӵ�����ʼ�����һ��ʹ�õ�������Ϊֹ
		System.out.println(list);
	}

}
