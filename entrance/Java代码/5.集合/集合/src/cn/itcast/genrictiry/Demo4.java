package cn.itcast.genrictiry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*���͵�������
 * 
 * */
public class Demo4 {
//���󣺶���һ���������Խ����������͵ļ��ϣ�Ҫ����ܵļ��϶���ֻ�ܴ洢Integer����Integer�ĸ�����������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("ss");
		print(list);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(123);
		print(set);
		
	}
	public static void print(Collection<? super Integer> c){
		
	}
}
