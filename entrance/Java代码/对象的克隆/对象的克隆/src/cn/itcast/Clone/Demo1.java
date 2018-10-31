package cn.itcast.Clone;
/*时间：2017年9月6日18:30:00
 * 浅克隆:
 * 1.在需要克隆的对象中重写Clone的方法 修改权限为public
 * 2.需要克隆的对象 实现Cloneable 接口
 * 3.调用clone方法
 *注意：
 * */

public class Demo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Address address = new Address("靖江");
		Person person1 = new Person("刘清", 20,address);
		Person person2 = (Person) person1.clone();
		person2.age = 2;
		person2.address.address = "常熟";//浅克隆 当被克隆的对象中还有一个对象 里面的对象是地址被克隆 
		System.out.println("p1:"+person1);
		System.out.println("p2:"+person2);

	}

}
