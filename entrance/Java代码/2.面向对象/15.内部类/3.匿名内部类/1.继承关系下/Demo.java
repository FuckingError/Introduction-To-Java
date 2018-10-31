abstract class Animal
{
	public abstract Animal run();
	public abstract void bite();
}

class Outer
{
	public void print()
	{
		//局部内部类
		/*
		class Dog extends Animal
		{
			public void run()
			{
				System.out.println("狗在跑...");
			}

			public void bite()
			{
				System.out.println("狗在咬！！！");
			}
		}
		
		//创建对象
		Dog d = new Dog();
		d.run();
		d.bite();

         */		
		//匿名内部类：只是没有类名，其他都有！！！
		//匿名内部类与Animal是继承关系，创建的Animal子类的对象
		
		//第一个方法的返回值为父类名，return this
		
		new Animal(){
			public Animal run(){
				System.out.println("狗在跑......");
				return this;
			}

			public void bite(){
				System.out.println("狗在咬人！！！");
			}
		}.run().bite();
	}
}
		
		

		//给匿名内部类一个对象名，（所谓匿名内部类是指没有类名！！！）
		/*
		Animal a = new Animal()//多态！！！
		{
			public Animal run()
			{
				System.out.println("狗在跑！！！");
				return this;
			}
			public void bite()
			{
				System.out.println("狗在咬！！！");
			}

		
			//如果子类对象中有特有的方法，只能使用局部内部类进行访问
		};
		a.run();
		a.bite();
	}*/


class Demo
	{
	public static void main(String[] args)
		{
		Outer outer = new Outer();
		outer.print();
		}
	}



