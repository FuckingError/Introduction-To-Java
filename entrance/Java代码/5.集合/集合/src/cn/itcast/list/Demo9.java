package cn.itcast.list;

import java.util.Iterator;

//LinkedList() 特有方法介绍

import java.util.LinkedList;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		//添加
		list.addFirst("赵六");
		list.addLast("狗娃");
		
		//获取
		System.out.println("获取集合的首位元素:"+list.getFirst());
		System.out.println("获取集合的末尾元素:"+list.getLast());
		
		//删除
		System.out.println("删除首位元素，并且返回:"+list.removeFirst());
		System.out.println("删除末尾元素，并且返回："+list.removeLast());
		
		//descendingIterator()迭代器
		Iterator it = list.descendingIterator();
		//逆序遍历
		while(it.hasNext()){
			System.out.println("元素:"+it.next());
		}
		
		System.out.println(list);
	}

}
