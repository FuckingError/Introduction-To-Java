package cn.itcast.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 迭代器的方法
 * hsaNext() 判断是否有元素可以遍历，返回true，否则返回false
 * 
 * next()    获取元素,并且指针指向下一个元素
 * 
 * remove()  移除迭代器最后一次返回的元素
 * */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();	
		
		
		c.add("周杰伦");
		c.add("郝爽");
		c.add("奚静");
		c.add("狗蛋");
		
		//得到一个迭代器
		Iterator it = c.iterator();
	
		while(it.hasNext()){
			it.next();
			it.remove();
		}
			
		System.out.println(c);
		System.out.println("判断是否存在遍历:"+it.hasNext());
		
	}

}
