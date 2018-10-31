class Person
{
	String name;

	 int age;
	
	public Person(String name)
	{
		this.name = name;
	}

   public Person(){System.out.println("父类无参构造函数被调用了");}

	public void eat()
	{
		System.out.println(this.name);
		System.out.println(this.name+"在吃饭...");
	}
}

class Student extends Person 
{
	int num;
	

    public Student(String name)
	{
		super(name);
		this.name = name;
		
	}

	public void study()
	{
		System.out.println("好好学习");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Student s = new Student("周杰伦");
		
		//s.name = ;
             
		s.age = 20;
	
		System.out.println("名字:"+s.name);

		s.eat();
		
	}
}