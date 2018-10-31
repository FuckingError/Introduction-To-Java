class Child
{
	int age;
	String name;
        //total 是静态变量，因此他可以被任意一个对象访问
	static int total = 0;
	public Child(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public void joinGame()
	{
		total++;
		System.out.println("有一个小孩子加入了");
	}
}
public class 类变量
{
	public static void main(String []args)
	{
		Child ch1 = new Child(3,"妞妞");
                ch1.joinGame();
		Child ch2 = new Child(2,"笑笑");
                ch2.joinGame();
                Child ch3 = new Child(5,"大大");
                ch3.joinGame();

                
                System.out.println("共有="+Child.total);
	}

}
