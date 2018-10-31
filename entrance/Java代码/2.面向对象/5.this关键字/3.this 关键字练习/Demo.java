//时间：2017年3月21日15:50:41
//需求：使用java定义一个人类，人具备id,name,age三个属性，还具备一个比较年龄的方法
//要求：必须写上构造函数，构造函数也必须要使用this关键字

class Person
{
    int id;
	String name;
	int age;
   
	public Person(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
     
	 public void compareAge(Person p2)
	{
		 if(this.age>p2.age)
		{
			 System.out.println(this.name+"大");
		}
		 else if(this.age<p2.age)
		{
			 System.out.println(p2.name+"大");
		}
		 else
	    {
			 System.out.println("一样大！");
		}
	 }
}

class Demo
{
	public static void main(String[] args)
	{
	Person p1 = new Person(123,"周杰伦",36);
	Person p2 = new Person(1234,"刘清",20);
	p1.compareAge(p2);
	}             
}
//在类中的函数，如果函数中需要用到一个对象的实参，则可以在函数中用this代替该对象，同时在参数列表中只需要一个形参