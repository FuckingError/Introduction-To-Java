package �������;
class Person
{
	int age;
	String name;
	Dog dog;
	public Person(Dog dog,int age,String name)
	{
		//�ɶ��Ժܲ�
		this.age = age;
		this.name = name;
		this.dog = dog;
	}
	public void showInfo()
	{
		System.out.println("�����ǣ�"+this.name);
	}
}

class Dog
{
	int age;
	String name;
	public Dog(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	public void showInfo()
	{
		System.out.println("������"+this.name);
	}
	
}
public class this�Ľ��� 
{
	public static void main(String []args)
	{
		Dog dog1 = new Dog(2,"���");
		Person p1 = new Person(dog1,23,"���¸�");
		Person p2 = new Person(dog1,24,"��ǫ");
		p1.showInfo();
		p1.dog.showInfo();
		
	}
}
//��һ�����п���������һ�����еķ���

