//时间：2017年3月24日20:16:23
final class Circle
{
	double r;
	final double pi = 3.14;
    
	public Circle()
	{
	}
  
	public Circle(double r)
	{
         this.r = r;
	}

	final public void getArea()
	{
		System.out.println("圆形的面积是："+r*r*pi);
	}
}

class Demo extends Circle
{
	/*
	public Demo(double r)
	{
		super(r);
	}
     */
 
	/*重写函数
	public void getArea()
	{
		System.out.println("我是圆！！！");
	}
     */

	public static void main(String[] args)
	{
		final Circle c = new Circle(4.0);
		//c = new Circle(5.0);
		//c.getArea();
		test(c);
	}

	public static void test(Circle c)
	{
		c = new Circle(5.0);
		c.getArea();
	}
}