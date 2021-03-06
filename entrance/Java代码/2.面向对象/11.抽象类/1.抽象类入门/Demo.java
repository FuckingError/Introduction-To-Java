//时间：2017年3月24日20:58:05
//运用抽象类强制子类重写父类的方法

abstract class Animal
{
	String name;
	String color;
	public Animal(String name,String color)
	{
		this.name =name;
		this.color = color;
	}

	public abstract void run(); 
	               
	public void eat()
	{
		System.out.println(name+"吃粮食");
	}
} 

   

class Dog extends Animal
{
	public Dog(String name,String color)
	{
		super(name,color);
	}

	public void run()
	{
		System.out.println(name+"四条腿跑得很快!!!");
	}
}

class Fish extends Animal
{
	public Fish(String name,String color)
	{
		super(name,color);
	}

	public void run()
	{
		System.out.println(name+"没有腿，游得快！！！");
	}
}
class Demo
{
	public static void main(String[] args)
	{
         Dog dog = new Dog("郝爽","黑色");
		 dog.run();

		 Fish f = new Fish("奚静","黑色");
		 f.run();
	}
}