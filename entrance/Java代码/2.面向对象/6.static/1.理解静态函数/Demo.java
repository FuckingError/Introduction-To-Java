//时间：2017年3月21日21:54:34
//目的：理解静态函数
class Student
{
	String name;
	static String country = "中国";
	
	static
	{
		System.out.println("静态代码块执行了");
     }

	public Student(String name)
	{
		this.name = name;
    }

	public void study()
	{
		System.out.println(name+"好好学习");
	}

	public static void sleep()
	{
		System.out.println("呼呼大睡....."+name);
	}
}

class Demo
{
	public static void main(String[] ages)
	{
		Student s = new Student("狗娃");
		Student.sleep();
		
	}


}