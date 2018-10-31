package cn.itcast.Map;

import java.util.Comparator;
import java.util.TreeMap;

/*TreeMap:���ݼ�ֵ�������򴢴�
 * */
class MyComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character,Integer> tree = new TreeMap<Character,Integer>();
		tree.put('a',1);
		tree.put('b', 2);
		tree.put('c', 3);
		System.out.println(tree);
		
		//ע�⣺����ֵ��������Ȼ˳��ʱ��Ҫ�Լ��ڼ�ֵ������ʵ��comparable�ӿ�
		//                      �����Լ�дһ��Compartor�ӿ�ʵ����
		MyComparator compartor = new MyComparator();
		TreeMap<Person,String> tree2 = new TreeMap<Person,String>(compartor);
		tree2.put(new Person(1,"�ܽ���"), "����");
		tree2.put(new Person(2,"����"), "Ѧ����");
		tree2.put(new Person(3,"����"), "������");
		
		//���Compartorʵ���෵��ֵΪ0��������Ϊ��ֵ��ͬ������ֵȡ����ֵ
		tree2.put(new Person(1,"������"), "�Ա�ɽ");
	
		System.out.println(tree2);
		}
}
