class Student
{
	int id;
	String name;

	public Student(int id,String name)
	{
		this(name);//�����˱����һ�������Ĺ��췽��
		this.id = id;
        System.out.println("���������Ĺ��췽����������");
		//������õ�����Ĺ��췽�� this.name = name;
	    }

	public Student()
	{
		 System.out.println("�޲����Ĺ��췽����������");
	}

	public Student(String name)
	{
		this();
		this.name = name;
		System.out.println("һ�������Ĺ��췽����������");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Student p1 = new Student(110,"�ܽ���");
     }
}

 
