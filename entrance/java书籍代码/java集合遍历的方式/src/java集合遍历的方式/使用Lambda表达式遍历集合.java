package java集合遍历的方式;

import java.util.Collection;
import java.util.HashSet;
/*
 * Iterable接口内增加forEach方法，Iterable接口为Collection的父接口，所以Collection可以直接调用该方法
 
 * */
public class 使用Lambda表达式遍历集合 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("周杰伦");
		books.add("刘清");
		books.add("薛钰婷");
		books.forEach(obj -> System.out.print(obj+" "));
		

	}

}
