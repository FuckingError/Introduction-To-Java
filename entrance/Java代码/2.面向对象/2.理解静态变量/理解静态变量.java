public class Demo
{
	/*
	static int i = 1;
	static
	{
		//不会再被执行
		i++;
	}
	public Demo()
	{
		i++;
	}
    public static void main(String []args)
	{
		Demo t1 = new Demo();
		System.out.println(t1.i);

		Demo t2 = new Demo();
		System.out.println(t2.i);
	}
	*/
	 public static void main(String []args)
	{
	 Stu st1 = new Stu(29,"aa",340);

   	 Stu st2 = new Stu(39,"bb",240);

	 System.out.println(Stu.getTotalFee());
	}
}


class Stu
{
	int age;
	String name;
	int fee;
	static int totalFee;

	public Stu(int age,String name,int fee)

	{
		this.age = age;
		this.name = name;
	    totalFee+=fee;
	}

	//返回总学费
	
	public static int getTotalFee()
	{
		return totalFee;
	}
	
}