package cn.itcast.Map;

import java.util.Comparator;
import java.util.HashMap;
/*HashMap
 * 
 * */
class Person implements Comparable<Person>{
	int id;
	String name;
	
	public Person(int id,String name){
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}



	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj;
		return p.id == this.id;
	}*/

	public String toString(){
		return "[��ţ�"+this.id+" ������"+this.name+"]";
	}
}

class MyComparator1 implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	

	
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Person,String> map = new HashMap<Person,String>();
		map.put(new Person(1,"�ܽ���"), "����");
		map.put(new Person(2,"����"), "������");
		map.put(new Person(3,"����"), "Ѧ����");
		/*ע�⣺��дhashCode()������Ŀ�ģ������ֵ��hashֵ�������ͬ��ֱ�Ӵ���
		                                                                                                                        �����ͬ�������equals�������۲��Ƿ񴢴�Ԫ��һ��
		                                                                                                                                                     �����һ�£��ᴢ��
		                                                                                                                                                          ���һ�£����ᴢ��
		      ����1.ֻ�е����Ĺ�ϣֵһ����equals��������ֵΪtrueʱ���Ų��ᱻ����
		     2.ֻ�е����Ĺ�ϣֵ��ͬ����equals��������ֵΪtrue��������ͬ
		     3.����ͬʱ����ֵ����þ�ֵ                                                                                                                                                   
		                                        */
		System.out.println(map);
	}
}
