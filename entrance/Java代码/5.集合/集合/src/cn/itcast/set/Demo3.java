package cn.itcast.set;
/*TreeSet ��Ԫ��Ϊ��������ʱ��ʵ��Comparable�ӿڣ�����д����compareTo
 * Comparable< > �Զ��巺��  ʵ��compareTo����ʱ������ָ������
 * 
 * 
 * */
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int money;
	int id;
	
	public Person(String name,int money,int id){
		this.name = name;
		this.money = money;
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{������"+name+" ���ʣ�"+money+" ��ţ�"+id+"}";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
}
/*treeSet
 * 
 * 
 * */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
	
		/*set.add(2);
		set.add(1);
		set.add(0);
		System.out.println(set);*/
		
		set.add(new Person("JAY",1000,125));
		set.add(new Person("����",5000,15));
		set.add(new Person("����",2000,1));
		//�ײ�ά�����Ƕ�����  ����Ƚ�Ԫ��ʱ��compareTo�������ص���0����ô��Ԫ�ر���Ϊ�ظ�Ԫ�أ���������ӣ���hashCode��equals�޹أ�
		System.out.println(set);
		}
	}
