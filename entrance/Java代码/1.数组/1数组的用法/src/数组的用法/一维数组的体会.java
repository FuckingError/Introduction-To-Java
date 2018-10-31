package 数组的用法;

public class 一维数组的体会 {
	public static void main(String[] args)
	{
		int[] X = {1,2,3,4,5};
		int[] Y = {1,2,3,4,5};
		Y = X;
		for(int i=0;i<X.length;i++)
		{
			Y[i]++;
			System.out.println("X["+i+"]="+X[i]);
			System.out.println("Y["+i+"]="+Y[i]);
		}
	}
}
//如果几个数组变量同时引用同一个数组，若通过其中一个数组变量去改变数组的元素值，则数组会改变，即别的数组变量所引用的数组会变