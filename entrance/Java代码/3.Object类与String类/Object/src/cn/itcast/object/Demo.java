package cn.itcast.object;

class Person{
	String name;
	String id;
	
	public Person(String name,String id){
		this.name = name;
		this.id = id;
		}
	
	public Person(){
		
	}
	
	public String toString(){
		return "������"+this.name+" ��ţ�"+this.id;
		}
	
	public boolean equals(Object obj){
		Person p = (Person)obj;//ǿ������ת��
		return this.id == p.id;
	}
	
	public int hashCode(){
		return 123;
	}
}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Object o = new Object();
		System.out.println("toString:"+o.toString());//toString:java.lang.Object@15db9742
		*/
		
		/*��дtoString����
		Person p1 = new Person("123","����");
		System.out.println(p1);
		*/
		
		//��дequals�ķ���
		/*
		Person p1 = new Person("����","1213");
		Person p2 = new Person("�ܽ���","1213");
		
		System.out.println(p1.equals(p2));
		System.out.println("p1��ϣ��:"+p1.hashCode());
		System.out.println("p2��ϣ��:"+p2.hashCode());
		*/
		
	}
}
