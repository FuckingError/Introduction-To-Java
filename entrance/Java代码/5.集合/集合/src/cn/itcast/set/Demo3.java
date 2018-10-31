package cn.itcast.set;
/*TreeSet 当元素为引用类型时，实现Comparable接口，并重写方法compareTo
 * Comparable< > 自定义泛型  实现compareTo方法时，可以指定泛型
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
		return "{姓名："+name+" 工资："+money+" 编号："+id+"}";
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
		set.add(new Person("刘建",5000,15));
		set.add(new Person("刘清",2000,1));
		//底层维护的是二叉树  如果比较元素时，compareTo方法返回的是0，那么该元素被视为重复元素，不允许添加（与hashCode和equals无关）
		System.out.println(set);
		}
	}
