package 数组的用法;//2017年3月9日13:12:24
class Person
{
	public int age;
	public double height;
	public void info()
	{
		System.out.println("我的年龄是："+age+",我的身高是："+height)	;
	}
}
public class 引用类型数组的初始化 
{
	public static void main(String[] args)
	{
		Person[] students;
		students = new Person[2];
		System.out.println("students 所引用的数组的长度是："+students.length);
		
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 158;
		
		Person lee = new Person();
		lee.age  = 16;
		lee.height = 161;
		
		students[0] = zhang;
		students[1] = lee;
		
		lee.info();
		students[1].info();
	}
}
/*
 * 
 * */
 */