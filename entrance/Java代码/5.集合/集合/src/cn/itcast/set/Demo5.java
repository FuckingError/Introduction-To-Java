package cn.itcast.set;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet�ǿ��Զ��ַ�����������ģ���Ϊ�ַ����Ѿ�ʵ�ֵ�Comparable�ӿ�
 * �ַ����ıȽϹ���
 * ���һ�����ǰ��һһ��Ӧ����Ƚϳ��ֲ�ͬʱ���Ǹ��ַ��Ĵ�С
 * �����������Ҳ�������Ӧ�ģ���Ƚ��ַ����ĳ���
 * */

/*˼�룺
 * 1.����ĳ������ʱ��Ҫ�뵽������
 * 
 * ������
 * 1.ѧ���и��ַ���  String[] s = str.spilt(" ");
 * 2.ѧ���ַ���ת��������  int num = Integer.parseInt(c[i]);
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
