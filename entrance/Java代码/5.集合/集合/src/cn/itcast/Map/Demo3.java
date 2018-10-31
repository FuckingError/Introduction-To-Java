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
		return "[编号："+this.id+" 姓名："+this.name+"]";
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
		map.put(new Person(1,"周杰伦"), "昆凌");
		map.put(new Person(2,"刘建"), "顾玲云");
		map.put(new Person(3,"刘清"), "薛钰婷");
		/*注意：重写hashCode()方法的目的：计算键值的hash值，如果不同，直接储存
		                                                                                                                        如果相同，会调用equals方法，观察是否储存元素一致
		                                                                                                                                                     如果不一致，会储存
		                                                                                                                                                          如果一致，不会储存
		      即：1.只有当键的哈希值一致与equals方法返回值为true时，才不会被储存
		     2.只有当键的哈希值相同并且equals方法返回值为true，键才相同
		     3.键相同时，新值会调用旧值                                                                                                                                                   
		                                        */
		System.out.println(map);
	}
}
