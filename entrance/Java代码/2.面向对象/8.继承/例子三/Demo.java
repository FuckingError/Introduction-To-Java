class Person
{
	String name;

	 int age;
	
	public Person(String name)
	{
		this.name = name;
	}

   public Person(){System.out.println("�����޲ι��캯����������");}

	public void eat()
	{
		System.out.println(this.name);
		System.out.println(this.name+"�ڳԷ�...");
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
		System.out.println("�ú�ѧϰ");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Student s = new Student("�ܽ���");
		
		//s.name = ;
             
		s.age = 20;
	
		System.out.println("����:"+s.name);

		s.eat();
		
	}
}