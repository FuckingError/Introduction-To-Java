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
		return "姓名："+this.name+" 编号："+this.id;
		}
	
	public boolean equals(Object obj){
		Person p = (Person)obj;//强制类型转换
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
		
		/*重写toString方法
		Person p1 = new Person("123","刘清");
		System.out.println(p1);
		*/
		
		//重写equals的方法
		/*
		Person p1 = new Person("刘清","1213");
		Person p2 = new Person("周杰伦","1213");
		
		System.out.println(p1.equals(p2));
		System.out.println("p1哈希码:"+p1.hashCode());
		System.out.println("p2哈希码:"+p2.hashCode());
		*/
		
	}
}
