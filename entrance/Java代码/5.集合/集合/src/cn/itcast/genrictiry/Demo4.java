package cn.itcast.genrictiry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*泛型的上下限
 * 
 * */
public class Demo4 {
//需求：定义一个函数可以接受任意类型的集合，要求接受的集合对象只能存储Integer或是Integer的父类类型数据
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("ss");
		print(list);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(123);
		print(set);
		
	}
	public static void print(Collection<? super Integer> c){
		
	}
}
