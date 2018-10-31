package 面向对象;//2017年3月9日21:37:47
class Cat
{//下面的是类的成员变量/成员属性
	int age;
	String name;
	String color;
	//构造方法
	
	
	public static void speak()
	{
		int result = 0;
		
		for(int i = 1;i<=1000;i++)
		{
			result+=i;//注意这种算式
		}
		System.out.println(result);
		
	}
	//带参数的成员方法
	public static void jisuan(int n,float a,float b)
	{
		float result = 0;
        result = n + a + b;
		
		System.out.println(result);
	}
}

public class 理解面向对象 {
	public static void main(String[] args)//注意要写
	{
	Cat cat1 = new Cat();//声明和创建
	cat1.speak();//调用speak方法
	cat1.jisuan(1,2.3f,4.3f);
	//对象名.属性名
	/*cat1.age = 3;
	cat1.name = "小白";
	cat1.color = "白色";
	
	Cat cat2;//声明,未创建，没有开辟内存空间
	cat2 = cat1;//cat2指向cat1
	System.out.println(cat2.age);
	
	Cat cat3;
	cat3 = cat2;
	
	System.out.println(cat3.name);
	
	cat3.age = 11;
	System.out.println(cat1.age);
	*/
	
}
}
