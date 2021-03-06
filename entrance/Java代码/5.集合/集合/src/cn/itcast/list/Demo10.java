package cn.itcast.list;

import java.util.LinkedList;
/*栈：主要实现堆栈数据结构的存储方式
 *   先进后出
 *   push() 推
 *   pop()  冒
 *   
 *队列：先进先出
 *offer() 
 *poll() 投票
 * 
 * */



//模拟堆栈的存储方式
class StruckList{
	LinkedList list;
	
	public StruckList(){
		list = new LinkedList();
	}
	
	public void add(Object o ){
		list.push(o);
	}
	
	//弹栈：把元素删除并返回
	public Object pop(){
		return list.pop();
	}
	
	public int size()
	{
		return list.size();
	}
}

//模拟队列
class TeamList{
	LinkedList list;
	
	public TeamList(){
		list = new LinkedList();
	}
	
	public void add(Object o){
		list.offer(o);
	}
	
	public Object remove(){
		return list.poll();
	}
	
	public int size(){
		return list.size();
	}
}

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*堆栈的存储方式
		StruckList list = new StruckList();
		list.add("马云");
		list.add("李嘉诚");
		list.add("王健林");
		
		while(list.size()!=0){
		System.out.println(list.pop());*/
		
		TeamList list = new TeamList();
		list.add("马云");
		list.add("李嘉诚");
		list.add("王健林");
	
	    while(list.size()!=0){
	    	System.out.println(list.remove());
		}
	    
	    
	}
}

