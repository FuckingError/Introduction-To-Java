package cn.itcast.list;

import java.util.ArrayList;
import java.util.ListIterator;
/*时间：2017年4月12日21:43:10
 * 目的：删除集合中重复的元素，即编号相同的元素
 * 
 * 思想：
 * 1.it.next() 获取到的是Object
 * 2.强制转换 Books book = (Books)obj;
 * 3.在一个迭代器中，不允许使用集合的方法对集合进行操作，统一使用迭代器的方法
 * 4.当集合元素为数组类型时，要改写toString方法
 * 5.要有面向对象的思想，具体某种行为要写成方法的形式，可以先卸载主函数中，再重构成方法
 *技术：
 * 1.掌握迭代器的方法
 *   （1）普通迭代器:remove（）
 *   （2）list迭代器：add() 在指针处添加元素
 *                set() 指定替换最后一次返回的元素
 * */
class Books{
	int id;
	String name;
	
	
	public Books(int id,String name){
		this.id = id;
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Books book = (Books)obj;
		return book.id == this.id;
		}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{编号:"+id+" 书名:"+name+"}"; 
	}
}
	
	


public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Books(110,"java编程思想"));
		list.add(new Books(220,"java核心技术"));
		list.add(new Books(330,"深入javaweb"));
		list.add(new Books(110,"javas神书"));
		
		ArrayList list1 = clearRepeat(list);
		System.out.println(list1);	
		}

	public static ArrayList clearRepeat(ArrayList list) {
		ArrayList list1 = new ArrayList();
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()){
			Books book = (Books) it.next();
			if(!list1.contains(book)){
				list1.add(book);//这样做的目的是节省内存
			}
		}
		return list1;
		
		/*另一个方式  因为移去一个元素，后面的集合元素会往前移动，太慢啦
			 * if(list1.contains(book)){
			 *   it.remove();
			 * }
			 * System.out.println(list);
			 * */
		
	}

}
