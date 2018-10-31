//时间：2017年3月24日21:53:39
//需求：描述一个图形，圆形，矩形三个类，具备计算面积与周长的行为
abstract class Myshape
{
	String name;

	public Myshape(String name)
	{
		this.name = name;
	}

	public abstract void getArea();
	public abstract void getLength();
}

class Circle extends Myshape
{
	double r;
	public static final double PI = 3.14;

	public Circle(String name,double r)
	{
		super(name);
		this.r = r;
	}

	public void getArea()
	{
		/*
		double s = 0;
		s = r*r*PI;
		System.out.println(name+"的面积为"+s);
	    */
		System.out.println(name+"的面积为："+r*r*PI);
	}

	public void getLength()
	{
		System.out.println(name+"的周长为："+PI*2*r);
	}
}

class Rect extends Myshape
{
	double length;
	double width;
	public Rect(String name,double length,double width)
	{
		super(name);
		this.length = length;
		this.width = width;
	}

	public void getArea()
	{
		System.out.println(name+"的面积为："+length*width);
	}

	public void getLength()
	{
		System.out.println(name+"的周长为："+(length+width)*2);
	}

} 

class Demo
{
	public static void main(String[] args)
	{
		Circle c = new Circle("圆",2);
		c.getArea();
		c.getLength();
		Rect r = new Rect("矩形",2,3);
		r.getArea();
		r.getLength();
	}
}