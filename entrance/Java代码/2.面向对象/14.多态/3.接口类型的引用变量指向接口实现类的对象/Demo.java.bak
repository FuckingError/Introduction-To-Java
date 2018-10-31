interface Dao
{
	public void add();
	public void delete();
}

class UserDao implements Dao
{
	public void add()
	{
		System.out.println("添加员工成功！！");
	}

	public void delete()
	{
		System.out.println("删除员工成功！！");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Dao d = new UserDao(); //接口的引用类型变量指向接口实现类的对象
		d.add();
	}
}