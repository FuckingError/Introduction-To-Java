package �������;//2017��3��9��21:37:47
class Cat
{//���������ĳ�Ա����/��Ա����
	int age;
	String name;
	String color;
	//���췽��
	
	
	public static void speak()
	{
		int result = 0;
		
		for(int i = 1;i<=1000;i++)
		{
			result+=i;//ע��������ʽ
		}
		System.out.println(result);
		
	}
	//�������ĳ�Ա����
	public static void jisuan(int n,float a,float b)
	{
		float result = 0;
        result = n + a + b;
		
		System.out.println(result);
	}
}

public class ���������� {
	public static void main(String[] args)//ע��Ҫд
	{
	Cat cat1 = new Cat();//�����ʹ���
	cat1.speak();//����speak����
	cat1.jisuan(1,2.3f,4.3f);
	//������.������
	/*cat1.age = 3;
	cat1.name = "С��";
	cat1.color = "��ɫ";
	
	Cat cat2;//����,δ������û�п����ڴ�ռ�
	cat2 = cat1;//cat2ָ��cat1
	System.out.println(cat2.age);
	
	Cat cat3;
	cat3 = cat2;
	
	System.out.println(cat3.name);
	
	cat3.age = 11;
	System.out.println(cat1.age);
	*/
	
}
}
