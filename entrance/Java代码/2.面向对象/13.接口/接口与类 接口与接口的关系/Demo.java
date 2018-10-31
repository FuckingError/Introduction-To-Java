interface A
{
	public void print();
}

interface C
{
	public void getArea();
}

interface B extends A,C
{
	public void test();
}

class Demo implements A,B
{
	public void print()
	{}

	public void test()
	{}

	public void getArea()
	{}
	
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.print();
	}
}