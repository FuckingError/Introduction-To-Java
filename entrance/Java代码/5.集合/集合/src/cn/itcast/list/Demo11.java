package cn.itcast.list;
/*时间：2017年4月13日21:55:25 
 * 目的：按任年龄大小排序
 * */
import java.util.LinkedList;

class People{
	String name;
	int age;
	
	public People(String name,int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+"姓名："+name+" 年龄："+age+"}";
	}
}

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(new People("周杰伦",37));
		list.add(new People("刘清",20));
		list.add(new People("杨龙",18));
		list.add(new People("胡歌",34));
		
		System.out.println(sort(list));
	}

	public static LinkedList sort(LinkedList list) {
		for(int i = 0;i<list.size()-1;i++){
			for(int j = i+1;j<list.size();j++){
				People p1 = (People) list.get(i);
				People p2 = (People) list.get(j);
				if(p2.age<p1.age){
					list.set(i, p2);
					list.set(j, p1);
				}
			}
		}
		return list;
	}
}
