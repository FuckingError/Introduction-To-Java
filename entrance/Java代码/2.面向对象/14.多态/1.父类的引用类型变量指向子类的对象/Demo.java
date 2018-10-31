//时间：2017年3月25日21:27:52
//定义一个函数可以接受任意类型的图形对象，并且打印图形面积和周长

abstract class Myshape
{
	abstract public void getArea();
	abstract public void getLength();
}

class Circle extends Myshape
{
	public static final double PI = 3.14;
	double r;
	public Circle (double r)
	{
		this.r = r;
	}

	public void getArea()
	{
		System.out.println("圆的面积为："+PI*r*r);
	}

	public void getLength()
	{
		System.out.println("圆的周长为："+PI*2*r);
	}
}

class Rect extends Myshape
{
	int width;
	int height;

	public Rect (int width,int height)
	{
		this.width = width;
		this.height = height;
	}

	public void getArea()
	{
		System.out.println("矩形的面积为："+width*height);
	}

	public void getLength()
	{
		System.out.println("矩形的周长为："+(width+height)*2);
	}

}
class Demo
{
	public static void main(String[] args)
	{
		/*
		Rect r = new Rect(2,3);
		print(r);
         */
		 int i = 1;
		 Myshape s = getShape(1);//调用了使用多态的方法，定义的变量类型要与返回值类型一致
		 print(s);
	}

//多态用于形参类型的时候，可以接受更多类型的数据
	public static void print(Myshape s)
	{
		s.getArea();
		s.getLength();
	}
	

//多态用于返回值类型的时候，可以返回更多类型的数据
//需求：定义一个函数可以返回任意类型的图形对象
public static Myshape getShape(int i)
	{
	if(i == 0)
		{
		return new Circle(4.0);
		}
	else
		{
		return new Rect(2,3);
	    }
    }
}
