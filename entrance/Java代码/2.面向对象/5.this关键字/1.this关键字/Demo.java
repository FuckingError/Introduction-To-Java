class Animal
{
	String name;
    String color;

    
	public Animal(String n,String c)
	{
		name = n;
		color = c;
		eat();
        System.out.println(this.name+"�ڳ�ʺ");

	}

	public void eat()
	{
		String name = "����";
		System.out.println(this.name+"");
	}

}

class Demo
{
	public static void main(String[] args)
	{
		Animal dog = new Animal("��ˬ","�ڲ�����");
		dog.eat();
	
	}
}