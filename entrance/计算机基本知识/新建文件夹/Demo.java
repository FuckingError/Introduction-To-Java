class Student
{
	String _id;
	String _name;
	int _age;

    public Student(String id,String name,int age)
	{
		this._id = id;
		this._name = name;
		this._age = age;
	}

	public void Display()
	{
		System.out.println("ѧ�ţ�"+_id+",������"+_name+",���䣺"+_age);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Z00","����",20);
		s1.Display();
		s1.Id = "Z12";
		

		s1.Display();
	}
}