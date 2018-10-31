abstract class MyRunTime
{
	public final void getTime()
	{
		long startTime = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
	    System.out.println("����ʱ�䣺"+(endTime-startTime));
	}

	public abstract void code();

}

class Demo extends MyRunTime
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.getTime();
	}

	public void code()
	{
		for(int i = 0;i < 100;i++)
		{
			System.out.println(i);
		}
	}
}