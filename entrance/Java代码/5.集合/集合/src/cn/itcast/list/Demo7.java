package cn.itcast.list;

import java.util.ArrayList;
import java.util.ListIterator;
/*ʱ�䣺2017��4��12��21:43:10
 * Ŀ�ģ�ɾ���������ظ���Ԫ�أ��������ͬ��Ԫ��
 * 
 * ˼�룺
 * 1.it.next() ��ȡ������Object
 * 2.ǿ��ת�� Books book = (Books)obj;
 * 3.��һ���������У�������ʹ�ü��ϵķ����Լ��Ͻ��в�����ͳһʹ�õ������ķ���
 * 4.������Ԫ��Ϊ��������ʱ��Ҫ��дtoString����
 * 5.Ҫ����������˼�룬����ĳ����ΪҪд�ɷ�������ʽ��������ж���������У����ع��ɷ���
 *������
 * 1.���յ������ķ���
 *   ��1����ͨ������:remove����
 *   ��2��list��������add() ��ָ�봦���Ԫ��
 *                set() ָ���滻���һ�η��ص�Ԫ��
 * */
class Books{
	int id;
	String name;
	
	
	public Books(int id,String name){
		this.id = id;
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Books book = (Books)obj;
		return book.id == this.id;
		}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{���:"+id+" ����:"+name+"}"; 
	}
}
	
	


public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Books(110,"java���˼��"));
		list.add(new Books(220,"java���ļ���"));
		list.add(new Books(330,"����javaweb"));
		list.add(new Books(110,"javas����"));
		
		ArrayList list1 = clearRepeat(list);
		System.out.println(list1);	
		}

	public static ArrayList clearRepeat(ArrayList list) {
		ArrayList list1 = new ArrayList();
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()){
			Books book = (Books) it.next();
			if(!list1.contains(book)){
				list1.add(book);//��������Ŀ���ǽ�ʡ�ڴ�
			}
		}
		return list1;
		
		/*��һ����ʽ  ��Ϊ��ȥһ��Ԫ�أ�����ļ���Ԫ�ػ���ǰ�ƶ���̫����
			 * if(list1.contains(book)){
			 *   it.remove();
			 * }
			 * System.out.println(list);
			 * */
		
	}

}
