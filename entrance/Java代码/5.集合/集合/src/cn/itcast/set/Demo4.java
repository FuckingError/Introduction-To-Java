package cn.itcast.set;

import java.util.Comparator;
import java.util.TreeSet;

/*TreeSet的实现原理：
 * TreeSet的注意事项:
 *   1.元素本身具备了自然顺序的特性，那么按照自然顺序的特性排序储存
 *   2.元素本身不存在自然顺序的特性，该元素所属的类必须要实现Comparable接口，吧元素的比较规则定义在CompareTo方法上
 *   3.底层维护的是二叉树  如果比较元素时，compareTo方法返回的是0，那么该元素被视为重复元素，不允许添加（）
 *   4.往TreeSet添加元素的时候，如果元素本身没有具备自然顺序的特性，而元素所属的类也没有实现Comparable接口，那么必须要在创建TreeSet的时候传入一个比较器
 *   5.推荐使用Comparator  如果同时既实现Comparable又实现比较器，比较器优先发挥作用
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
		set.add(new Person("刘建",5000,15));
		set.add(new Person("刘清",2000,16));
		System.out.println(set);
		
	}

}
