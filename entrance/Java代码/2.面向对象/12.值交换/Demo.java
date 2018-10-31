//时间：2017年3月25日12:43:12
import java.util.*;
//数组的值传递
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
//情况一：在方法中不创建新的对象，可以调换值
	public void changeValue(Person p)
	{
		int temp = p.a;
		p.a = p.b;
		p.b = temp;

	}

//情况二：在方法中创建新的对象，不能调换值
    public static void changeValue(Person p)
	{
		p = new Person();
		int temp = p.a;
		p.a = p.b;
		p.b = temp;
	}
}