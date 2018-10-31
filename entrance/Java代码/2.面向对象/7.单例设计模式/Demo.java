//时间：2017年3月23日14:50:31
class Single
{
	private static Single s = new Single();
	private Single(){};

	public static  Single getInstance()
		{
		return s;
		}


}


class Single2
{
	private static Single2 s;
    private Single2(){}
	public static Single2 getInstance()
	{
		if(s == null)
		{
			s = new Single2();
		}
		return s;
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Single2 s1 = Single2.getInstance();
		Single2 s2 = Single2.getInstance();
		System.out.println("是同一个对象吗？"+(s1 == s2));

		
	
	}
}