//ʱ�䣺2017��3��24��15:47:46
//super�ؼ���
class Fu
{
	int x = 10;
	String name;
	public Fu(String name)
	{
		this.name = name;
		System.out.println("Fu����εĹ��췽��");
	}

	public Fu()
	{
		System.out.println("Fu���޲εĹ��췽��");
	}
}

class Zi extends Fu
{
	int x = 20;
//���ø���Ĺ��췽��
	public Zi(String name)
	{
		super(name);//ָ�����ø���һ�������Ĺ��캯��
	}
	
	public void print()
	{
		System.out.println("x1 = "+x);
		System.out.println("x2 = "+ super.x);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Zi z = new Zi("�ܽ���");
		z.print();
		System.out.println("z��name:"+z.name);
	}
} 
