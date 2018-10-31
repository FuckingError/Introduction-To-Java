package 面向对象;
class Person
{
	int age;
	String name;
	Dog dog;
	public Person(Dog dog,int age,String name)
	{
		//可读性很差
		this.age = age;
		this.name = name;
		this.dog = dog;
	}
	public void showInfo()
	{
		System.out.println("人名是："+this.name);
	}
}

class Dog
{
	int age;
	String name;
	public Dog(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	public void showInfo()
	{
		System.out.println("狗名是"+this.name);
	}
	
}
public class this的讲解 
{
	public static void main(String []args)
	{
		Dog dog1 = new Dog(2,"大黄");
		Person p1 = new Person(dog1,23,"郭德纲");
		Person p2 = new Person(dog1,24,"刘谦");
		p1.showInfo();
		p1.dog.showInfo();
		
	}
}
//在一个类中可以引用另一个类中的方法

