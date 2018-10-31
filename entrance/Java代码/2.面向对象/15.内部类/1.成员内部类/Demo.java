class Outer
{
	int x = 1;
	//成员内部类
      class Inner
	{
		 int x = 10;
		 public void print()
		{
			System.out.println(x);//访问外部类的变量 this相当于一个对象
		}
	}

    //通过在外部类定义一个方法，创建内部类的对象，进行访问
	 //主要用于私有的成员内部类
	/*
	public void instance()
	{
		Inner a = new Inner();
		a.print();
	}
	*/
	
}

class Demo
{
	public static void main(String[] args)
	{
		/*
		Outer o = new Outer();
		o.instance();
        */

      

		/*直接通过在主函数中声明一个变量访问内部类
        Outer.Inner inner = new Outer().new Inner();
		inner.print();
	    */			


		/*访问静态变量  当Inner类和其中的变量都为静态类时，在主函数中可以不用创建Outer和Inner的对象进行访问
        System.out.println(Outer.Inner.x);
		*/
		
		//在主函数中声明一个变量访问静态内部类s
		/*
		Outer.Inner a = new Outer.Inner();
		a.print();
		*/
	}
}