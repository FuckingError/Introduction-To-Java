package cn.itcast.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
class Person{
	int id;
	String name;
	public Person(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj;
		return p.id == this.id;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{��ţ�"+id+" ������"+name+"}";
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add(new Person(111,"����"));
		c.add(new Person(112,"����"));
	    c.add(new Person(113,"����"));
	   
	    Object[] arr = c.toArray();//���ܵ�����Ϊobject��  ��object������ȡ����Ԫ��ֻ��ʹ��object���ͱ������ܣ�������Ҫǿ������ת��
	    System.out.println(Arrays.toString(arr));
	    System.out.println(c);
	    
	    //�ҳ����Ϊ133������
	    for(int i = 0;i<arr.length;i++){
	    	Person p = (Person)arr[i];
	    	if(p.id == 113){
	    		System.out.print(p);
	    	}
	    }
	 }
}
