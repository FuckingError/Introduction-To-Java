package cn.itcast.set;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet是可以对字符串进行排序的，因为字符串已经实现的Comparable接口
 * 字符串的比较规则：
 * 情况一：如果前面一一对应，则比较出现不同时的那个字符的大小
 * 情况而：如果找不到不对应的，则比较字符串的长度
 * */

/*思想：
 * 1.遍历某个集合时，要想到迭代器
 * 
 * 技术：
 * 1.学会切割字符串  String[] s = str.spilt(" ");
 * 2.学会字符串转换成整型  int num = Integer.parseInt(c[i]);
 *
 *  
 * */
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet tree = new TreeSet();
		tree.add("abd");
		tree.add("abcasdqdqwqwd");
		tree.add("cbcwdsddd");
		
		
		System.out.println(tree);
		*/
		String s = "2 5 9 7 6";
		String[] c = s.split(" ");
		TreeSet t = new TreeSet();
		for(int i = 0;i<c.length;i++){
			int num = Integer.parseInt(c[i]);
			t.add(num);
		}
		
		Iterator it = t.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
			
		}
		
		

		
	}

}
