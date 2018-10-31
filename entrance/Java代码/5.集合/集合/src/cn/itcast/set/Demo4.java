package cn.itcast.set;

import java.util.Comparator;
import java.util.TreeSet;

/*TreeSet��ʵ��ԭ��
 * TreeSet��ע������:
 *   1.Ԫ�ر���߱�����Ȼ˳������ԣ���ô������Ȼ˳����������򴢴�
 *   2.Ԫ�ر���������Ȼ˳������ԣ���Ԫ�������������Ҫʵ��Comparable�ӿڣ���Ԫ�صıȽϹ�������CompareTo������
 *   3.�ײ�ά�����Ƕ�����  ����Ƚ�Ԫ��ʱ��compareTo�������ص���0����ô��Ԫ�ر���Ϊ�ظ�Ԫ�أ���������ӣ���
 *   4.��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر���û�о߱���Ȼ˳������ԣ���Ԫ����������Ҳû��ʵ��Comparable�ӿڣ���ô����Ҫ�ڴ���TreeSet��ʱ����һ���Ƚ���
 *   5.�Ƽ�ʹ��Comparator  ���ͬʱ��ʵ��Comparable��ʵ�ֱȽ������Ƚ������ȷ�������
 * */
class MyComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return  o1.id-o2.id;
	}
}


public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComparator c = new MyComparator();
		TreeSet set = new TreeSet(c);
		set.add(new Person("Jay",10000,125));
		set.add(new Person("����",5000,15));
		set.add(new Person("����",2000,16));
		System.out.println(set);
		
	}

}
