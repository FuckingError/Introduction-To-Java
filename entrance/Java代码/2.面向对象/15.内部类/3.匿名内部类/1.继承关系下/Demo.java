abstract class Animal
{
	public abstract Animal run();
	public abstract void bite();
}

class Outer
{
	public void print()
	{
		//�ֲ��ڲ���
		/*
		class Dog extends Animal
		{
			public void run()
			{
				System.out.println("������...");
			}

			public void bite()
			{
				System.out.println("����ҧ������");
			}
		}
		
		//��������
		Dog d = new Dog();
		d.run();
		d.bite();

         */		
		//�����ڲ��ֻࣺ��û���������������У�����
		//�����ڲ�����Animal�Ǽ̳й�ϵ��������Animal����Ķ���
		
		//��һ�������ķ���ֵΪ��������return this
		
		new Animal(){
			public Animal run(){
				System.out.println("������......");
				return this;
			}

			public void bite(){
				System.out.println("����ҧ�ˣ�����");
			}
		}.run().bite();
	}
}
		
		

		//�������ڲ���һ��������������ν�����ڲ�����ָû��������������
		/*
		Animal a = new Animal()//��̬������
		{
			public Animal run()
			{
				System.out.println("�����ܣ�����");
				return this;
			}
			public void bite()
			{
				System.out.println("����ҧ������");
			}

		
			//�����������������еķ�����ֻ��ʹ�þֲ��ڲ�����з���
		};
		a.run();
		a.bite();
	}*/


class Demo
	{
	public static void main(String[] args)
		{
		Outer outer = new Outer();
		outer.print();
		}
	}



