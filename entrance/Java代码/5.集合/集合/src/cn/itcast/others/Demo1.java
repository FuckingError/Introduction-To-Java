package cn.itcast.others;

import java.util.ArrayList;
import java.util.Collections;

//��̬����
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
		//����
		sort(list);
		out.println(list);
		out.println("���ֵ��"+max(list));
		out.print("���ֵ������ֵ��"+binarySearch(list, max(list)));

	}

}
