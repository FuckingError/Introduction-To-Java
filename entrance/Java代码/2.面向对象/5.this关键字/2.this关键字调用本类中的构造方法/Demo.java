class Student
{
	int id;
	String name;

	public Student(int id,String name)
	{
		this(name);//调用了本类的一个参数的构造方法
		this.id = id;
        System.out.println("两个参数的构造方法被调用了");
		//这里调用到下面的构造方法 this.name = name;
	    }

	public Student()
	{
		 System.out.println("无参数的构造方法被调用了");
	}

	public Student(String name)
	{
		this();
		this.name = name;
		System.out.println("一个参数的构造方法被调用了");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Student p1 = new Student(110,"周杰伦");
     }
}

 
