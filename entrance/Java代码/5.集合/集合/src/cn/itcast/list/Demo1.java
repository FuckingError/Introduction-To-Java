package cn.itcast.list;

import java.util.ArrayList;
import java.util.Collection;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("周杰伦");
		c.add("张国荣");
		c.add("周星驰");
		System.out.println("添加成功吗？"+c.add("胡歌"));
		
		Collection c1 = new ArrayList();
		c1.add("刘德华");
		c1.add("陈奕迅");
		c1.add("周杰伦");
		
		c.addAll(c1);
		
		//c.clear();//清空集合中的元素
		
		/*删除
		System.out.println("删除成功吗？"+c.remove("刘德华"));
		*/
		
		//c.removeAll(c1);//删除c集合中与c1的交集
		
		//c.retainAll(c1);//保留c集合与c1集合的交集元素
		
		System.out.println("查看元素的个数:"+c.size());
		
		System.out.println("判断元素是否为空?"+c.isEmpty());
		System.out.println("判断集合中是否存在指定的元素?"+c.contains("周杰伦"));//contains内部调用了equals
		
		System.out.println("集合的元素:"+c);
		
		
		

	}

}
