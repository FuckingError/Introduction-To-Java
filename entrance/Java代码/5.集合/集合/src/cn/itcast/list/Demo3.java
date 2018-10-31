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
		return "{编号："+id+" 姓名："+name+"}";
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add(new Person(111,"狗娃"));
		c.add(new Person(112,"狗二"));
	    c.add(new Person(113,"狗蛋"));
	   
	    Object[] arr = c.toArray();//接受的类型为object型  从object数组中取出的元素只能使用object类型变量接受，否则需要强制类型转换
	    System.out.println(Arrays.toString(arr));
	    System.out.println(c);
	    
	    //找出编号为133的数组
	    for(int i = 0;i<arr.length;i++){
	    	Person p = (Person)arr[i];
	    	if(p.id == 113){
	    		System.out.print(p);
	    	}
	    }
	 }
}
