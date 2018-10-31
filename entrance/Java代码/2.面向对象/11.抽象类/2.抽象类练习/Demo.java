//ʱ�䣺2017��3��24��21:53:39
//��������һ��ͼ�Σ�Բ�Σ����������࣬�߱�����������ܳ�����Ϊ
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
		System.out.println(name+"�����Ϊ"+s);
	    */
		System.out.println(name+"�����Ϊ��"+r*r*PI);
	}

	public void getLength()
	{
		System.out.println(name+"���ܳ�Ϊ��"+PI*2*r);
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
		System.out.println(name+"�����Ϊ��"+length*width);
	}

	public void getLength()
	{
		System.out.println(name+"���ܳ�Ϊ��"+(length+width)*2);
	}

} 

class Demo
{
	public static void main(String[] args)
	{
		Circle c = new Circle("Բ",2);
		c.getArea();
		c.getLength();
		Rect r = new Rect("����",2,3);
		r.getArea();
		r.getLength();
	}
}