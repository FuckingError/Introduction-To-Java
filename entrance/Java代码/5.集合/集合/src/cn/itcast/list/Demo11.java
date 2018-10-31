package cn.itcast.list;
/*ʱ�䣺2017��4��13��21:55:25 
 * Ŀ�ģ����������С����
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
		return "{"+"������"+name+" ���䣺"+age+"}";
	}
}

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(new People("�ܽ���",37));
		list.add(new People("����",20));
		list.add(new People("����",18));
		list.add(new People("����",34));
		
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
