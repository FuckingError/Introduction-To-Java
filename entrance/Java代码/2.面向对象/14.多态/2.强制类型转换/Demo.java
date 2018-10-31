//ʱ�䣺2017��3��26��14:54:35
//���󣺶���һ���������Խ����������͵Ķ�������ں����ڲ�Ҫ���õ��������еķ���

abstract class Animal
{
    String name;
	
	public Animal(String name)
	{
		this.name = name;
	}

	

	abstract public void run();
}

class Mouse extends Animal
{
	public Mouse(String name)
	{
		super(name);
	}

    public void run()
	{
		System.out.println(name+"�����ܣ�����");
	}
	public void dig()
	{
		System.out.println(name+"���....");
	}
}

class Fish extends Animal
{
	public Fish(String name)
	{
		super(name);
	}

	public void run()
	{
		System.out.println(name+"�ΰ���....");
	}

	public void bubble()
	{
		System.out.println(name+"������...");
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Mouse a = new Mouse("��ˬ");
		print(a);
	
	}

	public static void print(Animal s)
	{
		//����instanceof �ж�s�Ƿ�����Fish
		if(s instanceof Fish )
		{
		Fish f = (Fish)s;
		f.bubble();
		}
		else if(s instanceof Mouse)
		{
			Mouse m = (Mouse)s;
			m.dig();
		}
	}
}