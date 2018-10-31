//时间：2017年3月26日14:54:35
//需求：定义一个函数可以接受任意类型的动物对象，在函数内部要调用到动物特有的方法

abstract class Animal
{
    String name;
	
	public Animal(String name)
	{
		this.name = name;
	}

	

	abstract public void run();
}

class Mouse extends Animal
{
	public Mouse(String name)
	{
		super(name);
	}

    public void run()
	{
		System.out.println(name+"跑跑跑！！！");
	}
	public void dig()
	{
		System.out.println(name+"会打洞....");
	}
}

class Fish extends Animal
{
	public Fish(String name)
	{
		super(name);
	}

	public void run()
	{
		System.out.println(name+"游啊游....");
	}

	public void bubble()
	{
		System.out.println(name+"吐泡泡...");
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Mouse a = new Mouse("郝爽");
		print(a);
	
	}

	public static void print(Animal s)
	{
		//利用instanceof 判断s是否属于Fish
		if(s instanceof Fish )
		{
		Fish f = (Fish)s;
		f.bubble();
		}
		else if(s instanceof Mouse)
		{
			Mouse m = (Mouse)s;
			m.dig();
		}
	}
}