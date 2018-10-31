package cn.itcast.others;

import java.util.ArrayList;
import java.util.Collections;

//静态导包
import static java.util.Collections.*;
import static java.lang.System.out;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(3);
		list.add(2);
		//排序
		sort(list);
		out.println(list);
		out.println("最大值："+max(list));
		out.print("最大值的索引值："+binarySearch(list, max(list)));

	}

}
