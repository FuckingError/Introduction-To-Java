//时间：2017年3月24日15:47:46
//super关键字
class Fu
{
	int x = 10;
	String name;
	public Fu(String name)
	{
		this.name = name;
		System.out.println("Fu类带参的构造方法");
	}

	public Fu()
	{
		System.out.println("Fu类无参的构造方法");
	}
}

class Zi extends Fu
{
	int x = 20;
//调用父类的构造方法
	public Zi(String name)
	{
		super(name);//指定调用父类一个参数的构造函数
	}
	
	public void print()
	{
		System.out.println("x1 = "+x);
		System.out.println("x2 = "+ super.x);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Zi z = new Zi("周杰伦");
		z.print();
		System.out.println("z的name:"+z.name);
	}
} 
