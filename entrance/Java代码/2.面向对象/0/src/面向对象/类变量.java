class Child
{
	int age;
	String name;
        //total �Ǿ�̬��������������Ա�����һ���������
	static int total = 0;
	public Child(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public void joinGame()
	{
		total++;
		System.out.println("��һ��С���Ӽ�����");
	}
}
public class �����
{
	public static void main(String []args)
	{
		Child ch1 = new Child(3,"��");
                ch1.joinGame();
		Child ch2 = new Child(2,"ЦЦ");
                ch2.joinGame();
                Child ch3 = new Child(5,"���");
                ch3.joinGame();

                
                System.out.println("����="+Child.total);
	}

}
