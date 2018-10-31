//时间：2017年3月24日16:13:29
//需求：父类的功能无法满足子类的需求


class Fu
{
	String name;

	public Fu(String name)
	{
		this.name = name;
	}

	public void eat()
	{
         System.out.println(name+"吃番薯...");
	}
}

class Zi extends Fu
{
	String num;
	//指定调用父类的构造方法
	public Zi(String name)
	{
     super(name);
	}

    public void eat()
	{
		System.out.println(name+"吃龙虾...");
	}


}

class Demo
{
	public static void main(String[] args)
	{
		Zi z = new Zi("周杰伦");
		z.eat();
	}
}