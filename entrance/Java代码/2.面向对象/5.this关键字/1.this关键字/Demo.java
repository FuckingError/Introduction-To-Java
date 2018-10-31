class Animal
{
	String name;
    String color;

    
	public Animal(String n,String c)
	{
		name = n;
		color = c;
		eat();
        System.out.println(this.name+"ÔÚ³ÔÊº");

	}

	public void eat()
	{
		String name = "ÀÏÊó";
		System.out.println(this.name+"");
	}

}

class Demo
{
	public static void main(String[] args)
	{
		Animal dog = new Animal("ºÂË¬","ºÚ²»ÁïÇï");
		dog.eat();
	
	}
}