package ������÷�;

public class һά�������� {
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
//��������������ͬʱ����ͬһ�����飬��ͨ������һ���������ȥ�ı������Ԫ��ֵ���������ı䣬�����������������õ�������