interface Dao
{
	public void add();
	public void delete();
}

class UserDao implements Dao
{
	public void add()
	{
		System.out.println("���Ա���ɹ�����");
	}

	public void delete()
	{
		System.out.println("ɾ��Ա���ɹ�����");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Dao d = new UserDao(); //�ӿڵ��������ͱ���ָ��ӿ�ʵ����Ķ���
		d.add();
	}
}