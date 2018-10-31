package cn.itcast.Map;

import java.util.Comparator;
import java.util.TreeMap;

/*TreeMap:根据键值进行排序储存
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
		
		//注意：当键值不存在自然顺序时，要自己在键值的类上实现comparable接口
		//                      或者自己写一个Compartor接口实现类
		MyComparator compartor = new MyComparator();
		TreeMap<Person,String> tree2 = new TreeMap<Person,String>(compartor);
		tree2.put(new Person(1,"周杰伦"), "昆凌");
		tree2.put(new Person(2,"刘清"), "薛钰婷");
		tree2.put(new Person(3,"刘建"), "顾玲云");
		
		//如果Compartor实现类返回值为0，可以认为键值相同，则新值取代旧值
		tree2.put(new Person(1,"费玉清"), "赵本山");
	
		System.out.println(tree2);
		}
}
