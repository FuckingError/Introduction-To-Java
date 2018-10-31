package cn.itcast.Map;

import java.util.ArrayList;
import java.util.Collections;

/*collections 常见方法
 * 
 * */
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> list = new ArrayList<Person>();
			
		//自定义类型  排序需要传入比较器 
		list.add(new Person(2,"刘清"));
		list.add(new Person(1,"刘健"));
		list.add(new Person(0,"jay"));
		
	     //排序
		Collections.sort(list,new MyComparator1());
		System.out.println(list);
		//二分查找法，必须要先排序后使用 
		System.out.println("元素的索引值为："+Collections.binarySearch(list,new Person(2,"刘清"),new MyComparator1()));
		//最小值
		System.out.println("最大值："+Collections.max(list,new MyComparator1()));
		System.out.println("最小值："+Collections.min(list,new MyComparator1()));
		
		Collections.reverse(list);
		System.out.println("反转:"+list);
		
	}

}
