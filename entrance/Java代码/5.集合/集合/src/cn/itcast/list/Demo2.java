package cn.itcast.list;
/*自定义集合的比较与打印
 * contains()
 *containsAll()
 *打印
 * */
import java.util.ArrayList;
import java.util.Collection;



public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(123456,"周杰伦");
		Person p2 = new Person(123,"刘清");
		Person p3 = new Person(12,"呵呵");
		
		Collection p = new ArrayList();
		p.add(p1);
		p.add(p2);
		
		Collection ps = new ArrayList();
		ps.add(p1);
		ps.add(p2);
		ps.add(p3);
		
		//自定义集合元素  判断是否存在
		System.out.println("是否存在该集合元素？"+p.contains(new Person(123456,"j")));//调用的是实参的equals方法
		//打印自定义集合
		System.out.println(p);
		//
		System.out.println("ps集合是否存在p集合的所有元素？"+ps.containsAll(p));
		

	}

}
