//时间：2017年3月26日21:24:57
class Outer
{
	String name = "外部类的name";
	public void test()
	{
		final int y = 10;
		
		class Inner
		{
			
			public void print()
			{
				System.out.println("这个是局部内部类的方法"+y);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.test();
	}
}