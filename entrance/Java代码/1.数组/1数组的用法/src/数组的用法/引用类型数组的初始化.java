package ������÷�;//2017��3��9��13:12:24
class Person
{
	public int age;
	public double height;
	public void info()
	{
		System.out.println("�ҵ������ǣ�"+age+",�ҵ�����ǣ�"+height)	;
	}
}
public class ������������ĳ�ʼ�� 
{
	public static void main(String[] args)
	{
		Person[] students;
		students = new Person[2];
		System.out.println("students �����õ�����ĳ����ǣ�"+students.length);
		
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 158;
		
		Person lee = new Person();
		lee.age  = 16;
		lee.height = 161;
		
		students[0] = zhang;
		students[1] = lee;
		
		lee.info();
		students[1].info();
	}
}
/*
 * 
 * */
 */