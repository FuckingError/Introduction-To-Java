//ʱ�䣺2017��3��25��12:43:12
import java.util.*;
//�����ֵ����
/*
class Demo
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3};
		changeValue(arr,1,2);
		System.out.println(Arrays.toString(arr));
		}

	public static void changeValue(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
*/

class Person
{
	int a = 10;
	int b = 20;
}

class Demo
{
	public static void main(String[] args)
	{
		Person p = new Person();
        Demo d = new Demo();
		d.changeValue(p);
		System.out.println(p.a+"  "+ p.b);

	}
//���һ���ڷ����в������µĶ��󣬿��Ե���ֵ
	public void changeValue(Person p)
	{
		int temp = p.a;
		p.a = p.b;
		p.b = temp;

	}

//��������ڷ����д����µĶ��󣬲��ܵ���ֵ
    public static void changeValue(Person p)
	{
		p = new Person();
		int temp = p.a;
		p.a = p.b;
		p.b = temp;
	}
}