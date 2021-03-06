//时间：2017年3月13日13:59:532
class Car
{
	String name;
	String color;
	int wheel;
	public Car(int wheel)
	{
		this.wheel = wheel;
	}
	

	public void run()
	{
		if(wheel >= 4)//变量在同一个作用域上（大括号）是可以直接访问的
		{
			System.out.println(name+wheel+"个轮子飞快跑起来..");
        }
		else
		{
			System.out.println(name+"不够四个轮子，快去修理");
	    }
	 }
}
class CarFactory
{
	String name;
	String address;
	String tel;
//构造方法
	public CarFactory(String name,String address,String tel)
	{
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	//修车公共行为
	public void repair(Car c)//当在考虑参数时，要想这个方法的作用是什么，需要输入什么和输出什么
	{
		if(c.wheel >= 4)
		{
		 System.out.println("轮子没少");
		}
		 else
		{
			 c.wheel = 4;
		 System.out.println("车修好了，交钱！");
		 }
		 //return c;//主函数中的需要接收c，所以写return c
		 //没有返回值，也一样可以实现
	}


}
class 理解对象
{
	public static void main(String[] args)
	{
		/*
		Car c = new Car();
		c.name = "大众";
		c.color = "粉色";
		c.wheel = 3;

		c.run();
		
	    //cf.repair(c);
		*/
		//使用匿名对象
		CarFactory cf = new CarFactory("4s","阳光大道","15252616685");
        cf.repair(new Car(4));//当使用匿名对象作用实参调用函数时，可以通过构造方法去赋予匿名方法属性
    }
}
//想在创建新对象时设置属性，要在类中定义构造方法